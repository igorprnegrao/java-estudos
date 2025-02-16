package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		System.out.println("status do motor (ON): " + c1.estarLigado());
		
		c1.ligado();
		System.out.println("status do motor (ON): " + c1.estarLigado());
		
		System.out.println("Giros do motor: " + c1.m1.giros() + " Rotações/min");
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println();
		System.out.println("Giros do motor: " + c1.m1.giros() + " Rotações/min");
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		System.out.println();
		System.out.println("Giros do motor: " + c1.m1.giros() + " Rotações/min");
	}

}
