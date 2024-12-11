package application;

import java.util.Locale;
import java.util.Scanner;

import aluno.AlunoNota;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		AlunoNota notaJoao = new AlunoNota();

		notaJoao.name = sc.nextLine();
		notaJoao.nota1 = sc.nextDouble();
		notaJoao.nota2 = sc.nextDouble();
		notaJoao.nota3 = sc.nextDouble();
		
		if (notaJoao.mediaNota() > 60) {
			System.out.println("Nota Final = " + notaJoao.mediaNota());
			System.out.println("Pass");
		}else {
			System.out.println("Nota Final = " + notaJoao.mediaNota() );
			System.out.println("FAILED");
			System.out.println("Falta " + notaJoao.quantoFalta() + " PONTOS");
		}
		sc.close();
	}

}
