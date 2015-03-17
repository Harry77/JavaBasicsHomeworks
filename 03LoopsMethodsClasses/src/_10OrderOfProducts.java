
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class _10OrderOfProducts {

	static class Product {
		public String name;
		public double price;

		public Product(String nameProd, double priceProd) {
			name = nameProd;
			price = priceProd;
		}
	}

	public static void main(String[] args) {
		File file1 = new File(
				"SourceFiles/Problem10/Products.txt");
		File file2 = new File("SourceFiles/Problem10/Order.txt");
		double sum = 0;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file1));
			String line;
			ArrayList<Product> Products = new ArrayList<Product>();
			while ((line = reader.readLine()) != null) {
				String[] lineStr = line.split(" ");
				Product newProduct = new Product(lineStr[0],
						Double.parseDouble(lineStr[1]));
				Products.add(newProduct);
			}
			reader.close();

			reader = new BufferedReader(new FileReader(file2));
			while ((line = reader.readLine()) != null) {
				String[] lineStr = line.split(" ");
				double quantity = Double.parseDouble(lineStr[0]);
				String nameOrder = lineStr[1];
				for (int i = 0; i < Products.size(); i++) {
					if (nameOrder.equals(Products.get(i).name)) {
						sum += quantity * Products.get(i).price;
					}
				}
			}
			reader.close();

			PrintWriter writer = new PrintWriter(
					"SourceFiles/Problem10/output.txt", "UTF-8");
			line = String.format("%.2f", sum);
			writer.println(line);
			writer.close();
		} catch (FileNotFoundException e) {
			System.err.println("Error");
		} catch (IOException e) {
			System.err.println("Error");
		}
	}

}