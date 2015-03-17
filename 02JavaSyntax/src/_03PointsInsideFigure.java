import java.util.Scanner;

public class _03PointsInsideFigure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double[] coords = new double[2]; 
		boolean inside = false;
		
		System.out.print("Please enter x: ");
		coords[0] = scan.nextDouble();
		System.out.print("Please enter y: ");
		coords[1] = scan.nextDouble();
				
		if (coords[0] >= 12.5 && coords[0] <= 22.5 && coords[1] >= 6 && coords[1] <= 13.5) {
			if (coords[1] <= 8.5 || (coords[0] <= 17.5 || coords[0] >= 20)) {
				inside = true;
			}
		}
		
		if (inside) {
			System.out.println("Inside");
		} else {
			System.out.println("Outside");
		}
	}

}
