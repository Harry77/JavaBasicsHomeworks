import java.util.Scanner;

public class _02TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] a = new int[2], b = new int[2], c = new int[2];
		
		System.out.print("Please enter the coordinates of the first point separated by a space: ");
		a[0] = scan.nextInt();
		a[1] = scan.nextInt();
		System.out.print("Please enter the coordinates of the second point separated by a space: ");
		b[0] = scan.nextInt();
		b[1] = scan.nextInt();
		System.out.print("Please enter the coordinates of the third point separated by a space: ");
		c[0] = scan.nextInt();
		c[1] = scan.nextInt();
				
		long area = Math.abs((a[0] * (b[1] - c[1]) + b[0] * (c[1] - a[1]) + c[0] * (a[1] - b[1])) / 2);
		System.out.println("The triangle's area is " + area);
	}

}