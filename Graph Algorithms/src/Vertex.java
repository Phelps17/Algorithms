import java.util.ArrayList;

public class Vertex {
	private ArrayList<Edge> edges;
	private int vertexID;
	
	public Vertex(int id) {
		this.edges = new ArrayList<Edge>();
		this.vertexID = id;
	}
	
	public int getVertexID() {
		return this.vertexID;
	}
	
	public ArrayList<Edge> edges() {
		return this.edges;
	}
	
	public void addEdgeTo(int otherVertexID, int weight) {
		Edge newEdge = new Edge(this.vertexID, otherVertexID, weight);
		this.edges.add(newEdge);
	}
	
	public void removeEdgeTo(int otherVertexID) {
		this.edges.remove(otherVertexID);
	}
}
