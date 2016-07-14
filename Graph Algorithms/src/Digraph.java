import java.util.ArrayList;

public class Digraph {
	private ArrayList<Vertex> vertexList;
	
	public Digraph() {
		this.vertexList = new ArrayList<Vertex>();
	}
	
	public ArrayList<Vertex> getVertexList() {
		return this.vertexList;
	}
	
	public void addVertex(int vertexID) {
		this.vertexList.add(new Vertex(vertexID));
	}
	
	public void addEdge(int start_vertex, int end_vertex) {
		Vertex vertex1 = getVertexWithID(start_vertex);
		
		vertex1.addEdgeTo(end_vertex, 0);
	}
	
	public Vertex getVertexWithID(int id) {
		for (Vertex vertex : this.vertexList) {
			if (vertex.getVertexID() == id) {
				return vertex;
			}
		}
		
		return null;
	}
	
	public void printGraph() {
		for (Vertex vertex : this.vertexList) {
			System.out.print(vertex.getVertexID());
			for (Edge edge : vertex.edges()) {
				System.out.print("->" + edge.getEnd());
			}
			System.out.println();
		}
	}
}
