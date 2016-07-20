
public class StringSorts {
	public static void main(String args[]) {
		String array[] = {"help", "live", "love", "line", "bars", "cars", "held", "fire"};
		printArray(array);
		LSDRadixSort.sort(array, 4);
		printArray(array);
	}
	
	private static void printArray(String array[]) {
		System.out.println();
		for (String word : array) {
			System.out.println(word);
		}
	}
}
