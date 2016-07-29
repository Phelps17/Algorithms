// Compression engine based on the LZW algorithm 
// Note: substring-ing now takes length of the substring word time rather than constant time
// Thank Java 6 -> Java 7 update for that

public class LZW {
	private static final int ASCII_SYMBOLS = 256;
	private static final int NUM_CODEWORDS = 4096; // 2^(codeword width)
	private static final int CODEWORD_WIDTH = 12;
	
	private LZW() {}
	
	public static void compress() {
		
	}
	
	public static void expand() {
		
	}
}
