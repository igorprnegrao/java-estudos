package temp;



public class Temperadtura {

	public static void main(String[] args) {
		final double FATOR = 32;
		final double DIV = 5.0/ 9.0;
		
		double fire = 80;
		double c = (fire - FATOR) * DIV;
		System.out.println(c);
	}

}
