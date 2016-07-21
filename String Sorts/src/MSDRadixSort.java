
public class MSDRadixSort {
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
}
