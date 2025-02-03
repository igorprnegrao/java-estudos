package instancia;

public class AreaCirc {
		
		double raio;
		static final double pi = 3.14;
		
		AreaCirc(double raio){
			this.raio = raio;
		}
		
		double area() {
			return pi * Math.pow(raio, 2);
		}
		
		static double area(double raio) {
			return pi * Math.pow(raio, 2);
		}
		
}
