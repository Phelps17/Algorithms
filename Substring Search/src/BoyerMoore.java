//this substring search is based on the Boyer-Moore algorithm

public class BoyerMoore {
	private final int symbolsInAlphabet;
    private int[] right; //character skip array
    private String pattern;

    public BoyerMoore(String pattern) {
        this.symbolsInAlphabet = 256; //default ascii2 amount
        this.pattern = pattern;

        right = new int[symbolsInAlphabet];
        for (int charIndex = 0; charIndex < symbolsInAlphabet; charIndex++) {
        	right[charIndex] = -1;
        }  
        for (int j = 0; j < pattern.length(); j++) {
        	right[pattern.charAt(j)] = j;
        }
    }

    public int search(String fullText) {
        int m = pattern.length();
        int n = fullText.length();
        int skip;
        
        for (int i = 0; i <= n - m; i += skip) {
            skip = 0;
            for (int j = m-1; j >= 0; j--) {
                if (pattern.charAt(j) != fullText.charAt(i+j)) {
                    skip = Math.max(1, j - right[fullText.charAt(i+j)]);
                    break;
                }
            }
            
            if (skip == 0) {
            	//return index of the word
            	return i;
            }
        }
        
        //not found
        return n;
    }
}