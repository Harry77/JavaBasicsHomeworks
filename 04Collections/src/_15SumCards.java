import java.util.Scanner;


public class _15SumCards {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] cards = scanner.nextLine().split(" ");
		String[] faces = new String[cards.length];
		
		for (int i = 0; i < cards.length; i++) {
			faces[i] = cards[i].substring(0, cards[i].length() - 1);
		}
		
		int sum = evaluateCard(faces[0]);
		boolean previousDoubled = false;
		
		for (int i = 1; i < faces.length; i++) {
			sum += evaluateCard(faces[i]);
			if (faces[i].equals(faces[i - 1])) {
				if (previousDoubled) {
					sum += evaluateCard(faces[i]);
				} else {
					sum += evaluateCard(faces[i]) + evaluateCard(faces[i - 1]);
				}
				
				previousDoubled = true;
			} else {
				previousDoubled = false;
			}
		}
		
		System.out.println(sum);
	}

	private static int evaluateCard(String cardFace) {
		int cardValue = 0;
		switch (cardFace) {
		case "2":
			cardValue = 2;
			break;
		case "3":
			cardValue = 3;
			break;
		case "4":
			cardValue = 4;
			break;
		case "5":
			cardValue = 5;
			break;
		case "6":
			cardValue = 6;
			break;
		case "7":
			cardValue = 7;
			break;
		case "8":
			cardValue = 8;
			break;
		case "9":
			cardValue = 9;
			break;
		case "10":
			cardValue = 10;
			break;
		case "J":
			cardValue = 12;
			break;
		case "Q":
			cardValue = 13;
			break;
		case "K":
			cardValue = 14;
			break;
		case "A":
			cardValue = 15;
			break;
		}		
		
		return cardValue;
	}

}
