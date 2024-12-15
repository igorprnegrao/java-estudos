package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	//jeito certo para ler arquivos 
	public static void main(String[] args) {
		//variável path contendo o caminho do arquivo
		String path = "/Users/igornegrao/Documents/java-estudos/arquivo1/int.txt";
		
		//usar o tratamento de exception try / catch passando o fileReader e bufferReader
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			//variável line vai receber br.readLine();-
			String line = br.readLine();
			//usar while enquanto tiver linha 
			while (line != null) {
				//imprimir cada linha
				System.out.println(line);
				//chamar a leitura de uma nova linha
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
