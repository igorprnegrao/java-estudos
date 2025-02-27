package oo.heranca.desafio;

public class Civic extends Carro {
	
	Civic(int velocidadeMaxima) {
		super(212);
		
	}

	@Override
	void frear(Carro frenagem) {
		if (velocidade > 0) {
			frenagem.velocidade -= 5;
		} else {
			System.out.println("velocidade do Civic é 0: veículo parado.");
		}
	}
}

