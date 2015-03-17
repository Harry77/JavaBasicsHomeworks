import java.util.Scanner;

public class _06FormattingNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer: ");
		int a = scan.nextInt();
		System.out.print("Please enter a floating point number: ");
		double b = scan.nextDouble();
		System.out.print("Please enter a floating point number: ");
		double c = scan.nextDouble();
		
		System.out.printf("|%-10s|%010d|%10.2f|%-10.3f|", Integer.toHexString(a), Integer.parseInt(Integer.toBinaryString(a)), b, c);
	}

}
