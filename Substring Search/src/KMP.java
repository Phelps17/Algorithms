//This substring search is based on the Knuth-Morris-Pratt algorithm
public class KMP {
	private final int R; //radix
	private int[][] automaton; //finite state machine
	private String pattern;
	
	//generate a finite state automaton for the pattern
	public KMP(String pattern) {
		this.R = 256;
		this.pattern = pattern;
		
		int m = pattern.length();
		automaton = new int[R][m];
		automaton[pattern.charAt(0)][0] = 1;
		
		for (int x = 0, j = 1; j < m; j++) {
			for (int c = 0; c < R; c++) {
				automaton[c][j] = automaton[c][x]; //copy mismatch case
			}
			
			automaton[pattern.charAt(j)][j] = j+1; //set match case
			x = automaton[pattern.charAt(j)][x]; //update the restart state
		}
	}
	
	
	public int search(String text) {
		// run through finite state machine
        int m = pattern.length();
        int n = text.length();
        int i, j;
        for (i = 0, j = 0; i < n && j < m; i++) {
            j = automaton[text.charAt(i)][j];
        }
        if (j == m) {
        	//return position
        	return i - m;
        }
        
        //not found
        return n;
	}
}
