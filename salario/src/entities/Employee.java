package entities;


public class Employee {
		// atributos
		public String name;
		public double grossSalary;
		public double tax = 1000;
		
		
		// métodos salario bruto taxado 
		public double netSalary() {
			return grossSalary - tax;
		}
		//metodo aumento do salario ja com a taxa de imposto
		public void increaseSalary(double percentage) {
			grossSalary += grossSalary * percentage / 100.0 ;
		}
		
		@Override
		public String toString() {
			
		return name + ", $ " + String.format("%.2f", netSalary());
		}
}
