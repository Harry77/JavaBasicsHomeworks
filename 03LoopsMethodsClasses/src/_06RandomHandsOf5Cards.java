
import java.util.Random;
import java.util.Scanner;

public class _06RandomHandsOf5Cards {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] faces = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] suits = new String[] {"♣", "♦", "♥", "♠"};
		String[] face = new String[5];
		String[] suit = new String[5];
		Random rand = new Random();
		
		for (int i = 0; i < n; i++) {			
			for (int j = 0; j < 5; j++) {
				boolean checkEqualCards = true;
				while (checkEqualCards) {
					checkEqualCards = false;
					face[j] = faces[rand.nextInt(13)];
					suit[j] = suits[rand.nextInt(4)];
					
					for (int j2 = 0; j2 < j; j2++) {
						if (face[j].equals(face[j2]) && suit[j].equals(suit[j2])) {
							checkEqualCards = true;
						}
					}
				}
			}
			
			for (int j = 0; j < 5; j++) {
				System.out.print(face[j] + suit[j]);
			}
			
			System.out.println();
		}
	}

}
