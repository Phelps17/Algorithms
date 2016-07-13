
public class Main {
	public static void main(String[] args) {
		UndirectedGraph graph = new UndirectedGraph();
		for (int i = 0; i < 10; i++) {
			graph.addVertex(i);
		}
		
		graph.addEdge(0, 2);
		graph.addEdge(0, 3);
		graph.addEdge(3, 1);
		graph.addEdge(5, 4);
		
		graph.printGraph();
		System.out.println("DONE");
	}
}
