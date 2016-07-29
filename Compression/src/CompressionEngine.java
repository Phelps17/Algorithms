
public class CompressionEngine {
	public static void main(String[] args) {
		if (args[0].equals("compress")) {
			LZW.compress();
		}
		else if (args[0].equals("expand")) {
			LZW.expand();
		}
		else {
			throw new IllegalArgumentException("Illegal command line argument.");
		}
	}
}
