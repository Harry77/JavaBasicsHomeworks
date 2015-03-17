

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _08SumNumsFromTextFile {
	public static void main(String[] args) {
		long sum = 0;
		File file = new File("SourceFiles/Problem08/input.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			while ((line = reader.readLine()) != null) {
				int num = Integer.parseInt(line);
				sum += num;
			}
			System.out.println(sum);
			reader.close();
		} catch (FileNotFoundException e) {
			System.err.println("Error");
		} catch (IOException e) {
			System.err.println("Error");
		}
	}
}
