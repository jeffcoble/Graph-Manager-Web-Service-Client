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
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import javax.ws.rs.core.MultivaluedMap;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import javax.ws.rs.core.MediaType;
import java.util.logging.Logger;
import java.util.logging.Level;

// TODO: Auto-generated Javadoc
/**
 * The Class GraphBuilder.
 *
 * @author Jeffrey Coble <jeffrey.a.coble@gmail.com> http://engineeringnotebook.org
 */
public class GraphBuilder {
  
 /** The Constant logger. */
 private static final Logger logger = Logger.getLogger(GraphClientRS.class.getName()); 
 
 /** The rest client. */
 private Client restClient;
 
 /** The base url. */
 private String baseURL;
 
 /**
  * Instantiates a new graph builder.
  *
  * @param client the client
  * @param baseURL the base url
  */
 public GraphBuilder(Client client, String baseURL) {
   this.restClient = client;
   this.baseURL = baseURL;
 }
 
 /**
  * Creates the graph.
  *
  * @param graphName the human-readable name of the graph
  * @return the graph's URI
  */
 public String createGraph(String graphName) {
   
   MultivaluedMap<String, String> params = new MultivaluedMapImpl();
   
   params.add("graphname", graphName);
   
   //Construct the resource and perform the POST operation
   WebResource webResource = restClient.resource(baseURL);
   webResource.accept(MediaType.TEXT_XML);
   ClientResponse response = webResource.queryParams(params).post(ClientResponse.class);
  
   int status = response.getStatus();
   logger.log(Level.FINEST, "createGraph Status =  {0}", new Object[]{status});

   String textEntity = response.getEntity(String.class);
   logger.log(Level.FINEST, "createGraph Response =  {0}", new Object[]{textEntity});

   return textEntity;
  
 }
 
 /**
  * Delete graph.
  *
  * @param graphID the graph id
  * @return the HTTP response code
  */
 public int deleteGraph(String graphID) {
      
   //Construct the resource and perform the DELETE operation
   
   WebResource webResource = restClient.resource(baseURL).path(graphID);
   webResource.accept(MediaType.TEXT_XML);
   ClientResponse response = webResource.delete(ClientResponse.class);
  
   int status = response.getStatus();
   logger.log(Level.FINEST, "deleteGraph Status =  {0}", new Object[]{status});

   String textEntity = response.getEntity(String.class);
   logger.log(Level.FINEST, "deleteGraph Response =  {0}", new Object[]{textEntity});

   return status; 
 }
 
 /**
  * Adds the vertex.
  *
  * @param graphID the graph id
  * @param vertexName the vertex name
  * @return the string
  */
 public String addVertex(String graphID, String vertexName) {
    
    MultivaluedMap<String, String> params = new MultivaluedMapImpl();
 
    params.add("vertexname", vertexName);
        
    //Construct the resource and perform the POST operation
    WebResource webResource = restClient.resource(baseURL).path(graphID).path("vertex");
    webResource.accept(MediaType.TEXT_XML);
    ClientResponse response = webResource.queryParams(params).post(ClientResponse.class);
   
    int status = response.getStatus();
    logger.log(Level.FINEST, "addVertex Status =  {0}", new Object[]{status});

    String textEntity = response.getEntity(String.class);
    logger.log(Level.FINEST, "addVertex Response =  {0}", new Object[]{textEntity});

    return textEntity;
  }
  
  /**
   * Adds the edge.
   *
   * @param graphID the graph id
   * @param edgeName the edge name
   * @param vertex1ID the vertex1 id
   * @param vertex2ID the vertex2 id
   * @return the string
   */
  public String addEdge(String graphID, String edgeName, String vertex1ID, String vertex2ID) {
    
    MultivaluedMap<String, String> params = new MultivaluedMapImpl();
    
    params.add("edgename", edgeName);
    params.add("vertex1", vertex1ID);
    params.add("vertex2", vertex2ID);
       
    //Construct the resource and perform the POST operation
    WebResource webResource = restClient.resource(baseURL).path(graphID).path("edge");
    webResource.accept(MediaType.TEXT_XML);
    ClientResponse response = webResource.queryParams(params).post(ClientResponse.class);

    int status = response.getStatus();
    logger.log(Level.FINEST, "addEdge Status =  {0}", new Object[]{status});

    String textEntity = response.getEntity(String.class);
    logger.log(Level.FINEST, "addEdge Response =  {0}", new Object[]{textEntity});

    return textEntity;
  }
  
  /**
   * Gets the vertex.
   *
   * @param graphID the graph id
   * @param vertexID the vertex id
   * @param format the format
   * @return the vertex
   */
  public String getVertex(String graphID, String vertexID, String format) {
 
    WebResource webResource = null;
    
    //Construct the resource and perform the GET operation
    if(format.equals("json")) {
      webResource = restClient.resource(baseURL).path(graphID).path("vertex").path(vertexID + ".json");
      webResource.accept(MediaType.APPLICATION_JSON);
    }
    else if(format.equals("xml")) {
      webResource = restClient.resource(baseURL).path(graphID).path("vertex").path(vertexID + ".xml");
      webResource.accept(MediaType.APPLICATION_XML);
    }
      
    ClientResponse response = webResource.get(ClientResponse.class);
    
    int status = response.getStatus();
    logger.log(Level.FINEST, "getVertex Status =  {0}", new Object[]{status});

    String textEntity = response.getEntity(String.class);
    logger.log(Level.FINEST, "getVertex Response =  {0}", new Object[]{textEntity});

    return textEntity;  
  }
    
}
