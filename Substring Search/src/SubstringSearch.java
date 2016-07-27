
public class SubstringSearch {
	final static String fullText = "Two households, both alike in dignity,\n"
			+ "In fair Verona, where we lay our scene,\n"
			+ "From ancient grudge break to new mutiny,\n"
			+ "Where civil blood makes civil hands unclean.\n"
			+ "From forth the fatal loins of these two foes\n"
			+ "A pair of star-cross'd lovers take their life;\n";
	
	public static void main(String[] args) {
		System.out.println(BruteForce.search("blood", fullText));
	}
}
