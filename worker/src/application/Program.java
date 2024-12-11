package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		// instanciar data formatada 
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		//add nome do departamento 
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter Work data: ");
		// add nome do trabalhador
		System.out.print("name: ");
		String workName = sc.nextLine();
		//
		System.out.print("Level: ");
		String workLevel = sc.nextLine();
		
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();
		// instanciar o objeto trabalhador e passar os parametros acima 
		Worker worker = new Worker(workName, WorkerLevel.valueOf(workLevel),
				baseSalary, new Department(departmentName) );
		
		System.out.println("How many contracts to this work? ");
		int numberContracts = sc.nextInt();
		
		for (int i = 0; i < numberContracts; i++) {
			System.out.printf("Enter contract #%d data: ", i + 1);
			
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			
			System.out.print("Value pert hour: ");
			double valuePerHour = sc.nextDouble();
			
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			// instaciar o contrato passando os dados data do cotrato, valor por hora e quantidade de horas 
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			//linkar meu contrato a classe work
			worker.addContract(contract);
		}
		
		System.out.println();
		
		System.out.print("Enter month  and year to caculate income (MM/YYYY): ");
		//usuario vai digitar mês e ano
		String monthAndYear = sc.next();
		//capturamos o indice 0 e 1 do mês e transformamos em inteiros e o ano a partir do indice 3 em diante 
		int month = Integer.parseInt(monthAndYear.substring(1, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		// para pegar o nome do trabalhador variavel estanciada .getName
		System.out.println("Name: " + worker.getName());
		//para pegar o nome do departamento acessara variavel objeto worker. pegar  o nome do departamento .getDepatment()
		// e depois o nome do departamento .getName()
		System.out.println("Departement: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f ", worker.income(year, month)));
		
		
		
		sc.close();

	}

}
