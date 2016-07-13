
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
		System.out.println("Undirected Graph:");
		graph.printGraph();
		System.out.println();
		
		Digraph digraph = new Digraph();
		for (int i = 0; i < 10; i++) {
			digraph.addVertex(i);
		}
		
		digraph.addEdge(0, 2);
		digraph.addEdge(0, 3);
		digraph.addEdge(3, 1);
		digraph.addEdge(5, 4);
		System.out.println("Digraph:");
		digraph.printGraph();
		System.out.println();
	}
}
