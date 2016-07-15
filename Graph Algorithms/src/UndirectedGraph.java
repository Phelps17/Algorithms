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
		Vertex vertex1 = this.getVertexWithID(v1);
		Vertex vertex2 = this.getVertexWithID(v2);
		
		vertex1.addEdgeTo(vertex2, 0);
		vertex2.addEdgeTo(vertex1, 0);
	}
	
	public Vertex getVertexWithID(int id) {
		for (Vertex vertex : this.vertexList) {
			if (vertex.getVertexID() == id) {
				return vertex;
			}
		}
		
		return null;
	}
	
	public boolean dfsPathTo(Vertex startVertex, Vertex endVertex) {
		for (Vertex vertex : this.getVertexList()) {
			vertex.unmark();
		}
		
		return this._dfsPathTo(startVertex, endVertex);
	}
	
	public boolean _dfsPathTo(Vertex startVertex, Vertex endVertex) {
		startVertex.mark();
		
		if (startVertex.equals(endVertex)) return true;
		
		for (Edge edge : startVertex.edges()) {
			if (!edge.getEnd().isMarked()) {
				if (this._dfsPathTo(edge.getEnd(), endVertex)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void printGraph() {
		for (Vertex vertex : this.vertexList) {
			System.out.print("[" + vertex.getVertexID() + "]");
			for (Edge edge : vertex.edges()) {
				System.out.print(" -> [" + edge.getEnd().getVertexID() + "]");
			}
			System.out.println();
		}
	}
}
