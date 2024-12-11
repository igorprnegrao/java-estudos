package aluno;


public class AlunoNota {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double mediaNota() {
		return nota1 + nota2 + nota3;
	}
	public double quantoFalta() {
		return 60 - mediaNota();
	}
}
