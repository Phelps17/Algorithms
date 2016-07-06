
public class QuickSort {
	private QuickSort() {}
	
	public static void sort(int[] array) {
		//random shuffle array
		sort(array, 0, array.length-1);
	}
	
	//quicksort from high to low
	private static void sort(int[] array, int low, int high) {
		if (high <= low) return;
		
		int i = partition(array, low, high);
		sort(array, low, i-1);
		sort(array, i, high);
	}
	
	private static int partition(int[] array, int low, int high) {
		int i = low;
		int j = high + 1;
		int v = array[low];
		
		while (true) {
			//find item on low to swap
			while (array[++i] < v) {
				if (i == high) {
					break;
				}
			}
			
			//find item on high to swap
			while (v < array[--j]) {
				if (j == low) {
					break;
				}
			}
			
			//if pointers cross
			if (i >= j) {
				break;
			}
			
			exchange(array, i, j);
		}
		
		//put partitioning item v at array[j]
		exchange(array, low, j);
		
		//now array[low ...j-1] <= array[j] <= a[j+1 ... high]
		return j;
	}
}
