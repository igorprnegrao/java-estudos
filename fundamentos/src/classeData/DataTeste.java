package classeData;

public class DataTeste {

	public static void main(String[] args) {
		Data dt1 = new Data();
		dt1.dia = 07;
		dt1.mes = 11;
		dt1.ano = 2021;
		
		
		Data dt2 = new Data();
		dt2.dia = 31;
		dt2.mes = 12;
		dt2.ano = 2020;
		
		System.out.printf("Data 01: %d/%d/%d%n", dt1.dia, dt1.mes, dt1.ano);
		System.out.printf("Data 02: %d/%d/%d", dt2.dia, dt2.mes, dt2.ano);

	}

}
