

public class _03FullHouse {
	public static void main(String[] args) {
		String[] cardsFaces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
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
		String[] cardsSuits = {"♣", "♦", "♥", "♠"};
		int localCount = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < 3; j++) {
				for (int m = j + 1; m < 4; m++) {
					for (int n = 0; n < 3; n++) {
						for (int o = n + 1; o < 4; o++) {
							System.out.println(
									threeCards + cardsSuits[i] + 
									threeCards + cardsSuits[j] + 
									threeCards + cardsSuits[m] + 
									twoCards + cardsSuits[n] + 
									twoCards + cardsSuits[o]);
							localCount++;
						}
					}
				}
			}
		}
		
		return localCount;
	}

}
