package oo.composicao.desafio;

public class ClienteTeste {
		public static void main(String[] args) {
			
			CompraDasaf compraDasaf1 = new CompraDasaf();
			compraDasaf1.adicionarItem("Caneta", 1, 100);
			compraDasaf1.adicionarItem(new Produto("Notebook", 2000), 2 );
			
			CompraDasaf compraDasaf2 = new CompraDasaf();
			compraDasaf2.adicionarItem("Caderno", 10, 10);
			compraDasaf2.adicionarItem(new Produto("Impressora", 1000), 1);
			
			Cliente cliente = new Cliente("Maria Julia Moraes");
			
			cliente.adicionarCompra(compraDasaf1);
			cliente.adicionarCompra(compraDasaf2);
			
			
			System.out.println(cliente.obterValorTotal());
		}
}
