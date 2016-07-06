import java.util.Random;

public class Shuffling {
	/*public static void main(String[] args) {
		int[] array = new int[52];
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		printDeck(array);
		
		System.out.println("\n");
		shuffle(array);
		printDeck(array);
	}*/
	
	public static void printDeck(int[] array) {
		int count = 1;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+", ");
			if (count == 10) {
				System.out.print("\n");
				count = 1;
			}
			else {
				count++;
			}
		}
	}
	
	public static void shuffle(int[] array) {
		for (int i = 0; i < array.length; i++) {
			Random rand = new Random();
			int randomNum = rand.nextInt(i + 1);
			
			//System.out.println("Swapping " + i + " and " + randomNum);
			//swap values
			int temp = array[i];
			array[i] = array[randomNum];
			array[randomNum] = temp;
		}
	}
}
