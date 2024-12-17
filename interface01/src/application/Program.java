package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxServices;
import model.services.RentalServices;

public class Program {

	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			System.out.println("=============================");
			System.out.println("Entre com os dados do aluguel");
			System.out.println("=============================");
			System.out.print("Modelo do carro:");
			String model = sc.nextLine();
			System.out.println("-----------------------------");
			System.out.println("Retirada (dd/MM/yyyy hh:mm): ");
			LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
			
			System.out.println("Retorno (dd/MM/yyyy hh:mm): ");
			LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
			
			CarRental cr = new CarRental(start, finish, new Vehicle(model));
			
			System.out.print("Entre com o preço por hora: ");
			double pricePerHour = sc.nextDouble();
			
			System.out.print("Entre com o preço por dia:");
			double pricePerDay = sc.nextDouble();
			
			RentalServices rentalServices = new RentalServices
					(pricePerHour, pricePerDay, new BrazilTaxServices());
			
			rentalServices.processInvoice(cr);
			String formT = "R$ %.2f";
	
			System.out.println("=============================");
			System.out.println("FATURA: ");
			System.out.println("=============================");

			System.out.println("Pagamento basico: " + String.format(formT, cr.getInvoice().getBasicPayment())) ;
			System.out.println("Imposto: " + String.format(formT, cr.getInvoice().getTax()));
			System.out.println("Pagamento Total: " + String.format(formT, cr.getInvoice().getTotalPayment()));
			System.out.println("=============================");
			
			sc.close();
			
			
	}

}
