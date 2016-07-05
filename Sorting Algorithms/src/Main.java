import java.util.Random;

public class Main {
	public static void main(String args[]) {
		int[] randIntArray = createNewIntArray(1000);
		SelectionSort.sort(randIntArray);
		isSorted(randIntArray, "Selection Sort");
		
		randIntArray = createNewIntArray(1000);
		InsertSort.sort(randIntArray);
		isSorted(randIntArray, "Insert Sort");
		
		randIntArray = createNewIntArray(1000);
		ShellSort.sort(randIntArray);
		isSorted(randIntArray, "Shell Sort");
		
		randIntArray = createNewIntArray(1000);
		BinaryInsertion.sort(randIntArray);
		isSorted(randIntArray, "Binary Insertion Sort");
		
		randIntArray = createNewIntArray(1000);
		MergeSort.sort(randIntArray);
		isSorted(randIntArray, "Merge Sort");
		
		randIntArray = createNewIntArray(1000);
		OptimizedMergeSort.sort(randIntArray);
		isSorted(randIntArray, "Optimized Merge Sort");
		
		randIntArray = createNewIntArray(1000);
		BottomUpMergeSort.sort(randIntArray);
		isSorted(randIntArray, "Bottom Up Merge Sort");
	}
	
	static int[] createNewIntArray(int size) {
		System.out.println("Generating " + size + " random numbers...");
		Random rand = new Random();
		int[] newArray = new int[size];
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = rand.nextInt((size) + 1);
		}
		
		return newArray;
	}
	
	static void printIntArray(int[] array) {
		int count = 1;
		for (int i = 0; i < array.length; i ++) {
			System.out.print(array[i] + ", ");
			if (count == 20) {
				System.out.println();
				count = 0;
			}
			count++;
		}
		System.out.println("----------------------"
				+ "-------------------------------"
				+ "-------------------------------"
				+ "----------------");
	}
	
	static void isSorted(int[] array, String name) {
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i-1]) {
				System.out.println(name + " failed!");
				System.exit(0);
			}
		}
		
		System.out.println(name + " sorted successfully!");
	}
}