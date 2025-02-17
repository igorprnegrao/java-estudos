package oo.heranca.desafio;

public class Carro {
		
		int velocidade = 50;
		
		
		void acelerar(Carro aceleracao) {
			aceleracao.velocidade += 5;
		}
		
		void frear(Carro frenagem) {
			frenagem.velocidade -= 5;
		}
}
