
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
	
	public static void main(String[] args) {
		int bruteIndex1 = BruteForce.search(pattern1, fullText);
		checkSearchResult(fullText, pattern1, bruteIndex1);
		
		int bruteIndex2 = BruteForce.search(pattern2, fullText);
		checkSearchResult(fullText, pattern2, bruteIndex2);
		
		int bruteIndex3 = BruteForce.search(pattern3, fullText);
		checkSearchResult(fullText, pattern3, bruteIndex3);
		
		int bruteIndex4 = BruteForce.search(pattern4, fullText);
		checkSearchResult(fullText, pattern4, bruteIndex4);
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
