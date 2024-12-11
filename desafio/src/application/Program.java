package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		Scanner sc = new Scanner(System.in);
		//criei um vetor a patir de uma classe com 10 posições 
		
		Rent[] vect = new Rent[10];
		
		System.out.print("Quantos quartos você vai alugar? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.printf("Rent #%d: %n", i);
			sc.nextLine();
			
			System.out.print("name: ");
			String name = sc.nextLine();
			
			System.out.print("email:  ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			//estanciei um objeto com os argumetos nome e email
			Rent rent = new Rent(name, email);
			//vetor no número do quarto vai receber o objeto rent 
			vect[roomNumber] = rent;	
		}
		System.out.println();
		System.out.println("Quartos Ocupados: ");
		
		// para imprimir os quartos ocupados o vect[i] deve ser diferente de null, por padrão o vetor não usado é null
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}

}
