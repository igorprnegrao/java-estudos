package oo.encapsulamento.casaB;

import java.time.temporal.Temporal;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
			
	
	void testeAcessos() {
		
		//segredo 
		//facoDentroDeCasa 
		//formaDefalar
		//todosSabem 
		Ana mae = new Ana();
		
		System.out.println(mae.segredo); // Pedro não tem acesso ao sefgredo de ana  
		System.out.println(mae.facoDentroDeCasa); //Pedro não tem acesso ao atributos defaut de ana
		System.out.println(mae.formaDefalar); //Pedro não tem acesso ao atributo protected de ana
		System.out.println(mae.todosSabem); //Pedro tem acesso ao atributo public de ana 
		
	}
	
	
}
