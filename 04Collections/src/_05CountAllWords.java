
import java.util.Scanner;

public class _05CountAllWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split("\\W+");		
		System.out.println(input.length);
	}

}
