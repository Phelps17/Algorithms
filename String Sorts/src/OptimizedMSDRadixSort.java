
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
	
	private static void insertSort(String[] a, int lo, int hi, int d) {
		for (int i = lo; i <= hi; i++) {
			for (int j = i; j > lo && less(a[j], a[j-1],d); j--) {
				exchange(a, j, j-1);
			}
		}
	}
	
	// exchange string values
    private static void exchange(String[] a, int i, int j) {
        String temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
	
	//find char at without falling out of bounds
	private static int charAt(String string, int index) {
		if (index < string.length()) {
			return string.charAt(index);
		}
		else return -1;
	}
	
	//compare strings
	private static boolean less(String v, String w, int d) {
		for (int i = d; i < Math.min(v.length(), w.length()); i++) {
			if (v.charAt(i) < w.charAt(i)) {
				return true;
			}
			if (v.charAt(i) > w.charAt(i)) {
				return false;
			}
		}
		
		return (v.length() < w.length());
	}
}
