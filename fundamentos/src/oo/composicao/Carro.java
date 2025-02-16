package oo.composicao;

public class Carro {

	Motor m1 = new Motor();
	
	void acelerar() {
		if (m1.fatorInjecao < 2.6) {
			m1.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		if (m1.fatorInjecao > 0.5) {
			m1.fatorInjecao -= 0.4;
		}
	}
	
	void ligado() {
		m1.ligado = true;
	}
	
	void desligado() {
		m1.ligado = false;
	}
	
	boolean estarLigado() {
		return m1.ligado;
	}
	
	

}
