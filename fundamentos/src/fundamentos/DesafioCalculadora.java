package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calculadora Básica");
		System.out.println("==================");
		
		System.out.print("Número 01: ");
		double num1 = sc.nextDouble();
		
		System.out.print("Número 02: ");
		double num2 = sc.nextDouble();
		
		System.out.print("Escolha a Operação (+) (-) (*) (/) (%): ");
		String op = sc.next();
		
		double calc = "+".equals(op) ? num1 + num2 : 0.0;
		calc = "-".equals(op) ? num1 - num2 : calc;
		calc = "*".equals(op) ? num1 * num2 : calc;
		calc = "/".equals(op) ? num1 / num2 : calc;
		calc = "%".equals(op) ?  num1 % num2 : calc;
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, calc );
		
		
		sc.close();

	}

}
