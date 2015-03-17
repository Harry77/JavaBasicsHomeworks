import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _15StraightFlush {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] cardsInHand = scanner.nextLine().split(", ");
		String[] faces = new String[] { "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "J", "Q", "K", "A" };
		String[][] cards = new String[cardsInHand.length][2];
		boolean foundResult = false;

		cards = divideFacesSuits(cardsInHand).clone();
		cards = sortCards(faces, cards).clone();

		if (cards.length > 4 && Arrays.asList(faces).indexOf(cards[0][0]) < 9) {

			for (int i = 0; i < cards.length - 4; i++) {
				ArrayList<String> flush = new ArrayList<String>();
				flush.add(cards[i][0] + cards[i][1]);
				String face = cards[i][0];
				String suit = cards[i][1];
				int j = i + 1;

				while (flush.size() < 5 && j < cardsInHand.length) {
					if (Arrays.asList(faces).indexOf(face) + 1 == Arrays
							.asList(faces).indexOf(cards[j][0])) {

						if (suit.equals(cards[j][1])) {
							flush.add(cards[j][0] + cards[j][1]);
							face = cards[j][0];
							suit = cards[j][1];
						}

					} else if (Arrays.asList(faces).indexOf(face) != Arrays
							.asList(faces).indexOf(cards[j][0])) {
						break;
					}

					j++;
				}

				if (flush.size() == 5) {
					foundResult = true;
					System.out.println(flush);
				}
			}
		}

		if (!foundResult) {
			System.out.println("No Straight Flushes");
		} else {

		}

	}

	private static String[][] divideFacesSuits(String[] cardsInHand) {
		int cardsIndex = 0;
		String[][] cards = new String[cardsInHand.length][2];
		for (String card : cardsInHand) {
			cards[cardsIndex][1] = Character
					.toString(card.charAt(card.length() - 1));
			cards[cardsIndex][0] = card.substring(0, card.length() - 1);
			cardsIndex++;
		}
		return cards;
	}

	private static String[][] sortCards(String[] faces, String[][] cards) {

		for (int i = (cards.length - 1); i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (Arrays.asList(faces).indexOf(cards[j - 1][0]) > Arrays
						.asList(faces).indexOf(cards[j][0])) {
					String rotateFace = cards[j - 1][0];
					String rotateSuit = cards[j - 1][1];
					cards[j - 1][0] = cards[j][0];
					cards[j - 1][1] = cards[j][1];
					cards[j][0] = rotateFace;
					cards[j][1] = rotateSuit;
				}
			}
		}

		return cards;
	}

}
