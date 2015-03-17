import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class _17LogsAggregator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		String[][] inputLines = new String[n][];		
				
		for (int i = 0; i < n; i++) {
			inputLines[i] = scanner.nextLine().split(" ");
		}
		
		TreeMap<String, Integer> entries = new TreeMap<String, Integer>();

		entries.put(inputLines[0][1], Integer.parseInt(inputLines[0][2]));
		
		for (int i=1; i < inputLines.length; i++) {
			if (entries.containsKey(inputLines[i][1])) {
				int value = entries.get(inputLines[i][1]);
				value += Integer.parseInt(inputLines[i][2]);
				entries.put(inputLines[i][1], value);
			} else {
				entries.put(inputLines[i][1], Integer.parseInt(inputLines[i][2]));				
			}
		}
		
		for (String user : entries.keySet()) {
			Set<String> ipAddrSet = new TreeSet<String>();
			
			for (String[] line : inputLines) {
				if (user.equals(line[1])) {
					ipAddrSet.add(line[0]);
				}
			}
			
			System.out.printf("%s: %d " + ipAddrSet, user, entries.get(user));
			System.out.println();
		}
	}

}
