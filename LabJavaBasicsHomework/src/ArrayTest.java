

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);	
		
		int sizeOfArray = scn.nextInt();
		long[] array = new long[sizeOfArray];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextLong(); 
		}
		
		String command = scn.next();
		//command for the end is "stop"
		while (!command.equals("stop")) {
			String line = scn.nextLine().trim();
			int[] params = new int[2];
			//subtract was written wrong
			if(command.equals("add") || command.equals("subtract") || command.equals("multiply")) {
				String[] stringParams = line.split(" ");
				params[0] = Integer.parseInt(stringParams[0]);
				params[1] = Integer.parseInt(stringParams[1]);

				//delete performAction(array, command, params); as it is duplicated
			}
			//array is updated after performing the actions
			array = Arrays.copyOf(performAction(array, command, params), array.length);


			printArray(array);
			System.out.print('\n');
			
			command = scn.next();			
		}		
	}
	//change method to long because it must return the new values
	static long[] performAction(long[] arr, String action, int[] params){
		long[] array = arr.clone();
		//element position (index) is the parameter minus 1
		int pos = params[0] - 1;
		int value = params[1];

		switch (action) {
		case "multiply":
			array[pos] *= value;
			break;
		case "add":
			array[pos] += value;
			break;
		case "subtract":
			array[pos] -= value;
			break;
		case "lshift":
			arrayShiftLeft(array);
			break;
		case "rshift":
			arrayShiftRight(array);
			break;
		}
		//return the new array
		return array;
	}

	private static void arrayShiftRight(long[] array) {
		//use shifter to take the value of the last element and to give it to the first one
		long shifter = array[array.length - 1];
		for (int i = array.length-1; i >= 1 ; i--) {
			array[i] = array[i - 1];
		}
		array[0] = shifter;
	}

	private static void arrayShiftLeft(long[] array) {
		//use shifter to take the value of the first element and to give it to the last one
		long shifter = array[0];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i+1];
		}
		array[array.length - 1] = shifter;
	}

	private static void printArray(long[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}