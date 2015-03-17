import java.util.ArrayList;
import java.util.Scanner;

public class BePositive {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		int countSequences = scn.nextInt();
		//scanner needs to go down to the next line
		scn.nextLine();
		
		for (int i = 0; i < countSequences; i++) {
			String[] input = scn.nextLine().trim().split(" ");
			ArrayList<Integer> numbers = new ArrayList<>();
			
			for (int j = 0; j < input.length; j++) {
				if (!input[j].equals("") ) {
					//changing input[i] to input[j] because j is following the input indexes
					int num = Integer.parseInt(input[j]);
					numbers.add(num);	
				}							
			}
			
			boolean found = false;
			
			for (int j = 0; j < numbers.size(); j++) {				
				int currentNum = numbers.get(j);
				
				//including the zero
				if (currentNum >= 0) {
					System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? "\n" : " ");
					found = true;
				} else {
					//if statement is necessary to avoid IndexOutOfBoundsException
					if (j < numbers.size() - 1) {
						currentNum += numbers.get(j + 1);
						
						//including the zero
						if (currentNum >= 0) {
							// condition for the new line must be j+1 == numbers.size() and not j
							System.out.printf("%d%s", currentNum, j + 1 == numbers.size() - 1 ? "\n" : " ");
							found = true;
						}
						
						//j must point to the next number
						j++;
					}						
				}
			}
			
			if (!found) {
				System.out.println("(empty)");
			} 			
		}		
	}
}
