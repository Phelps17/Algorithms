import java.util.ArrayList;

public class WeightedDirectedGraph {
	private ArrayList<Vertex> vertexList;
	
	public WeightedDirectedGraph() {
		this.vertexList = new ArrayList<Vertex>();
	}
	
	public ArrayList<Vertex> getVertexList() {
		return this.vertexList;
	}
	
	public void addVertex(int vertexID) {
		this.vertexList.add(new Vertex(vertexID));
	}
	
	public void addEdge(int v1, int v2, int weight) {
		Vertex vertex1 = getVertexWithID(v1);
		
		vertex1.addEdgeTo(v2, weight);
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
			System.out.print("[" + vertex.getVertexID() + "]");
			for (Edge edge : vertex.edges()) {
				System.out.print("--" + edge.getWeight() + "-->" + "[" + edge.getEnd() +"]");
			}
			System.out.println();
		}
	}
}
