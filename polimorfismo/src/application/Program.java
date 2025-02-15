package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> emplist = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			System.out.printf("Employee #%d data:%n", i + 1);
			
			System.out.print("Outsourced (y/n)? ");
			char tipeEmp = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if (tipeEmp == 'y') {
				
				System.out.print("Additional charge: ");
				Double addtionalCharge = sc.nextDouble();
				
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, addtionalCharge);
				emplist.add(emp);
				
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				emplist.add(emp);
			}
			
			
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");

		for (Employee employee : emplist) {
			System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()) );
		}
		
		
		
		sc.close();
	}
}
