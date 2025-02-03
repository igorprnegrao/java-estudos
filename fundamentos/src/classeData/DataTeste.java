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
		System.out.printf("Data 02: %d/%d/%d%n", dt2.dia, dt2.mes, dt2.ano);
		
		Data dt3 = new Data();
		dt3.dia = 06;
		dt3.mes = 11;
		dt3.ano = 1985;
		System.out.println(dt3.obterDataFormatada());
		
		Data dt4 = new Data(06, 8, 1984);
		System.out.println(dt4.obterDataFormatada());
		
		Data dt5 = new Data();
		
		System.out.println(dt5.obterDataFormatada());
	}

}
