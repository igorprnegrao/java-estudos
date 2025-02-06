package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos você quer cadastrar: ");
		int numeroAlunos = sc.nextInt();

		System.out.print("Quantas notas por aluno: ");
		int numeroNotas = sc.nextInt();

		double[][] notasDaTurma = new double[numeroAlunos][numeroNotas];
		
		double total = 0;
		
		for (int a = 0; a < notasDaTurma.length; a++) {
			
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				
				System.out.printf("Informe a %d do aluno %d", n, a);
				
				notasDaTurma[a][n] = sc.nextDouble();
				total += notasDaTurma[a][n];
			}
		}

		double media = total / (numeroAlunos * numeroNotas);
		System.out.println("Média da turma é: " + media);
		
		
		sc.close();
	}

}
