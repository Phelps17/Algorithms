
public class BruteForce {
	//return the start indeex of the word or n if no matches
	public static int search(String pattern, String textToSearch) {
		int m = pattern.length();
		int n = pattern.length();
		
		for (int i = 0; i <= n-m; i++) {
			int j;
			for (j = 0; j < m; j++) {
				if (textToSearch.charAt(i+j) != pattern.charAt(j)) {
					break;
				}
			}
			
			if (j == m) {
				//found at index i
				return i;
			}
		}
		
		//pattern wasn't found
		return n;
	}
}
