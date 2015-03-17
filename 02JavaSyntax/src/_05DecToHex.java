import java.util.Scanner;

public class _05DecToHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int num = scan.nextInt();
		
		String hex = Integer.toHexString(num);
		System.out.printf("Hex of %d is %s", num, hex);
	}

}
