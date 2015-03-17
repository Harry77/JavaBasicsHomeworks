import java.util.ArrayList;
import java.util.Scanner;


public class _09CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] firstRow = scanner.nextLine().split(" ");
		String[] secondRow = scanner.nextLine().split(" ");
		ArrayList<Character> l1 = new ArrayList<Character>();
		ArrayList<Character> l2 = new ArrayList<Character>();
		ArrayList<Character> newList = new ArrayList<Character>();
		
		for (int i = 0; i < firstRow.length; i++) {
			l1.add(firstRow[i].charAt(0));
			newList.add(firstRow[i].charAt(0));
		}
		
		for (int i = 0; i < secondRow.length; i++) {
			l2.add(secondRow[i].charAt(0));
		}		
		
		for (int i = 0; i < l2.size(); i++) {
			boolean letterExists = false;
			
			for (int j = 0; j < l1.size(); j++) {
				if (l1.get(j) == l2.get(i)) {
					letterExists = true;
				}
			}
			
			if (!letterExists) {
				newList.add(l2.get(i));
			}
		}
		
		for (int i = 0; i < newList.size(); i++) {
			System.out.print(newList.get(i) + " ");
		}
		
	}

}
