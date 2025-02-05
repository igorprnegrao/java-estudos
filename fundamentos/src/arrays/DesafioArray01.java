package arrays;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class DesafioArray01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("quantas notas você quer informar: ");
		int n = sc.nextInt();
		
		double [] notas = new double [n];
		
		for (int i = 0;  i < notas.length; i ++) {
			System.out.print("Digite a nota " + (i + 1) + ":");
			notas[i] += sc.nextDouble();
			
		}
		
		System.out.println("As notas inseridas foram: " + Arrays.toString(notas));
		double total = 0;
		for (double nota : notas) {
			total+= nota;
		}
		
		System.out.println("A média das notas: " + total / notas.length);
		
		sc.close();

	}

}
