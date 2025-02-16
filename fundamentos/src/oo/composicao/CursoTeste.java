package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Igor");
		Aluno aluno2 = new Aluno("Aline");
		Aluno aluno3 = new Aluno("Bia");
		
		Curso curso1 = new Curso("Matemática");
		Curso curso2 = new Curso("Português");
		Curso curso3 = new Curso("Física");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for (Aluno aluno : curso3.alunos) {
			System.out.println("Estou matrículado no curso " + curso3.nome + " ...");
			System.out.println("... e meu nome é " + aluno.nome);
		}
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Matemática");
		
		if (cursoEncontrado != null) {
			System.out.println("o curso " + cursoEncontrado.nome);
			System.out.println("Possui os alunos" + cursoEncontrado.alunos);
		}
		
		
	}

}
