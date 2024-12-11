package conversor;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double conversorMoeda(double price, double dollarValue) {
		double conversao = price * dollarValue;
		double taxaDoValor = price * dollarValue * IOF;
		
		return conversao + taxaDoValor;
	}
}
