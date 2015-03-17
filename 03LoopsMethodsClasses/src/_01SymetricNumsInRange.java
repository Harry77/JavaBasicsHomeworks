
import java.util.Scanner;

public class _01SymetricNumsInRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();

		for (int i = start; i <= end; i++) {
			if (i < 10) {
				System.out.print(i + " ");
			} else if (i < 100) {
				if (i % 10 == i / 10) {
					System.out.print(i + " ");
				}
			} else {
				if (i % 10 == i / 100) {
					System.out.print(i + " ");
				}
			}
		}
	}

}
