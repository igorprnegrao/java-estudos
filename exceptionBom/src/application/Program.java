package application;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		// estanciar o simpleDateFormate para trabalhar com data
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
	
			System.out.print("Check-in date (dd/MM/yyyy): ");
			// usar o a variavel do obejto sdf inluindo o parse....
			// atenção add throws ParseException na assinatura main
			Date checkin = sdf.parse(sc.next());
	
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkout = sdf.parse(sc.next());
			// condicional se o checkout não foi depois do checkin...mostrar error,
			// caso esteja certo estanciar o objeto reserva
			
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println(reservation);
	
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
	
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkin = sdf.parse(sc.next());
	
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkout = sdf.parse(sc.next());
	
			reservation.updateDates(checkin, checkout);
			
			//dois modos de verificar exception...propagando ou capturando
			//escolhemos a opção de captura DomainException pegando a msg através do .getMessage
			System.out.println(reservation);
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();

		

	}
}

