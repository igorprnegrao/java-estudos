package exervetor06;

import java.util.Scanner;

public class SomaVet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		
		int[] vetA = new int[n];
		
		int[] vetB = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			vetA[i] = sc.nextInt();
			
		}
		
		System.out.println("Digite os valores do vetor A: ");
		for (int i = 0; i < n; i++) {
			vetB[i] = sc.nextInt();
			
		}
		
		System.out.println("VETOR RESULTANTE:");
		
		for (int i = 0; i < n; i++) {
			System.out.println(vetA[i] + vetB[i] );
		}
		
		
		
		
		
		
		sc.close();

	}

}
