/*
 * Copyright 2011 Jeffrey Coble <jeffrey.a.coble@gmail.com> http://engineeringnotebook.org.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.engineeringnotebook.graphmanagerservice.rs.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import java.util.logging.Logger;
import java.util.logging.Level;

import org.engineeringnotebook.graphmanagerservice.rs.client.GraphBuilder;

// TODO: Auto-generated Javadoc
/**
 * The Class GraphClientRS.
 *
 * @author Jeffrey Coble <jeffrey.a.coble@gmail.com> http://engineeringnotebook.org
 * 
 * A client for the RESTful service interface
 */
public class GraphClientRS {
  
  /** The rest client. */
  private Client restClient = null;
  
  /** The Constant baseURL. */
  private static final String baseURL = "http://localhost:8080/GraphManagerService/resources/graph/";
  
  /** The Constant logger. */
  private static final Logger logger = Logger.getLogger(GraphClientRS.class.getName());
  
 
 /**
  * Parses the id.
  *
  * @param URI the uRI
  * @return the string
  */
 private String parseID(String URI) {
    
    int i = URI.lastIndexOf('/');
    String ID = URI.substring(i+1);
    
    return ID;
  }  
 
  /**
   * Go.
   */
  public void go() {
    String graphURI;
    String graphID;
    String vertexURI;   
    GraphBuilder gb; 
    
    ClientConfig clientConfig = new DefaultClientConfig();
    clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
    
    //restClient = Client.create();
    restClient = Client.create(clientConfig);
    gb = new GraphBuilder(restClient, baseURL);
    
    System.out.println("********* START **********");
    
    graphURI = gb.createGraph("mygraph1");
    graphID = parseID(graphURI);
    System.out.println("Created graph URI = " + graphURI + " graph ID = " + graphID);
    
    //int status = gb.deleteGraph(graphID);
    //System.out.println("Deleted graph.  Status = " + status);
    
    vertexURI = gb.addVertex(graphID, "vertex1");
    System.out.println("vertex 1 URI = " + vertexURI);
    String vertex1ID = parseID(vertexURI);
    System.out.println("vertex1ID = " + vertex1ID);
    vertexURI = gb.addVertex(graphID, "vertex2");
    System.out.println("vertex 2 URI = " + vertexURI);
    String vertex2ID = parseID(vertexURI);
    System.out.println("vertex2ID = " + vertex2ID);
    String edgeURI = gb.addEdge(graphID, "edge1", vertex1ID, vertex2ID);
    System.out.println("edge URI = " + edgeURI);
    String edgeID = parseID(edgeURI);
    System.out.println("edgeID = " + edgeID);
    
    System.out.println("********* END **********");
    
    String vertexXML = gb.getVertex(graphID, vertex2ID, "xml");
    System.out.println("***XML***");
    System.out.println(vertexXML);
    System.out.println();
    System.out.println("***JSON***");
    String vertexJSON = gb.getVertex(graphID, vertex2ID, "json");
    System.out.println(vertexJSON);    
    
  }
  
  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    GraphClientRS gClient = new GraphClientRS();
    gClient.go();

}
  
}
