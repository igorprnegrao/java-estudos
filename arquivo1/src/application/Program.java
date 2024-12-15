package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//estaciar classe file passando a url do arquivo
		File file = new File("/Users/igornegrao/Documents/java-estudos/arquivo1/int.txt");
		//para ler o arquivo ..usar a classe scanner
		// inicializar o scanner atrubuindo valor nulo
		Scanner sc= null;
		//usar o bloco try / catch 
		try {
			//estanciar o scanner passado o objeto file 
			 sc =  new Scanner(file);
			// usar while passando o scanner fazendo um teste boelando para verificar se ha uma prox linha
			while (sc.hasNextLine()) {
				//se hover uma linha escrever o conteudo da linha do arquivo
				System.out.println(sc.nextLine());
			}
			//caso aja uma exception imprimir a mensagem de erro
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			//usar o bloco finally atribuindo uma condicional, caso o scanner seja diferente de null,
			//fechar a entrada do scanner
		} finally {
			if(sc != null) {
				sc.close();
			}
			
			
		}
	}

}
