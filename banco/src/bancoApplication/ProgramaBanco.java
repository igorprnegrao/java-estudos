package bancoApplication;

import java.util.Locale;
import java.util.Scanner;

import contaCorrente.ContaUsuario;

public class ProgramaBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entrar com o número da conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.print("Entrar com o nome do correntista: ");
		sc.nextLine(); //consumir a quebra de linha 
		String nomeCorrentista = sc.nextLine();
		
		//objeto implementado sem inicializar 
		ContaUsuario contaUsuario;
		
		System.out.print("Você quer fazer um depósito inicial (y/n)? ");
		char respostaValorInicial = sc.next().charAt(0);
		
		if (respostaValorInicial == 'y') {
			System.out.print("Entre com o valor inicial: ");
			Double depositoInicial = sc.nextDouble();
			//inicializando o objeto com construtor 3 parâmetros
			contaUsuario = new ContaUsuario(numeroConta, nomeCorrentista, depositoInicial);
			
		} else {
			//inicializando o objeto com construtor 2 parâmetros
			contaUsuario = new ContaUsuario(numeroConta, nomeCorrentista);
		}
		
		System.out.println();
		System.out.println("Dados da conta");
		System.out.println(contaUsuario);
		
		System.out.println();
		System.out.print("Entre com o valor do depósito: ");
		double depositoValor = sc.nextDouble();
		contaUsuario.depositar(depositoValor);
		System.out.println("Atualizando saldo da conta: ");
		System.out.println(contaUsuario);
		
		System.out.println();
		System.out.print("Qual valor deseja sacar da conta? ");
		double sacarValor = sc.nextDouble();
		contaUsuario.sacar(sacarValor);
		System.out.println("Atualizando saldo da conta: ");
		if(contaUsuario.getSaldoConta() < 0 ) {
			System.out.println("Sua conta esta negativa, entre em contato com o seu gerente");
			System.out.println(contaUsuario);
		} else {
			System.out.println(contaUsuario);
		}
		
		
		
		
		
		
		sc.close();
	
	}

}
