package exervetor01;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [ ] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um valor: ");
			vetor[i] = sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		
		
		sc.close();

	}

}
