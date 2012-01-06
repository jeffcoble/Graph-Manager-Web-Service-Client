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

package org.engineeringnotebook.graphmanagerservice.ws.client;

import org.engineeringnotebook.graphmanagerservice.ws.GraphManagerWSEndpointImplService;
import org.engineeringnotebook.graphmanagerservice.ws.GraphManagerWSEndpoint;
import org.engineeringnotebook.graphmanagerservice.ws.Vertex;
import org.engineeringnotebook.graphmanagerservice.ws.Edge;

// TODO: Auto-generated Javadoc
/**
 * The Class GraphClientWS.
 */
public class GraphClientWS {
  
  /** The proxy. */
  GraphManagerWSEndpoint proxy = null;
  
  /**
   * Initialize WS proxy.
   */
  private void initializeWSProxy() {
    //Create Service
    GraphManagerWSEndpointImplService service = new GraphManagerWSEndpointImplService();

    //create client-side proxy for the Web Service
    proxy = service.getGraphManagerWSEndpointImplPort();     
  }

  /**
   * Builds the graph.
   */
  public void buildGraph() {
    initializeWSProxy();
    
    //create a graph
    String graphID = proxy.createGraph("mygraph2");
    System.out.println("Created Graph: " + graphID);
    
    //create vertexAlpha
    String vertexAlphaID = proxy.addVertex(graphID, "vertexAlpha");
    //create vertexBeta
    String vertexBetaID = proxy.addVertex(graphID, "vertexBeta");
    //add an edge between vertexAlpha and vertexBeta
    proxy.addEdge(graphID, "edgeDelta", vertexAlphaID, vertexBetaID);
    
    //retrieve vertex 
    Vertex v = proxy.getVertex(graphID, vertexAlphaID);
    System.out.println("Vertex Name: " + v.getLabel());
    System.out.println("Vertex ID: " + v.getID());
  }
	
  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    GraphClientWS graphClient = new GraphClientWS();
    graphClient.buildGraph();

  }
}
