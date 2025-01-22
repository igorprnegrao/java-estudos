package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioSalario {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu primeiro salário: ");
		String valor1 = sc.nextLine().replace(",", ".");
		
		System.out.println("Informe seu segundo salário: ");
		String valor2 = sc.nextLine().replace(",", ".");
		
		System.out.println("Informe seu terceiro salário: ");
		String valor3 = sc.nextLine().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("a média dos salários é R$ %.2f", media);
		
		
		sc.close();

	}

}
