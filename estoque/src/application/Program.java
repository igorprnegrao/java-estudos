package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println("Product data: " + product.toString());
		
		System.out.println();
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		
		System.out.println("Update data: " + product.toString());
		System.out.println();
		
		
		System.out.println("Enter the number of products to be remove in stock: ");
		int quantityRemove = sc.nextInt();
		product.removeProducts(quantityRemove);
		
		System.out.println("Remove data: " + product.toString());
		System.out.println();
		
		
		
		sc.close();
	}

}
