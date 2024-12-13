package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		//estanciar o simpleDateFormate para trabalhar com data
		SimpleDateFormat  sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		//usar o a variavel do obejto sdf inluindo o parse....
		//atenção add throws ParseException na assinatura main
		Date checkIn = sdf.parse(sc.next());
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		//condicional se o checkout não foi depois do checkin...mostrar error, 
		//caso esteja certo estanciar o objeto reserva
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println(reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			//estanciei um date ..mostrado a data atual
			Date now = new Date();
			//condicional regra de negocio checkin e checkout não deve ser antes da data atual 
			//e checkout não deve ser antes do checkin
			if (checkIn.before(now) || checkOut.before(now) ) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			} else if (!checkOut.after(checkIn)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			} else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println(reservation);
			}
			
			
		}
		
		
		sc.close();

	}

}
