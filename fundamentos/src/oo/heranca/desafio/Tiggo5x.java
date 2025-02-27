package oo.heranca.desafio;

public class Tiggo5x extends Carro{

	Tiggo5x(int velocidadeMaxima) {
		super(330);
		
	}

	void acelerar(Carro aceleracao) {
		aceleracao.velocidade += 15;
	}
	
	@Override
	void frear(Carro frenagem) {
		if (velocidade > 0) {
			frenagem.velocidade -= 15;
		} else {
			System.out.println("velocidade do Tiggo5x é 0: veículo parado.");
		}
		
		
	}
}
