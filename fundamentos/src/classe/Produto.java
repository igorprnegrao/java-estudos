package classe;

public class Produto {
	
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(){
	}
	
	public Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	double descontoProduto() {
		
		return  preco * (1 - desconto);
	}
	
}
