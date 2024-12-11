package exervetor04;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		
		int[] vet = new int[n];
		

		for (int i = 0; i < vet.length; i++) {
			vet[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				System.out.printf("%d ", vet[i]);
			}
		}
		System.out.println();
		
		int sum = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				sum ++;
			}
		}
		
		System.out.println("QUANTIDADE DE PARES = " + sum);
		
		
		sc.close();

	}

}
