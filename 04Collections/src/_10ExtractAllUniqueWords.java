import java.util.Arrays;
import java.util.Scanner;


public class _10ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] words = scanner.nextLine().split("\\W+");
		
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].toLowerCase();
		}
		
		Arrays.sort(words);
		System.out.print(words[0] + " ");
		
		for (int i = 1; i < words.length; i++) {
			if (!words[i].equals(words[i - 1])) {
				System.out.print(words[i] + " ");
			}
		}
	}

}
