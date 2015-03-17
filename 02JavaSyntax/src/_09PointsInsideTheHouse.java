import java.util.Scanner;

public class _09PointsInsideTheHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter X: ");
		Double X = scan.nextDouble();
		System.out.print("Please enter Y: ");
		Double Y = scan.nextDouble();
		String inside = "Outside";
		
		if ((Y <= 13.5) && (Y > 8.5)) {
			if (((X >= 12.5) && (X <= 17.5)) || ((X >= 20) && (X <= 22.5))) {
				inside = "Inside";
			}
		} else if (Y <= 8.5) {
			if ((Double.compare( (17.5 - 12.5) * (Y - 8.5) - (3.5 - 8.5) * (X - 12.5) , 0.0) >= 0) && 
					(Double.compare( (22.5 - 17.5) * (Y - 3.5) - (8.5 - 3.5) * (X - 17.5) , 0.0) >= 0)) {
				inside = "Inside";
			}
		}
		
		System.out.println(inside);
	}

}
