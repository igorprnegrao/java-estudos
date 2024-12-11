package exervetor11;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double menor;
		
		System.out.print("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Altura da %da pessoa: ", i + 1);
			altura[i] = sc.nextDouble();
			System.out.printf("Altura da %da pessoa: ", i + 1);
			genero[i] = sc.next().charAt(0);
			
		}
		System.out.print("Menor altura = ");
		menor = altura[0];
		for (int i = 0; i < n; i++) {
			if (altura[i] < menor) {
				menor = altura[i];
			}
		}
		
		System.out.println(menor);
		
		System.out.print("Maior altura = ");
		double maior = altura[0];
		for (int i = 0; i < n; i++) {
			if (altura[i] > maior) {
				maior = altura[i];
			}
		}
		System.out.println(maior);
		
		
		double sum = 0;
		double contFA = 0;
		double contM = 0;
		for (int i = 0; i < n; i++) {
			if (genero[i] == 'f') {
				sum += altura[i];
				contFA ++;
			} else {
				contM ++;
			}
			
		}
		
		double media = sum / contFA;
		
		System.out.printf("Media das alturas das mulheres = %.2f%n", media);
		
		System.out.print("Numero de homens = " + contM);
		
		sc.close();

	}

}
