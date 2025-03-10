package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args ) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> prodList = new ArrayList<>();
		System.out.println("---------------------------------");
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		System.out.println("---------------------------------");
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #"+ i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char prodTipe = sc.next().charAt(0);
		
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			if (prodTipe == 'i') {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble(); 
				
				Product impotProd = new ImportedProduct(name, price, customsFee);
				prodList.add(impotProd);
			}
			else if (prodTipe == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				
				Product useProd = new UsedProduct(name, price, manufactureDate);
				prodList.add(useProd);
			}
			else if (prodTipe == 'c') {
				Product commonProd = new Product(name, price);
				prodList.add(commonProd);
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product product : prodList) {
			System.out.println(product.priceTag());
		}
		
		sc.close();

	}

}
