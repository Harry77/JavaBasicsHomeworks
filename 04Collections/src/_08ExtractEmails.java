
import java.util.Scanner;
import java.util.regex.*;

public class _08ExtractEmails {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		Pattern emailPattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9._-]*[a-zA-Z0-9]@[a-zA-Z][a-zA-Z-]*[a-zA-Z](\\.[a-zA-Z]+)+");
		Matcher matcher = emailPattern.matcher(text);
		
		while (matcher.find()) {
			System.out.println(matcher.group());			
		}
		
	}
}
