
public class OptimizedMSDRadixSort {
	public static final int ASCII_SYMBOLS = 256;

	//main sort call
	public static void sort(String[] array) {
		String[] aux_array = new String[array.length];
		sort(array, aux_array, 0, array.length-1, 0);
	}

	//internal recursive sort call
	private static void sort(String[] array, String[] aux_array, int low, int high, int d) {
		//check for return
		if (high <= low) {
			return;
		}

		int[] count = new int[ASCII_SYMBOLS+2];

		//key index counting
		for (int i = low; i <= high; i++) {
			count[charAt(array[i], d) + 2]++;
		}
		for (int r = 0; r < ASCII_SYMBOLS+1; r++) {
			count[r+1] += count[r];
		}
		for (int i = low; i <= high; i++) {
			aux_array[count[charAt(array[i], d) + 1]++] = array[i];
		}
		for (int i = low; i <= high; i++) {
			array[i] = aux_array[i - low];
		}
		//end key index counting

		for (int r = 0; r < ASCII_SYMBOLS; r++) {
			//sort R subarrays recursively
			sort(array, aux_array, low + count[r], low + count[r+1] -1, d+1);
		}
	}

	//find char at without falling out of bounds
	private static int charAt(String string, int index) {
		if (index < string.length()) {
			return string.charAt(index);
		}
		else return -1;
	}

	private static void insertSort(String[] array, int low, int high, int startIndex) {
		for (int i = low; i <= high; i++) {
			for (int j = i; j > low && less(array[j], array[j-1], startIndex); j--) {
				exchange(array, j, j-1);
			}
		}
	}

	// exchange string values
	private static void exchange(String[] array, int i, int j) {
		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	//compare strings
	private static boolean less(String string1, String string2, int startIndex) {
		for (int i = startIndex; i < Math.min(string1.length(), string2.length()); i++) {
			if (string1.charAt(i) < string2.charAt(i)) {
				return true;
			}
			if (string1.charAt(i) > string2.charAt(i)) {
				return false;
			}
		}

		return (string1.length() < string2.length());
	}
}
