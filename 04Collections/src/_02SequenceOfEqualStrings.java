
import java.util.Scanner;

public class _02SequenceOfEqualStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] strings = scan.nextLine().split(" ");
		
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + " ");
			if (i < strings.length - 1 && !strings[i].equals(strings[i+1])) {
				System.out.println();
			}
		}
	}

}
