import java.util.Scanner;

public class _07CountOfBitsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		int n = scan.nextInt();
		int count = 0;
		
		for (int i = 0; i < 32; i++) {
			int bit = n >> i & 1;
			if (bit == 1) {
				count++;
			}
		}
		
		System.out.printf("The binary representation of %1$d contains %2$d bits 1", n, count);
	}

}
