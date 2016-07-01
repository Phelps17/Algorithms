
public class MergeSort {
	private MergeSort() {}
	
	public static void sort(int[] array) {
		int[] aux_array = new int[array.length];
		//call recursive function
		sort(array, aux_array, 0, array.length-1);
	}
	
	private static void sort(int[] array, int[] aux_array, int low, int high) {
		if (high <= low) return;
		//find mid point and sort both halves
		int mid = low + (high - low) /2;
		sort(array, aux_array, low, mid);
		sort(array, aux_array, mid+1, high);
		//merge halves back together
		merge(array, aux_array, low, mid, high);
	}
	
	private static void merge(int[] array, int[] aux_array, int low, int mid, int high) {
		//copy into aux_array
		for (int i = low; i <= high; i++) {
			aux_array[i] = array[i];
		}
		
		//merge back to array[]
		int i = low;
		int j = mid+1;
		for (int k = low; k <= high; k++) {
			if (i > mid) {
				array[k] = aux_array[j++];
			}
			else if (j > high) {
				array[k] = aux_array[i++];
			}
			else if (aux_array[j] < aux_array[i]){
				array[k] = aux_array[j++];
			}
			else {
				array[k] = aux_array[i++];
			}
		}
	}
}
