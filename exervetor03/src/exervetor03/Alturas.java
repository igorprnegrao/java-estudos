package exervetor03;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int[ ] idade = new int[n];	
		double[] altura = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa: %n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += altura[i];
		}
		
		int menores = 0;
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				menores ++;
			}
		}
		
		double media = sum / altura.length;
		double porcent = ((double) menores / n ) * 100;
		System.out.printf("Altura média: %.2f %n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f %% %n", porcent);
		
		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nomes[i]);
			} 
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
