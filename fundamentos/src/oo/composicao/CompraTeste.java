package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra01 = new Compra();
		compra01.cliente ="João Pedro";
		compra01.itens.add(new Item("Caneta", 20, 7.45));
		compra01.itens.add(new Item("Borracha", 12, 3.89));
		compra01.itens.add(new Item("Caderno", 3, 18.79));
		System.out.println(compra01.itens.size());
		
		System.out.println("TOTAL R$ " + compra01.obterValorTotal());
	}

}
