
import java.util.Scanner;

public class _02Generate3LetterWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] chars = scan.nextLine().toCharArray();
		
		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars.length; j++) {
				for (int m = 0; m < chars.length; m++) {
					char[] output = {chars[i], chars[j], chars[m]};
					String newString = new String(output);
					System.out.print(newString + " ");
				}
			}
		}
	}

}
