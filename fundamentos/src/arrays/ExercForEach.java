package arrays;

import java.util.Arrays;

public class ExercForEach {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.0;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		System.out.println(Arrays.toString(notasAlunoA));

		double totalAlunoA = 0;
		for (double notaA : notasAlunoA) {
			System.out.print(notaA + " ");
			totalAlunoA += notaA;
		}
		System.out.println();
		System.out.println(totalAlunoA);
		System.out.println(totalAlunoA / notasAlunoA.length);

		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10.0 };

		double totalAlunoB = 0;
		for(double notaB : notasAlunoB) {
			System.out.print(notaB + " ");
			totalAlunoB += notaB;
		}
		
		System.out.println(totalAlunoB);
		System.out.println(totalAlunoB / notasAlunoB.length);
	}

}
