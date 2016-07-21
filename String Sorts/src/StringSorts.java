
public class StringSorts {
	public static void main(String args[]) {
		String array[] = {"help", "live", "love", "line", "bars", "cars", "held", "fire"};
		printArray(array);
		LSDRadixSort.sort(array, 4);
		printArray(array);
		
		String[] array2 = {"helping", "lives", "lovers", "lit", "bars", "car", "holding", "firey", "bar"};
		printArray(array2);
		MSDRadixSort.sort(array2);
		printArray(array2);
	}
	
	private static void printArray(String array[]) {
		System.out.println();
		for (String word : array) {
			System.out.println(word);
		}
	}
}
