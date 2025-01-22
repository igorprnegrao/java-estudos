package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toLowerCase().endsWith("tarde"));
		System.out.println(s.length());
		System.out.println("ola mundo");
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario  = 12345.987;
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f%n", nome, sobrenome, idade, salario );
	
		System.out.println("frase qualquer".contains("qual"));
		
		System.out.println("frase qualquer".indexOf("qual"));
		System.out.println("frase qualquer".substring(6));
		System.out.println("frase qualquer".substring(6, 14));
		
		
	}

}
