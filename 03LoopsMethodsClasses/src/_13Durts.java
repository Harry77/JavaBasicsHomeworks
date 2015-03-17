import java.util.Scanner;

public class _13Durts {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Cx = scanner.nextInt();
		int Cy = scanner.nextInt();
		int r = scanner.nextInt();
		int n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			int xCoord = scanner.nextInt();
			int yCoord = scanner.nextInt();
			boolean checkIfInside = false;
			
			if (xCoord >= Cx - r && 
					xCoord <= Cx + r && 
						yCoord >= Cy - r / 2 && 
							yCoord <= Cy + r / 2) {
				checkIfInside = true;
			}

			if (xCoord >= Cx - r / 2 && 
					xCoord <= Cx + r / 2 &&
						yCoord >= Cy - r &&
							yCoord <= Cy + r) {
				checkIfInside = true;
			}

			if (checkIfInside) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}

	}

}
