import java.util.ArrayList;

public class Vertex {
	private ArrayList<Integer> edges;
	private int vertexID;
	
	public Vertex(int id) {
		this.edges = new ArrayList<Integer>();
		this.vertexID = id;
	}
	
	public int getVertexID() {
		return this.vertexID;
	}
	
	public ArrayList<Integer> edges() {
		return this.edges;
	}
	
	public void addEdge(int otherVertexID) {
		this.edges.add(otherVertexID);
	}
	
	public void removeEdge(int otherVertexID) {
		this.edges.remove(otherVertexID);
	}
}
