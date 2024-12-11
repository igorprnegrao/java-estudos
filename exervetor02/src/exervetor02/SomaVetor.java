package exervetor02;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		double[] vet = new double[n];

		for (int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero:");
			vet[i] = sc.nextDouble();
		}

		System.out.print("VALORES = ");
		for (int i = 0; i < vet.length; i++) {
			System.out.printf("%.1f ", vet[i]);
		}
		System.out.println();

		double sum = 0.0;

		for (int i = 0; i < vet.length; i++) {
			sum += vet[i];
		}

		System.out.printf("SOMA = %.2f %n", sum);

		double media = sum / vet.length;

		System.out.printf("MEDIA = %.2f", media);

		sc.close();
	}

}
