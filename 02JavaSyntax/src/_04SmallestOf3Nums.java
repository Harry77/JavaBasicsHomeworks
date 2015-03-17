import java.util.Scanner;

public class _04SmallestOf3Nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double min = Double.MAX_VALUE;

		for (int i = 0; i < 3; i++) {
			System.out.print("Please enter a number: ");
			double input = scan.nextDouble();
			
			if (input < min) {
				min = input;
			}
		}
		
		System.out.println("The lowest number you have entered is " + min);
	}

}
