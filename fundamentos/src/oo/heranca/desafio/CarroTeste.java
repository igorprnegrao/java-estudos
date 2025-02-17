package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Civic civic = new Civic();
		civic.acelerar(civic);
		Tiggo5x tiggo5x = new Tiggo5x();
		
		System.out.println(civic.velocidade);
	}

}
