package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinnesAccount;
import entities.SavingsAccount;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "alex", 500.0, 0.01));
		list.add(new BusinnesAccount(1002, "maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "bob", 300.0, 0.01));
		list.add(new BusinnesAccount(1005, "anna", 500.0, 300.0));
		
		Double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		
		System.out.println("--------------------------------------------");
		
		for (Account acc : list) {
			acc.deposit(10.0);
		}
		
		Double sum1 = 0.0;
		for (Account acc : list) {
			sum1 += acc.getBalance();
		}
		
		for (Account acc : list) {
			System.out.printf("Updated balance for account %d: R$ %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
		System.out.println("--------------------------------------------");
		
	
		System.out.printf("             ** Total balance: R$ %.2f **%n", sum);
		System.out.println("--------------------------------------------");
		}
	}
