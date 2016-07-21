
public class StringSorts {
	public static void main(String args[]) {
		String array[] = {"help", "live", "love", "line", "bars", "cars", "held", "fire"};
		LSDRadixSort.sort(array, 4);
		printArray(array);
		
		String[] array2 = {"helping", "lives", "lovers", "lit", "bars", "car", "holding", "firey", "bar"};
		MSDRadixSort.sort(array2);
		printArray(array2);
		
		String[] array3 = {"She", "sells", "seashells", "by", "the", "seashore",
							"Peter", "Piper", "picked", "a", "peck", "of", "pickled", "peppers",
							"Betty", "Botter", "bought", "some", "butter", "But", "she", "said", "the", "butter’s", "bitter",
							"How", "much", "wood", "would", "a", "woodchuck", "chuck", "if", "a", "woodchuck", "could", "chuck", "wood",
							"Fuzzy", "Wuzzy", "was", "a", "bear", "Fuzzy", "Wuzzy", "had", "no", "hair", "Fuzzy", "Wuzzy", "wasn’t", "fuzzy", "was", "he",
							"You", "know", "New", "York", "you", "need", "New", "York", "you", "know", "you", "need", "unique", "New", "York"};

		MSDRadixSort.sort(array3);
		printArray(array3);
	}
	
	private static void printArray(String array[]) {
		System.out.println();
		for (String word : array) {
			System.out.println(word);
		}
	}
}
