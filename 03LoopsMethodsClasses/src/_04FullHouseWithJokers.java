
public class _04FullHouseWithJokers {
	public static void main(String[] args) {
		String[] cardsFaces = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K", "A" };
		int count = 0;

		for (String threeCards : cardsFaces) {
			for (String twoCards : cardsFaces) {
				if (threeCards != twoCards) {
					count += MakeFullHouse(threeCards, twoCards);
				}
			}
		}

		System.out.println("Total Full House variations: " + count);
	}

	private static int MakeFullHouse(String threeCards, String twoCards) {
		int count = 0;
		String[] cardsSuits = { "♣", "♦", "♥", "♠" };

		for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < 3; j++) {
				for (int m = j + 1; m < 4; m++) {
					for (int n = 0; n < 3; n++) {
						for (int o = n + 1; o < 4; o++) {
							String[] hand = { threeCards + cardsSuits[i],
									threeCards + cardsSuits[j],
									threeCards + cardsSuits[m],
									twoCards + cardsSuits[n],
									twoCards + cardsSuits[o] };
							printHand(hand);
							count++;
							count += addJokerCases(hand);
						}
					}
				}
			}
		}

		return count;
	}

	private static int addJokerCases(String[] hand) {
		String[] handWithJokers = hand.clone();
		int count = 0;
		int i = -1;
			do {
				if (i >= 0) {
					handWithJokers[i] = "*";
				}
				int j = i;
				if (i > -1) {
					j = i + 1;
				}
				do {
					if (j >= 0) {
						handWithJokers[j] = "*";
					}
					int m = j;
					if (j > -1) {
						m = j + 1;
					}
					do {
						if (m >= 0) {
							handWithJokers[m] = "*";
						}
						int n = m;
						if (m > -1) {
							n = m + 1;
						}
						do {
							if (n >= 0) {
								handWithJokers[n] = "*";
							}
							int  o =  n + 1;
							do {
								handWithJokers[o] = "*";
								printHand(handWithJokers);
								count++;
								handWithJokers[o] = hand[o];
								o++;
							} while (o < 5);
							if (n >= 0) {
								handWithJokers[n] = hand[n];
							}
							n++;
						} while (n < 4);
						if (m >= 0) {
							handWithJokers[m] = hand[m];
						}
						m++;
					} while (m < 3);
					if (j >= 0) {
						handWithJokers[j] = hand[j];
					}
					j++;
				} while (j < 2);
				if (i >= 0) {
					handWithJokers[i] = hand[i];
				}
				i++;
			} while(i < 1);

		return count;
	}

	private static void printHand(String[] hand) {
		for (String symbol : hand) {
			System.out.print(symbol);
		}
		System.out.println();
	}

}
