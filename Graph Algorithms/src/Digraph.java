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
	
	public void addEdge(int v1, int v2) {
		Vertex vertex1 = this.getVertexWithID(v1);
		Vertex vertex2 = this.getVertexWithID(v2);
		
		vertex1.addEdgeTo(vertex2, 0);
	}
	
	public void printGraph() {
		for (Vertex vertex : this.vertexList) {
			System.out.print(vertex.getVertexID());
			for (Edge edge : vertex.edges()) {
				System.out.print("->" + edge.getEnd().getVertexID());
			}
			System.out.println();
		}
	}
}
