package exervetor08;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		int sum = 0;
		int somaPar = 0;
		
		for (int i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				sum += vet[i];
				somaPar ++;
			}
		}
		
		if (somaPar == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			double media = sum / somaPar;
			System.out.println("MEDIA DOS PARES = " + media);
		}
		
		sc.close();
	}

}
