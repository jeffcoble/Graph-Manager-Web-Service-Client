
package org.engineeringnotebook.graphmanagerservice.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "GraphManagerWSEndpoint", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GraphManagerWSEndpoint {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns org.engineeringnotebook.graphmanagerservice.ws.Edge
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getEdge", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.GetEdge")
    @ResponseWrapper(localName = "getEdgeResponse", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.GetEdgeResponse")
    public Edge getEdge(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addEdge", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.AddEdge")
    @ResponseWrapper(localName = "addEdgeResponse", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.AddEdgeResponse")
    public String addEdge(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "graphTest", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.GraphTest")
    @ResponseWrapper(localName = "graphTestResponse", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.GraphTestResponse")
    public String graphTest(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createGraph", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.CreateGraph")
    @ResponseWrapper(localName = "createGraphResponse", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.CreateGraphResponse")
    public String createGraph(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteGraph", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.DeleteGraph")
    @ResponseWrapper(localName = "deleteGraphResponse", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.DeleteGraphResponse")
    public boolean deleteGraph(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addVertex", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.AddVertex")
    @ResponseWrapper(localName = "addVertexResponse", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.AddVertexResponse")
    public String addVertex(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns org.engineeringnotebook.graphmanagerservice.ws.Vertex
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getVertex", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.GetVertex")
    @ResponseWrapper(localName = "getVertexResponse", targetNamespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", className = "org.engineeringnotebook.graphmanagerservice.ws.GetVertexResponse")
    public Vertex getVertex(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}
