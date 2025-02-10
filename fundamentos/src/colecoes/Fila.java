package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); //exception casa fila esteja cheia
		fila.offer("Bia"); //falso casa fila esteja cheia
		fila.add("Carlos"); //falso
		fila.offer("Daniel"); //falso
		fila.add("Rafaela"); //falso
		fila.offer("Gui"); //falso
		//pega o primeiro nome da fila
		System.out.println(fila.peek()); //retorna null se a fila tiver vazia
		System.out.println(fila.element()); //retorna uma exception se a fila tiver vazia
		
		//fila.size() = tamanho da fila
		// fila.clear() = limpa todos os dados
		// fila.isEmpty() = fila esta vazia ou não
		
		
		//retorna null se a fila tiver vazia
		System.out.println(fila.poll()); // lista o primeiro elemento da fila e exlcui imediatamente
		//retorna uma exception se a fila tiver vazia
		System.out.println(fila.remove());
		
		
		
	}

}
