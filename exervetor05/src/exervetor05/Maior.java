package exervetor05;


import java.util.Locale;
import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		System.out.println();
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero:  ");
			vet[i] = sc.nextDouble();
		}
		System.out.println();
		double maior = vet[0];
		int posMaior = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posMaior = i;
			}
		}
		
		
		System.out.printf("MAIOR VALOR = %.1f%n", maior);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d%n", posMaior);
		sc.close();

	}

}
