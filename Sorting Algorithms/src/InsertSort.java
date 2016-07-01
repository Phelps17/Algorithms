
public class InsertSort {
	
	private InsertSort() {}
	
	public static void sort(int[] array) {
		int N = array.length;
		
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0 && (array[j] < array[j-1]); j--) {
				exchange(array, j, j-1);
			}
		}
	}
	
	private static void exchange(int[] array, int i, int j) {
		int swap = array[i];
		array[i] = array[j];
		array[j] = swap;
	}
}
