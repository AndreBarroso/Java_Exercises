package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Product product = new Product("Notebook", 20.00);
		Product product2 = new ImportedProduct("Notebook", 20.00, 20.00);
		
		System.out.println(product.priceTag());
		
		System.out.println(product2.priceTag());
		
		
	}

}
