package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//peguntar quantos funcionários iremos registrar 
		System.out.print("How many employees will be registered?");
		int n = sc.nextInt(); // entrada da quantidade
	
		//dentro do operador diamante add a entidade classe
		//criar a list e estanciar usando uma interface = ArrayList<>()
		
		List<Employee> list = new ArrayList<>();
		
		// for para add os funcionários
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.printf("Employee #%d%n", i+1);
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			// while usando uma funçaão auxiliar para evitar ids duplicados ao inserir
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again");
				System.out.print("Id: ");
				id = sc.nextInt(); 
			}
			
			
			System.out.print("Name: ");
			//limpeza do buffer 
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			// criar um objeto funcionario usando o construtor da classe funcionario passando logo os argumentos.
			Employee emp = new Employee(id, name, salary);
			// usa o metodo add para add o funcionario a lista 
			list.add(emp);
			
		}
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase : ");
		// id para o aumento do sálario
		int idSalary = sc.nextInt();
		
		// usar função lambda filtrar o id digitado e verificar se existe ou não
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		// condicional se o id não existir na lista retornar a mensagem dizendo q o mesmo nao existe
		// caso emp nao seja null vc insere o valor da porcentagem do aumento
		//a variável emp acessa o método increasesalary que passa um argumento a variável percent
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			
			Double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		System.out.println();
		// usando for each listamos todos os funcionarios, porém add o to string na classe funcionário 
		for (Employee e : list) {
			System.out.println(e);
		}
		
		
		sc.close();
	}
	// função auxiliar booleana que faz a checagem do id para não ocorrer duplicidade
	// usamos novamente uma função lambda que vai retornar o valor do id e caso o id seja diferente de null
	public static Boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	
	}

}
