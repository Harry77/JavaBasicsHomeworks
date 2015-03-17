
import java.util.Scanner;

public class _03LargestSequenceOfEqualStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] strings = scan.nextLine().split(" ");
		int counter = 1;
		String largestString = strings[0];
		int largestCount = counter;
		
		for (int i = 0; i < strings.length - 1; i++) {
			if (strings[i].equals(strings[i+1])) {
				counter++;
				if (counter > largestCount) {
					largestCount = counter;
					largestString = strings[i];
				}
			} else {
				counter = 1;
			}
		}
		
		for (int i = 0; i < largestCount; i++) {
			System.out.print(largestString + " ");
		}
	}

}
