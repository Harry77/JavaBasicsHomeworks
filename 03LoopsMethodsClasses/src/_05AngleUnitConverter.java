
import java.util.Scanner;

public class _05AngleUnitConverter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double[] converted = new double[n];
		String[] measureOut = new String[n];
		
		for (int i = 0; i < n; i++) {
			double value = scan.nextDouble();
			String measure = scan.next();
			
			if (measure.equals("deg")) {
				converted[i] = value * Math.PI / 180;
				measureOut[i] = "rad";
			} else if (measure.equals("rad")) {
				converted[i] = value * 180 / Math.PI;
				measureOut[i] = "deg";
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%.6f %s", converted[i], measureOut[i]);
			System.out.println();
		}
	}

}
