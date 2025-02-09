package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConkuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		//add elementos no conjunto
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("teste");
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("teste");
		
		System.out.println("Tamanho é " + conjunto.size());
		
		//remover elementos
		
		System.out.println(conjunto.remove("teste"));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste2"));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste2"));
		
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		// metodo contem
		
		System.out.println(conjunto.contains('x'));
		
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// união entre dois conjuntos
		
		//conjunto.addAll(nums);
		//System.out.println(conjunto);
		
		// interseção entre conjuntos 
		
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		// limpar tudo
		conjunto.clear();
		System.out.println(conjunto);
	}

}
