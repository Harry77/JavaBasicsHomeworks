import java.util.Scanner;

public class _08CountEqualBitPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer number: ");
		int n = scan.nextInt();
		int bit, nextBit;
		boolean check = false;
		int count = 0;

		for (int i = 31; i > 0; i--) {
			bit = n >> i & 1;

			if (bit == 1) {
				check = true;
			}

			if (check) {
				nextBit = (n >> (i - 1)) & 1;
				if (bit == nextBit) {
					count++;
				}
			}
		}
		
		System.out.printf("The binary representation of %1$d contains %2$d sequences of equal bits.", n, count);
	}

}
