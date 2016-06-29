import java.util.Random;

public class Main {
	public static void main(String args[]) {
		int[] randIntArray = createNewIntArray(500);
		printIntArray(randIntArray);
	}
	
	static int[] createNewIntArray(int size) {
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
	}
}