public class OptimizedMergeSort {
	private static final int CUTOFF = 7;  // cutoff to insertion sort
	private OptimizedMergeSort() {}
	
	public static void sort(int[] array) {
		int[] aux_array = array.clone();
		sort(aux_array, array, 0, array.length-1);
	}
	
	private static void sort(int[] source, int[] destination, int low, int high) {
		if (high <= low + CUTOFF) {
			insertionSort(destination, low, high);
			return;
		}
		
		int mid = low + (high - low) /2;
		sort(destination, source, low, mid);
		sort(destination, source, mid+1, high);
		
		if (!(source[mid+1] < source[mid])) {
			System.arraycopy(source, low, destination, low, high-low+1);
			return;
		}
		
		merge(source, destination, low, mid, high);
	}
	
	private static void insertionSort(int[] array, int low, int high) {
		for (int i = low; i <= high; i++) {
			for (int j = i; j > low && (array[j] < array[j-1]); j--) {
				exchange(array, j, j-1);
			}
		}
	}
	
	private static void merge(int[] src, int[] dst, int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		
		for (int k = low; k <= high; k++) {
			if (i > mid) {
				dst[k] = src[j++];
			}
			else if (j > high) {
				dst[k] = src[i++];
			}
			else if (src[j] < src[i]) {
				dst[k] = src[j++];
			}
			else {
				dst[k] = src[i++];
			}
		}
	}
	
	private static void exchange(int[] array, int i, int j) {
		int swap = array[i];
		array[i] = array[j];
		array[j] = swap;
	}
}
