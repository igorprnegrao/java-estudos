package colecoes;

import java.util.ArrayList;

public class Listas {
		public static void main(String[] args) {
			//criei a lista usando a classe usuario como tipo
			ArrayList<Usuario> lista = new ArrayList<>();
			//posso criar um objeto usuario e depois add na lista 
			Usuario u1 = new Usuario("Ana");
			lista.add(u1);
			//ou add o objeto direto no metodo add da list
			lista.add(new Usuario("carlos"));
			lista.add(new Usuario("Lia"));
			lista.add(new Usuario("Bia"));
			lista.add(new Usuario("Manu"));
			
			//sempe add ponto e  o atributo que vc quer mostra ou buscar
			for (Usuario u : lista) {
				System.out.println(u.nome);
			}
			
			System.out.println("=================");
			System.out.println(lista.get(3).nome); //acessar pelo índice
			System.out.println("=================");
			//quando vc usa o metodo toString não precisa usar ponto + antributo
			for (Usuario u : lista) {
				System.out.println(u);
			}
			
			System.out.println("=================");
			System.out.println(lista.get(3));
			
		}
}
