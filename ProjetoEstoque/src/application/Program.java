package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scEstoque = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = scEstoque.nextLine();
		System.out.print("Price: ");
		product.price = scEstoque.nextDouble();
		System.out.print("Quantity in stock: ");
		product.quantity = scEstoque.nextInt();
		
		System.out.println();
		System.out.println("Data products: " + product);
		
		/*System.out.println();
		System.out.println("Enter the number of products to be added from stock: ");
		int quantity = scEstoque.nextInt();
		product.addProducts(quantity);*/
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		int quantity = scEstoque.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data products: " + product);
		
		scEstoque.close();
	}

}
