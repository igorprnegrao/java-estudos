package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro civic = new Civic(300);
		civic.acelerar(civic);
		civic.frear(civic);
		civic.frear(civic);
		civic.frear(civic);
		civic.frear(civic);
		
	
		
		
		
		Carro tiggo5x = new Tiggo5x(300);
		tiggo5x.acelerar(tiggo5x);
		tiggo5x.acelerar(tiggo5x);
		tiggo5x.acelerar(tiggo5x);
		
		System.out.println(tiggo5x.velocidade);
		System.out.println(civic.velocidade);
	}

}
