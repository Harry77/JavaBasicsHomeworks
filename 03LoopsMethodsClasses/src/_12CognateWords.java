import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _12CognateWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Pattern latinLetters = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = latinLetters.matcher(input);
		ArrayList<String> foundStrings = new ArrayList<String>(); 
		ArrayList<String> result = new ArrayList<String>();
		boolean resultFound = false;
		
		while (matcher.find()) {
			foundStrings.add(matcher.group());			
		}
		
		for (int i = 0; i < foundStrings.size(); i++) {
			for (int j = 0; j < foundStrings.size(); j++) {
				if (i != j) {
					for (int m = 0; m < foundStrings.size(); m++) {
						if ((foundStrings.get(i) + foundStrings.get(j)).equals(foundStrings.get(m))) {
							String newResult = String.format("%s|%s=%s", foundStrings.get(i), 
									foundStrings.get(j), 
									foundStrings.get(m));
							boolean equalityFound = false;
							for (int k = 0; k < result.size(); k++) {
								if (result.get(k).equals(newResult)) {
									equalityFound = true;
								}								
							}
							if (!equalityFound) {
								result.add(newResult);
							}
							resultFound = true;
						}
					}
				}
			}
		}
		if (!resultFound) {			
			System.out.println("No");
		} else {
			for (String printResult : result) {
				System.out.println(printResult);
			}
		}
		
	}

}
