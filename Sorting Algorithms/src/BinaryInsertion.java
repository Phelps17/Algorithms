
public class BinaryInsertion {
	private BinaryInsertion() {}
	
	public static void sort(int[] array) {
		int N = array.length;
		
		for (int i =1; i < N; i++) {
			//binary search to determine index j at which to insert a[i]
			int v = array[i];
			
			int low = 0;
			int high = i;
			
			while (low < high) {
				int mid = low + (high - low) /2;
				if (v < array[mid]) {
					high = mid;
				}
				else {
					low = mid + 1;
				}
			}
			
			//insertion sort with "half exachnages"
			//insert array[i] at index j and shift array[j], ..., array[i-1] to right
			for (int j = i; j > low; --j) {
				array[j] = array[j-1];
			}
			array[low] = v;
		}
	}
}
