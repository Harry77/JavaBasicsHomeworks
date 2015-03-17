
import java.util.Scanner;

public class _07CountSubstringOccurences {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] text = scan.nextLine().split("\\W+");
		String subString = scan.nextLine();
		int counter = 0;
		
		for (int i = 0; i < text.length; i++) {
			for (int j = 0; j < text[i].length() - subString.length() + 1; j++) {
				if (subString.equalsIgnoreCase(text[i].substring(j, j + subString.length()))) {
					counter++;
				}
			}
		}
		
		System.out.println(counter);
	}

}
