
import java.util.Scanner;

public class _06CountSpecifiedWord {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] text = scan.nextLine().split("\\W+");
		String word = scan.nextLine();
		int counter = 0;
		
		for (int i = 0; i < text.length; i++) {
			if (text[i].equalsIgnoreCase(word)) {
				counter++;
			}
		}
		
		System.out.println(counter);
	}

}
