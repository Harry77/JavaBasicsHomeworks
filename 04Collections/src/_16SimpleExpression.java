import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _16SimpleExpression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Pattern numsSearched = Pattern.compile("\\d[\\.\\d]*");
		Pattern signsSearched = Pattern.compile("\\+|\\-");
		Matcher numsFound = numsSearched.matcher(input);
		Matcher signsFound = signsSearched.matcher(input);
		ArrayList<Double> numbers = new ArrayList<Double>();
		ArrayList<String> signs = new ArrayList<String>();
		
		while (numsFound.find()) {
			numbers.add(Double.parseDouble(numsFound.group()));
		}
		
		while (signsFound.find()) {
			signs.add(signsFound.group());
		}
		
		BigDecimal result = new BigDecimal(numbers.get(0));
		
		for (int i = 0; i < signs.size(); i++) {
			result = result.add(new BigDecimal(evaluateNext(numbers.get(i + 1), signs.get(i))));
		}
		
		System.out.printf("%.7f", result);
	}

	private static double evaluateNext(double num, String sign) {
		double signedNum = 0;
		
		switch (sign) {
		case "+":
			signedNum += num;
			break;
		case "-":
			signedNum -= num;
			break;
		}
		
		return signedNum;
	}
}
