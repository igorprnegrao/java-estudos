package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	
	public static void main(String[] args) {
		
		Set <String> lista = new TreeSet<>();
		lista.add("Aline");
		lista.add("Carlos");
		lista.add("Maria");
		lista.add("Jorge");
		
		Set <String> lista2 = new HashSet<>();
		lista2.add("Ana");
		lista2.add("Pedro");
		lista2.add("Sandra");
		lista2.add("Rute");
		
		for(String nomes : lista) {
			
			System.out.println(nomes + " ");
		}

		
		System.out.println(lista2);
		
		Set <Integer> nums = new HashSet<>();
		nums.add(983);
		nums.add(556);
		nums.add(711);
		nums.add(671);
		System.out.println(nums);
		
	}

}
