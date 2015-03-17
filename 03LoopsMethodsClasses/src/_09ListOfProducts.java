

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _09ListOfProducts {

	static class Product {
		public String name;
		public double price;
		public Product(String nameProd, double priceProd) {
			name = nameProd;
			price = priceProd;
		}
	}
	
	public static void main(String[] args) {

		File file = new File("SourceFiles/Problem09/input.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			ArrayList<Product> Products = new ArrayList<Product>();
			while ((line = reader.readLine()) != null) {
				String[] lineStr = line.split(" ");
				Product newProduct = new Product(lineStr[0], Double.parseDouble(lineStr[1]));
				Products.add(newProduct);
			}
			reader.close();
			Collections.sort(Products, new Comparator<Product>() {
		        @Override public int compare(Product p1, Product p2) {
		            return Double.compare(p1.price, p2.price);
		        }
			});
			PrintWriter writer = new PrintWriter("SourceFiles/Problem09/output.txt", "UTF-8");
			for (int i = 0; i < Products.size(); i++) {
				line = String.format("%.2f %s", Products.get(i).price, Products.get(i).name);
				writer.println(line);
			}
			writer.close();
		} catch (FileNotFoundException e) {
			System.err.println("Error");
		} catch (IOException e) {
			System.err.println("Error");
		}
	}

}
