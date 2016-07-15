
public class Edge {
	private int weight;
	private Vertex start, end;
	
	public Edge(Vertex start, Vertex end, int weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}
	
	public Vertex getStart() {
		return this.start;
	}
	
	public Vertex getEnd() {
		return this.end;
	}
	
	public int getWeight() {
		return this.weight;
	}
}
