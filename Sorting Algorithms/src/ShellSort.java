
public class ShellSort {
	
	private ShellSort() {}
	
	public static void sort(int[] array) {
		int N = array.length;
		
		//3x+1 increment sequence
		int h = 1;
		while (h < N/3) {
			h = 3*h + 1;
		}
		
		while (h >= 1) {
			//h-sort the array
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && (array[j] < array[j-h]); j -= h) {
					exchange(array, j, j-h);
				}
			}
			h = h/3;
		}
	}
	
	private static void exchange(int[] array, int i, int j) {
		int swap = array[i];
		array[i] = array[j];
		array[j] = swap;
	}
}
