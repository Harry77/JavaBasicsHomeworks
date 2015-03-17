
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04LongestIncreasingSequence {

	public static List<Integer> SequenceEnd(List<Integer> curr, List<Integer> longest) {
		if (curr.size() > longest.size()) {
			longest = curr;
		}
		
		for (int j = 0; j < curr.size(); j++) {
			System.out.print(curr.get(j) + " ");
		}
		
		System.out.println();
		return longest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] inputStr = scan.nextLine().split(" ");
		int[] input = new int[inputStr.length];
		
		for (int i = 0; i < inputStr.length; i++) {
			input[i] = Integer.parseInt(inputStr[i]);
		}		

		List<Integer> currentSeq = new ArrayList<>();
		List<Integer> longestSeq = new ArrayList<>();
		currentSeq.add(input[0]);
		
		for (int i = 1; i < input.length; i++) {
			if (input[i] > input[i - 1]) {
				currentSeq.add(input[i]);
			} else {
				longestSeq = SequenceEnd(currentSeq, longestSeq);
				currentSeq = new ArrayList<>();
				currentSeq.add(input[i]);
			}
		}

		longestSeq = SequenceEnd(currentSeq, longestSeq);
		System.out.print("Longest: ");
		
		for (int i = 0; i < longestSeq.size(); i++) {
			System.out.print(longestSeq.get(i) + " ");
		}
	}

}
