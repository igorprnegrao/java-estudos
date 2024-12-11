package application;

import entities.Account;
import entities.BusinnesAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc1 = new Account(1001, "alex", 1000.00);
		
		acc1.withDraw(200.00);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "maria", 1000.00, 0.01);
		acc2.withDraw(200.00);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinnesAccount(1003, "bob", 1000.00, 500.0);
		
		acc3.withDraw(200.00);
		System.out.println(acc3.getBalance());
		
		
	}
	
}
