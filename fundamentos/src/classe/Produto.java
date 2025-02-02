package classe;

public class Produto {
	
	
	String nome;
	double preco;
	double desconto;
	
	double descontoProduto(double preco, double desconto) {
		
		
		return  preco - (preco * desconto);
	}
	
}
