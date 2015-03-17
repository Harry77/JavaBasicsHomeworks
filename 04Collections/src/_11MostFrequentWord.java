import java.util.Scanner;
import java.util.TreeMap;


public class _11MostFrequentWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] words = scanner.nextLine().split("\\W+");
		
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].toLowerCase();
		}
		
		for (int i = 0; i < words.length; i++) {
			words[i].toLowerCase();
		}
		
		TreeMap<String, Integer> wordCount = new TreeMap<String, Integer>();
		
		for (int i = 0; i < words.length; i++) {
			boolean wordIsInMap = false;
			
			for (String word : wordCount.keySet()) {
				if (word.equals(words[i])) {
					wordCount.put(word, wordCount.get(word) + 1);
					wordIsInMap = true;
				}
			}
			
			if (!wordIsInMap) {
				wordCount.put(words[i], 1);
			}
		}
		
		int maxApperance = 0;
		
		for (String word : wordCount.keySet()) {
			if (wordCount.get(word) > maxApperance) {
				maxApperance = wordCount.get(word);
			}
		}
		
		for (String word : wordCount.keySet()) {
			if (wordCount.get(word) == maxApperance) {
				System.out.printf("%s -> %d times", word, wordCount.get(word));
				System.out.println();
			}
		}
	}

}
