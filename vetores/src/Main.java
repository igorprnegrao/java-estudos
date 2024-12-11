import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double acumulador = 0;

		for (int i = 0; i < n; i++) {
			acumulador += vect[i];
		}

		double media = acumulador / n;

		System.out.printf("Média de altura %.2f", media);

		sc.close();

	}
}
