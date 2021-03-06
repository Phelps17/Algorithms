
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
		graph.addEdge(2, 2);
		graph.addEdge(3, 3);
		graph.addEdge(8, 1);
		graph.addEdge(9, 4);
		graph.addEdge(9, 2);
		graph.addEdge(8, 3);
		graph.addEdge(7, 1);
		graph.addEdge(7, 4);
		System.out.println("Undirected Graph:");
		graph.printGraph();
		System.out.println(graph.dfsPathTo(graph.getVertexWithID(3), graph.getVertexWithID(9)));
		System.out.println();
		
		Digraph digraph = new Digraph();
		for (int i = 0; i < 10; i++) {
			digraph.addVertex(i);
		}
		
		digraph.addEdge(0, 2);
		digraph.addEdge(0, 3);
		digraph.addEdge(3, 1);
		digraph.addEdge(5, 4);
		digraph.addEdge(2, 2);
		digraph.addEdge(3, 3);
		digraph.addEdge(8, 1);
		digraph.addEdge(9, 4);
		digraph.addEdge(9, 2);
		digraph.addEdge(8, 3);
		digraph.addEdge(7, 1);
		digraph.addEdge(7, 4);
		digraph.addEdge(1, 2);
		digraph.addEdge(2, 9);
		System.out.println("Digraph:");
		digraph.printGraph();
		System.out.println(digraph.dfsPathTo(digraph.getVertexWithID(7), digraph.getVertexWithID(6)));
		System.out.println();
		
		/*WeightedGraph wgraph = new WeightedGraph();
		for (int i = 0; i < 10; i++) {
			wgraph.addVertex(i);
		}
		
		wgraph.addEdge(0, 2, 1);
		wgraph.addEdge(0, 3, 2);
		wgraph.addEdge(3, 1, 3);
		wgraph.addEdge(5, 4, 4);
		wgraph.addEdge(2, 2, 5);
		wgraph.addEdge(3, 3, 6);
		wgraph.addEdge(8, 1, 7);
		wgraph.addEdge(9, 4, 8);
		wgraph.addEdge(9, 2, 9);
		wgraph.addEdge(8, 3, 10);
		wgraph.addEdge(7, 1, 11);
		wgraph.addEdge(7, 4, 12);
		System.out.println("Weighted Graph:");
		wgraph.printGraph();
		System.out.println();
		
		WeightedDirectedGraph wdgraph = new WeightedDirectedGraph();
		for (int i = 0; i < 10; i++) {
			wdgraph.addVertex(i);
		}
		
		wdgraph.addEdge(0, 2, 1);
		wdgraph.addEdge(0, 3, 2);
		wdgraph.addEdge(3, 1, 3);
		wdgraph.addEdge(5, 4, 4);
		wdgraph.addEdge(2, 2, 5);
		wdgraph.addEdge(3, 3, 6);
		wdgraph.addEdge(8, 1, 7);
		wdgraph.addEdge(9, 4, 8);
		wdgraph.addEdge(9, 2, 9);
		wdgraph.addEdge(8, 3, 10);
		wdgraph.addEdge(7, 1, 11);
		wdgraph.addEdge(7, 4, 12);
		System.out.println("Weighted Directed Graph:");
		wdgraph.printGraph();
		System.out.println();*/
	}
}
