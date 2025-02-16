package oo.composicao;

import java.util.ArrayList;

public class Compra {
		
		String cliente;
		ArrayList<Item> itens = new ArrayList<>();
		
		
		double obterValorTotal(){
			double valorTotal = 0;
			for (Item item : itens) {
				valorTotal += item.preco * item.quantidade;
			}
			
			return valorTotal;
		}
}
