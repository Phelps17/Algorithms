
public class SubstringSearch {
	final static String fullText = "Two households, both alike in dignity,\n"
			+ "In fair Verona, where we lay our scene,\n"
			+ "From ancient grudge break to new mutiny,\n"
			+ "Where civil blood makes civil hands unclean.\n"
			+ "From forth the fatal loins of these two foes\n"
			+ "A pair of star-cross'd lovers take their life;\n";
	final static String pattern1 = "blood";
	final static String pattern2 = "f star-cro";
	final static String pattern3 = "tears";
	final static String pattern4 = "mutiny";
	final static String pattern5 = "olds, bo";
	
	public static void main(String[] args) {
		System.out.println("=== Brute Force ===");
		
		int bruteIndex1 = BruteForce.search(pattern1, fullText);
		checkSearchResult(fullText, pattern1, bruteIndex1);
		
		int bruteIndex2 = BruteForce.search(pattern2, fullText);
		checkSearchResult(fullText, pattern2, bruteIndex2);
		
		int bruteIndex3 = BruteForce.search(pattern3, fullText);
		checkSearchResult(fullText, pattern3, bruteIndex3);
		
		int bruteIndex4 = BruteForce.search(pattern4, fullText);
		checkSearchResult(fullText, pattern4, bruteIndex4);
		
		int bruteIndex5 = BruteForce.search(pattern5, fullText);
		checkSearchResult(fullText, pattern5, bruteIndex5);
		
		System.out.println("--------------------------------------------------");
		System.out.println("=== KMP Search ===");
		
		KMP kmpAutomaton1 = new KMP(pattern1);
		int kmpIndex1 = kmpAutomaton1.search(fullText);
		checkSearchResult(fullText, pattern1, kmpIndex1);
		
		KMP kmpAutomaton2 = new KMP(pattern2);
		int kmpIndex2 = kmpAutomaton2.search(fullText);
		checkSearchResult(fullText, pattern2, kmpIndex2);
		
		KMP kmpAutomaton3 = new KMP(pattern3);
		int kmpIndex3 = kmpAutomaton3.search(fullText);
		checkSearchResult(fullText, pattern3, kmpIndex3);
		
		KMP kmpAutomaton4 = new KMP(pattern4);
		int kmpIndex4 = kmpAutomaton4.search(fullText);
		checkSearchResult(fullText, pattern4, kmpIndex4);
		
		KMP kmpAutomaton5 = new KMP(pattern5);
		int kmpIndex5 = kmpAutomaton5.search(fullText);
		checkSearchResult(fullText, pattern5, kmpIndex5);
		
		System.out.println("--------------------------------------------------");
		System.out.println("=== Boyer Moore ===");

		BoyerMoore bm1 = new BoyerMoore(pattern1);
		int bmIndex1 = bm1.search(fullText);
		checkSearchResult(fullText, pattern1, bmIndex1);

		BoyerMoore bm2 = new BoyerMoore(pattern2);
		int bmIndex2 = bm2.search(fullText);
		checkSearchResult(fullText, pattern2, bmIndex2);

		BoyerMoore bm3 = new BoyerMoore(pattern3);
		int bmIndex3 = bm3.search(fullText);
		checkSearchResult(fullText, pattern3, bmIndex3);

		BoyerMoore bm4 = new BoyerMoore(pattern4);
		int bmIndex4 = bm4.search(fullText);
		checkSearchResult(fullText, pattern4, bmIndex4);
		
		BoyerMoore bm5 = new BoyerMoore(pattern5);
		int bmIndex5 = bm5.search(fullText);
		checkSearchResult(fullText, pattern5, bmIndex5);
		
	}
	
	public static void checkSearchResult(String fullText, String pattern, int index) {
		if (index >= fullText.length()) {
			System.out.println("Pattern not found in text.");
			return;
		}
		
		System.out.print("Looking for '" + pattern + "' and found '");
		
		for (int i = 0; i < pattern.length(); i++) {
			System.out.print(fullText.charAt(index+i));
		}
		
		System.out.print("'.\n");
	}
}
