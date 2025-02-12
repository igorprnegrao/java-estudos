package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
		public static void main(String[] args) {
			
			Deque<String> livros = new ArrayDeque<>();
			
			livros.add("O pequeno principe");
			livros.push("Senhor dos anéis");
			livros.push("o hobbit");
			
			System.out.println(livros.peek());
			System.out.println(livros.element());
			System.out.println(livros.toString());
			System.out.println(livros.getFirst());
			System.out.println(livros.getLast());
			System.out.println(livros.size());
			
			for(String livro : livros) {
				System.out.println(livro);
			}
			
			
			
			
		}
}
