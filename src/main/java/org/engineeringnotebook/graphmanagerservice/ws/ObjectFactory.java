
package org.engineeringnotebook.graphmanagerservice.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.engineeringnotebook.graphmanagerservice.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GraphTest_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "graphTest");
    private final static QName _Edge_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "edge");
    private final static QName _CreateGraphResponse_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "createGraphResponse");
    private final static QName _DeleteGraphResponse_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "deleteGraphResponse");
    private final static QName _GetVertex_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "getVertex");
    private final static QName _GraphTestResponse_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "graphTestResponse");
    private final static QName _CreateGraph_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "createGraph");
    private final static QName _DeleteGraph_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "deleteGraph");
    private final static QName _GetEdge_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "getEdge");
    private final static QName _GetVertexResponse_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "getVertexResponse");
    private final static QName _AddVertexResponse_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "addVertexResponse");
    private final static QName _AddEdge_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "addEdge");
    private final static QName _AddEdgeResponse_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "addEdgeResponse");
    private final static QName _Vertex_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "vertex");
    private final static QName _AddVertex_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "addVertex");
    private final static QName _GetEdgeResponse_QNAME = new QName("http://ws.graphmanagerservice.engineeringnotebook.org/", "getEdgeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.engineeringnotebook.graphmanagerservice.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GraphTest }
     * 
     */
    public GraphTest createGraphTest() {
        return new GraphTest();
    }

    /**
     * Create an instance of {@link GraphTestResponse }
     * 
     */
    public GraphTestResponse createGraphTestResponse() {
        return new GraphTestResponse();
    }

    /**
     * Create an instance of {@link AddEdge }
     * 
     */
    public AddEdge createAddEdge() {
        return new AddEdge();
    }

    /**
     * Create an instance of {@link GetVertexResponse }
     * 
     */
    public GetVertexResponse createGetVertexResponse() {
        return new GetVertexResponse();
    }

    /**
     * Create an instance of {@link Vertex }
     * 
     */
    public Vertex createVertex() {
        return new Vertex();
    }

    /**
     * Create an instance of {@link GetEdgeResponse }
     * 
     */
    public GetEdgeResponse createGetEdgeResponse() {
        return new GetEdgeResponse();
    }

    /**
     * Create an instance of {@link CreateGraphResponse }
     * 
     */
    public CreateGraphResponse createCreateGraphResponse() {
        return new CreateGraphResponse();
    }

    /**
     * Create an instance of {@link AddEdgeResponse }
     * 
     */
    public AddEdgeResponse createAddEdgeResponse() {
        return new AddEdgeResponse();
    }

    /**
     * Create an instance of {@link DeleteGraph }
     * 
     */
    public DeleteGraph createDeleteGraph() {
        return new DeleteGraph();
    }

    /**
     * Create an instance of {@link GetEdge }
     * 
     */
    public GetEdge createGetEdge() {
        return new GetEdge();
    }

    /**
     * Create an instance of {@link Edge }
     * 
     */
    public Edge createEdge() {
        return new Edge();
    }

    /**
     * Create an instance of {@link DeleteGraphResponse }
     * 
     */
    public DeleteGraphResponse createDeleteGraphResponse() {
        return new DeleteGraphResponse();
    }

    /**
     * Create an instance of {@link AddVertexResponse }
     * 
     */
    public AddVertexResponse createAddVertexResponse() {
        return new AddVertexResponse();
    }

    /**
     * Create an instance of {@link GetVertex }
     * 
     */
    public GetVertex createGetVertex() {
        return new GetVertex();
    }

    /**
     * Create an instance of {@link CreateGraph }
     * 
     */
    public CreateGraph createCreateGraph() {
        return new CreateGraph();
    }

    /**
     * Create an instance of {@link AddVertex }
     * 
     */
    public AddVertex createAddVertex() {
        return new AddVertex();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraphTest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "graphTest")
    public JAXBElement<GraphTest> createGraphTest(GraphTest value) {
        return new JAXBElement<GraphTest>(_GraphTest_QNAME, GraphTest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Edge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "edge")
    public JAXBElement<Edge> createEdge(Edge value) {
        return new JAXBElement<Edge>(_Edge_QNAME, Edge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGraphResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "createGraphResponse")
    public JAXBElement<CreateGraphResponse> createCreateGraphResponse(CreateGraphResponse value) {
        return new JAXBElement<CreateGraphResponse>(_CreateGraphResponse_QNAME, CreateGraphResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGraphResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "deleteGraphResponse")
    public JAXBElement<DeleteGraphResponse> createDeleteGraphResponse(DeleteGraphResponse value) {
        return new JAXBElement<DeleteGraphResponse>(_DeleteGraphResponse_QNAME, DeleteGraphResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVertex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "getVertex")
    public JAXBElement<GetVertex> createGetVertex(GetVertex value) {
        return new JAXBElement<GetVertex>(_GetVertex_QNAME, GetVertex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GraphTestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "graphTestResponse")
    public JAXBElement<GraphTestResponse> createGraphTestResponse(GraphTestResponse value) {
        return new JAXBElement<GraphTestResponse>(_GraphTestResponse_QNAME, GraphTestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateGraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "createGraph")
    public JAXBElement<CreateGraph> createCreateGraph(CreateGraph value) {
        return new JAXBElement<CreateGraph>(_CreateGraph_QNAME, CreateGraph.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteGraph }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "deleteGraph")
    public JAXBElement<DeleteGraph> createDeleteGraph(DeleteGraph value) {
        return new JAXBElement<DeleteGraph>(_DeleteGraph_QNAME, DeleteGraph.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEdge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "getEdge")
    public JAXBElement<GetEdge> createGetEdge(GetEdge value) {
        return new JAXBElement<GetEdge>(_GetEdge_QNAME, GetEdge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVertexResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "getVertexResponse")
    public JAXBElement<GetVertexResponse> createGetVertexResponse(GetVertexResponse value) {
        return new JAXBElement<GetVertexResponse>(_GetVertexResponse_QNAME, GetVertexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVertexResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "addVertexResponse")
    public JAXBElement<AddVertexResponse> createAddVertexResponse(AddVertexResponse value) {
        return new JAXBElement<AddVertexResponse>(_AddVertexResponse_QNAME, AddVertexResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEdge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "addEdge")
    public JAXBElement<AddEdge> createAddEdge(AddEdge value) {
        return new JAXBElement<AddEdge>(_AddEdge_QNAME, AddEdge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEdgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "addEdgeResponse")
    public JAXBElement<AddEdgeResponse> createAddEdgeResponse(AddEdgeResponse value) {
        return new JAXBElement<AddEdgeResponse>(_AddEdgeResponse_QNAME, AddEdgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Vertex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "vertex")
    public JAXBElement<Vertex> createVertex(Vertex value) {
        return new JAXBElement<Vertex>(_Vertex_QNAME, Vertex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddVertex }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "addVertex")
    public JAXBElement<AddVertex> createAddVertex(AddVertex value) {
        return new JAXBElement<AddVertex>(_AddVertex_QNAME, AddVertex.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEdgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.graphmanagerservice.engineeringnotebook.org/", name = "getEdgeResponse")
    public JAXBElement<GetEdgeResponse> createGetEdgeResponse(GetEdgeResponse value) {
        return new JAXBElement<GetEdgeResponse>(_GetEdgeResponse_QNAME, GetEdgeResponse.class, null, value);
    }

}
