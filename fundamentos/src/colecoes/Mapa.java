package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto"); //put inclui e substitui 
		usuarios.put(2, "Ricardo"); //put inclui e substitui 
		usuarios.put(3, "Rafaela"); //put inclui e substitui 
		usuarios.put(4, "Rebeca"); //put inclui e substitui 
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Paulo"));
		System.out.println(usuarios.get(3));
		
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String nome: usuarios.values()) {
			System.out.println(nome);
		}
		
		for(Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
	}

}
