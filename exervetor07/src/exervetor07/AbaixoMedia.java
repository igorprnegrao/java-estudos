package exervetor07;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < vet.length; i++) {
			sum += vet[i];
		}
		
		double media = sum / vet.length;
		
		System.out.printf("MEDIA DO VETOR = %.3f %n",  media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		
		for (int i = 0;  i < vet.length; i++) {
			if (vet[i] < media) {
				System.out.printf("%.2f %n ", vet[i]);
			}
		}
		
		
		
		sc.close();
	}

}
