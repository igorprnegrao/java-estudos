package oo.heranca.desafio;

public class Carro {
		final int VELOCIDADE_MAXIMA;
		int velocidade;
		int delta = 5;
		
		Carro(int velocidadeMaxima){
			VELOCIDADE_MAXIMA = velocidadeMaxima;
		}
		void acelerar(Carro aceleracao) {
			if (velocidade + delta > VELOCIDADE_MAXIMA) {
				velocidade = VELOCIDADE_MAXIMA;
			} else {
				aceleracao.velocidade += delta;
			}
			
		}
		
		void frear(Carro frenagem) {
			if (velocidade >= 5) {
				frenagem.velocidade -= 5;
			} else {
				velocidade = 0;
			}
			
		}
}
