import java.util.Scanner;


public class _14StuckNums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[] numbers = scanner.nextLine().split(" ");
		boolean equalityFound = false;
		
		for (String firstNum : numbers) {
			for (String secondNum : numbers) {
				if (!secondNum.equals(firstNum)) {
					for (String thirdNum : numbers) {
						if (!thirdNum.equals(firstNum) && !thirdNum.equals(secondNum)) {
							for (String fourthNum : numbers) {
								if (!fourthNum.equals(firstNum) && 
										!fourthNum.equals(secondNum) && 
											(!fourthNum.equals(thirdNum))) {
									if ((firstNum + secondNum).equals(thirdNum + fourthNum)) {
										System.out.printf("%s|%s==%s|%s", firstNum, secondNum, thirdNum, fourthNum);
										System.out.println();
										equalityFound = true;
									}
								}
							}
						}
					}
				}
			}
		}
		
		if (!equalityFound) {
			System.out.println("No");
		}
	}

}
