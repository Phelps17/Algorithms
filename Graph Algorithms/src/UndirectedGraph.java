import java.util.ArrayList;

public class UndirectedGraph {
	private ArrayList<Vertex> vertexList;
	
	public UndirectedGraph() {
		this.vertexList = new ArrayList<Vertex>();
	}
	
	public ArrayList<Vertex> getVertexList() {
		return this.vertexList;
	}
	
	public void addVertex(int vertexID) {
		this.vertexList.add(new Vertex(vertexID));
	}
	
	public void addEdge(int v1, int v2) {
		Vertex vertex1 = getVertexWithID(v1);
		Vertex vertex2 = getVertexWithID(v2);
		
		vertex1.addEdge(vertex2.getVertexID());
		vertex2.addEdge(vertex1.getVertexID());
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
			for (int edge : vertex.edges()) {
				System.out.print("->" + edge);
			}
			System.out.println();
		}
	}
}
