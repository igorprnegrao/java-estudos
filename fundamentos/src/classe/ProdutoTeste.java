package classe;

public class ProdutoTeste {
	
		public static void main(String[] args) {
		
			Produto p1 = new Produto();
			double desconto = p1.descontoProduto(100, 0.20);
			System.out.println("Preço do método com desconto R$ " + desconto);
			
			
			p1.nome= "Notebook";
			p1.preco = 4356.89;
			p1.desconto = 0.25;
			
			var p2 = new Produto();
			
			p2.nome = "Caneta Preta";
			p2.preco =  12.56;
			p2.desconto = 0.29;
			
			System.out.println(p1.nome);
			System.out.println(p2.nome);
			
			double precoFinal1 = p1.preco * (1 - p1.desconto);
			double precoFinal2 = p2.preco * (1 - p2.desconto);
			System.out.printf("Preço Final Produto 01 = R$%.2f%n", precoFinal1);
			System.out.printf("Preço Final Produto 02 = R$%.2f%n", precoFinal2);
			double mediaFinal = (precoFinal1 + precoFinal2) / 2;
			System.out.printf("Média Final = %.2f", mediaFinal );
		}
}
