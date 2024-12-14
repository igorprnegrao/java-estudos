package application;

import java.util.Locale;
import java.util.Scanner;

import model.DomainException.DomainExceptions;
import model.entities.Account;

public class Program {

	public static void main(String[] args) throws Exception {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
		
		
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial balance:  ");
			Double balance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			Double withdraw = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, withdraw);
			
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			
			try {
				acc.withdraw(amount);
				System.out.println(acc);
			} catch (DomainExceptions e) {
				System.out.println(e.getMessage());
			}
			
			
			
			
		
		
		
		
		
		
		
		
		sc.close();

	}

}
