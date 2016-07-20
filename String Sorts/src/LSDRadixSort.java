
public class LSDRadixSort {
	public static final int ASCII_SYMBOLS = 256;
	
	public static void sort(String[] array, int stringLengths) {
		String[] auxArray = new String[array.length];
		
		//sort looking at digits from right to left
		//LSD to MSD
		for (int d = stringLengths-1; d >= 0; d--) {
			//key index counting
			int[] count = new int[ASCII_SYMBOLS+1];
			
			for (int i = 0; i < array.length; i++) {
				count[array[i].charAt(d) + 1]++;
			}
			for (int r = 0; r < ASCII_SYMBOLS; r++) {
				count[r+1] += count[r];
			}
			for (int i = 0; i < array.length; i++) {
				auxArray[count[array[i].charAt(d)]++] = array[i];
			}
			for (int i = 0; i < array.length; i++) {
				array[i] = auxArray[i];
			}
		}
	}
}
