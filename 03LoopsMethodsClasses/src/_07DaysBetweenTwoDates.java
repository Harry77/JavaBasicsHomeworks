

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _07DaysBetweenTwoDates {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		
		String firstInputString = scan.nextLine();
		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date firstDate = df.parse(firstInputString);
		
		String secondInputString = scan.nextLine();
		df = new SimpleDateFormat("dd-MM-yyyy");
		Date secondDate = df.parse(secondInputString);
		
		long result = (secondDate.getTime() - firstDate.getTime()) / (1000 * 60 * 60 * 24);
		System.out.println(result);
	}

}
