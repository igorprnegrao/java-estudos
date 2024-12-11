package exervetor09;

import java.util.Scanner;


public class MaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar?");
		int n = sc.nextInt();
		
		String[] nome = new String[n];
		
		int[] idade = new int[n];
		
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("Dados da %da pessoa:%n", i +1);
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade:  ");
			idade[i] = sc.nextInt();
			
 		}
		
		int velho = idade[0];
		String maisVelho = "";
		for (int i = 0; i < n; i++) {
			if (idade[i] > velho) {
				velho = idade[i];
				maisVelho = nome[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + maisVelho);
		sc.close();

	}

}
