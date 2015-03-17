import java.util.Scanner;

public class _01RectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the first site length: ");
		int a = scan.nextInt();
		System.out.print("Please enter the second side length: ");
		int b = scan.nextInt();
		
		System.out.format("Rectangle's area is %d", a * b);
	}

}
