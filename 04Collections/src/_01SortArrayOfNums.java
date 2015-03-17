
import java.util.Arrays;
import java.util.Scanner;

public class _01SortArrayOfNums {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] nums = new int[n];
		
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}

		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
