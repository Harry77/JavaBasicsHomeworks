import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _14ExamScore {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		scanner.nextLine();
		scanner.nextLine();
		
		TreeMap<String, Integer> studentsScores = new TreeMap<>();
		TreeMap<String, Double> studentsGrades = new TreeMap<>();
		
		while (true) {
			String nextLineRead = scanner.nextLine();
			Pattern dash = Pattern.compile("[-]");
			Matcher matcher = dash.matcher(nextLineRead);
			if (matcher.find()) {
				break;
			}
			String[] nextLineStrings = nextLineRead.split("\\s*\\|\\s*");
						
			studentsScores.put(nextLineStrings[1], Integer.parseInt(nextLineStrings[2]));
			studentsGrades.put(nextLineStrings[1], Double.parseDouble(nextLineStrings[3]));
		}
		
		TreeMap<Integer, ArrayList<String>> scores = new TreeMap<Integer, ArrayList<String>>();
		
		for (String student : studentsScores.keySet()) {
			boolean scoreExists = false;
			for (int score : scores.keySet()) {
				if (score == studentsScores.get(student)) {
					scores.get(score).add(student);
					scoreExists = true;
				}
			}
			
			if (!scoreExists) {
				scores.put(studentsScores.get(student), new ArrayList<>(Arrays.asList(student)));
			}
		}
		
		for (int score : scores.keySet()) {
			double avrgGrade = 0;
			for (String student : scores.get(score)) {
				avrgGrade += studentsGrades.get(student);
			}
			
			avrgGrade /= scores.get(score).size();
			System.out.printf("%d -> " + scores.get(score) + "; avg=%.2f", score, avrgGrade);
			System.out.println();
		}
	}

}
