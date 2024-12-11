package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Bith date (DD/MM/YYYY): ");
		//inserir data/ converter string para tipo date
		Date bithDate = sdf.parse(sc.next());
		
		// criei um objeto cliente e passei os argumentos pelo scanner
		Client client = new Client(name, email, bithDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		//converter string para orderStatus
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		//antes de iniciar o for para instaciar produto e item, deve-se instanciar o order associado ao cliente
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter #%d item data:", i + 1);
			
			System.out.print("Product name:");
			sc.nextLine();
			String productName = sc.nextLine();
			
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			Integer productQuantity = sc.nextInt();
			
			//instanciar o produto, item de pedido,
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(productQuantity, productPrice, product);
			
			order.addItem(it);
		}
		
		System.out.println();
		System.out.println(order);
		
		
		sc.close();
	}

}
