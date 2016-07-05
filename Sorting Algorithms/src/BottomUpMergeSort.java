
public class BottomUpMergeSort {
	private BottomUpMergeSort() {}
	
	private static void merge(int[] array, int[] aux_array, int low, int mid, int high) {
		//copy to aux
		for (int i = low; i <= high; i++) {
			aux_array[i] = array[i];
		}
		
		//merge back to a[]
		int i = low;
		int j = mid + 1;
		for (int k = low; k <= high; k++) {
			if (i > mid) {
				array[k] = aux_array[j++];
			}
			else if (j > high) {
				array[k] = aux_array[i++];
			}
			else if (aux_array[j] < aux_array[i]) {
				array[k] = aux_array[j++];
			}
			else {
				array[k] = aux_array[i++];
			}
		}
	}
	
	public static void sort(int[] array) {
		int N = array.length;
		int[] aux_array =  new int[N];
		
		for (int n = 1; n < N; n = n+n) {
			for (int i = 0; i < N-n; i += n+n) {
				int low = i;
				int mid = i+n-1;
				int high = Math.min(i+n+n-1, N-1);
				
				merge(array, aux_array, low, mid, high);
			}
		}
	}
}
