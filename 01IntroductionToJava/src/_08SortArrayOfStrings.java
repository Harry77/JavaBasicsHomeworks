
import java.text.Collator;
import java.util.Scanner;

public class _08SortArrayOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String[] strings = new String[n];
		
		for (int i = 0; i < n; i++) {
			String newString = scan.nextLine();
			strings[i] = newString;
		}
		
		String tmp;
		Collator myCollator = Collator.getInstance();
		
		for (int i = 0; i < strings.length; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				if (myCollator.compare(strings[i], strings[j]) > 0) {
					tmp = strings[j];
					strings[j] = strings[i];
					strings[i] = tmp;
				}
			}
			
			System.out.println(strings[i]);
		}
		
	}

}
