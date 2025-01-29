package fundamentos;

import java.util.Locale;

public class DesafioSalario {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		int a = (int) Math.pow(((int) Math.pow(((3 + 2) * 6), 2) / (3 *2) - 
				(int)Math.pow(((1 - 5) * (2 -7) / 2), 2)), 3) / (int)Math.pow(10, 3);
		System.out.println("Resultado da equação é " + a);

	}

}
