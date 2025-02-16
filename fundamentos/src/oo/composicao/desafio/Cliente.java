package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
			
			final String nome;
			final List<CompraDasaf> compras = new ArrayList<>();
			
			
			Cliente(String nome) {
				this.nome = nome;
			}
			
			void adicionarCompra(CompraDasaf compra) {
				this.compras.add(compra);
			}
			
			double obterValorTotal() {
				double total = 0;
				
				for (CompraDasaf compraDasaf : compras) {
					total += compraDasaf.obterValorTotal();
				}
				
				return total;
				
			}
			
			
			
			
}
