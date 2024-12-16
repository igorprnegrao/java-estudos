package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho da pasta: ");
		String strPath = sc.nextLine();
		
		 File path = new File(strPath);
		
		
		
		
		sc.close();

	}

}
