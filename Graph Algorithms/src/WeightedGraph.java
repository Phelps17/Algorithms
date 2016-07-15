import java.util.ArrayList;

public class WeightedGraph {
	private ArrayList<Vertex> vertexList;
	
	public WeightedGraph() {
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
		Vertex vertex2 = getVertexWithID(v2);
		
		vertex1.addEdgeTo(vertex2.getVertexID(), weight);
		vertex2.addEdgeTo(vertex1.getVertexID(), weight);
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