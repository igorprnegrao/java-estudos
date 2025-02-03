package classe;

public class ProdutoTeste {
		
		int a = 3;
		public static void main(String[] args) {
			
			ProdutoTeste produtoTeste = new ProdutoTeste();
		
			System.out.println(produtoTeste.a);
			
			Produto p3 = new Produto("Iphone", 1000.0);
			//Produto.desconto = 0.5;
			String nameString =p3.nome;
			double desc = p3.descontoProduto();
			System.out.println("nome: "+ nameString+ " R$ " + desc);
		
			//Produto p1 = new Produto("Notebook");
			//double desconto = p1.descontoProduto(100, 0.20);
			//System.out.println("Preço do método com desconto R$ " + desconto);
			
			//p1.preco = 4356.89;
			//p1.desconto = 0.25;
			
			//var p2 = new Produto("joao");
			
			//p2.nome = "Caneta Preta";
			//p2.preco =  12.56;
			//p2.desconto = 0.29;
			
			//System.out.println(p1.nome);
			
			//double precoFinal1 = p1.preco * (1 - p1.desconto);
			
			//double precoFinal2 = p2.preco * (1 - p2.desconto);
			//System.out.printf("Preço Final Produto 01 = R$%.2f%n", precoFinal1);
			//System.out.println(p2.nome);
			//System.out.printf("Preço Final Produto 02 = R$%.2f%n", precoFinal2);
			//double mediaFinal = (precoFinal1 + precoFinal2) / 2;
			//System.out.printf("Média Final = %.2f", mediaFinal );
		}
}
