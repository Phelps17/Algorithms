import java.util.ArrayList;

public class Vertex {
	private ArrayList<Edge> edges;
	private int vertexID;
	private boolean marked;
	
	public Vertex(int id) {
		this.edges = new ArrayList<Edge>();
		this.vertexID = id;
		this.marked = false;
	}
	
	public int getVertexID() {
		return this.vertexID;
	}
	
	public ArrayList<Edge> edges() {
		return this.edges;
	}
	
	public void addEdgeTo(Vertex otherVertex, int weight) {
		Edge newEdge = new Edge(this, otherVertex, weight);
		this.edges.add(newEdge);
	}
	
	public void removeEdgeTo(int otherVertexID) {
		this.edges.remove(otherVertexID);
	}
	
	public boolean isMarked() {
		return this.marked;
	}
	
	public void mark() {
		this.marked = true;
	}
	
	public void unmark() {
		this.marked = false;
	}
}
