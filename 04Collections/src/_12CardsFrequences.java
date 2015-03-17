import java.util.ArrayList;
import java.util.Scanner;

public class _12CardsFrequences {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] cards = scanner.nextLine().split(" ");
		ArrayList<String> faces = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();

		for (String card : cards) {
			boolean cardExists = false;
			
			for (int i = 0; i < faces.size(); i++) {
				if (faces.get(i).equals(card.substring(0, card.length() - 1))) {
					cardExists = true;
					count.set(i, count.get(i) + 1);
				}
			}
			
			if (!cardExists) {
				faces.add(card.substring(0, card.length() - 1));
				count.add(1);
			}
		}
		
		for (int i = 0; i < faces.size(); i++) {
			System.out.printf("%s -> %.2f%%", faces.get(i), (double)count.get(i) / cards.length * 100);
			System.out.println();
		}
	}

}
