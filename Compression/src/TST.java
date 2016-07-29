// symbol table with string keys, implemented using a ternary search trie (TST)
// represents a symbol table of key-value pairs with strign keys and generic value

public class TST<Value> {
	private int N; //size
	private Node<Value> root; //root of TST
	
	private static class Node<Value> {
		private char c; //character
		private Node<Value> left, mid, right; //sub-tries
		private Value val; //value associated with string
	}
	
	public TST() {}
	
	private int size() {
		return N;
	}
	
	public boolean contains(String key) {
		return get(key) != null;
	}
	
	public Value get(String key) {
		return null;
	}
	
	private Node<Value> get(Node<Value> x, String key, int d) {
		return null;
	}
	
	public void put(String key, Value val) {
		
	}
	
	private Node<Value> put(Node<Value> x, String key, Value val, int d) {
		return null;
	}
	
	public String longestPrefixOf(String query) {
		return null;
	}
	
	public Iterable<String> keys() {
		return null;
	}
	
	public Iterable<String> keyWithPrefix(String prefix) {
		return null;
	}
	
	public void collect(Node<Value> x, StringBuilder prefix, Queue<String> queu) {
		
	}
	
	public Iterable<String> keysThatMatch(String pattern) {
		return null;
	}
	
	private void collect(Node<Value> x, StringBuilder prefix, int i, String pattern, Queue<String> queue) {
		
	}
}
