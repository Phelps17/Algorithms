public class SelectionSort {
	private SelectionSort() { }
	
	public static void sort(int[] array) {
		int N = array.length;
		for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if (array[j] < array[min]) {
                	min = j;
                }
            }
            exchange(array, i, min);
        }
	}
	
	private static void exchange(int[] array, int a, int b) {
        int swap = array[a];
        array[a] = array[b];
        array[b] = swap;
    }
}
