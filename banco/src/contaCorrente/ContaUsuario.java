package contaCorrente;

public class ContaUsuario {
	
	// atributos
	private int numeroConta;
	private String nomeCorrentista;
	private double saldoConta;
	
	// construtor default 
	public ContaUsuario() {
		
	}
	// construtor de inicialização 3 argumentos
	public ContaUsuario(int numeroConta, String nomeCorrentista, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
		depositar(depositoInicial);
	}
	
	//sobrecarga do construtor 2 argumetos
	
	public ContaUsuario(int numeroConta, String nomeCorrentista) {
		this.numeroConta = numeroConta;
		this.nomeCorrentista = nomeCorrentista;
	}
	
	
	// Getters and Setters
	public int getNumeroConta() {
		return numeroConta;
	}
	
	// depois da conta cadastrada não alterar mais - usar apenas o método GET
	public String getNomeCorrentista() {
		return nomeCorrentista;
	}

	public void setNomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}
	
	// apenas pegar o saldo, aterações somente através dos métodos sacar e depositar
	public double getSaldoConta() {
		return saldoConta;
	}
	
	
	// métodos específicos
	public void  depositar(double contaUsuario) {
		this.saldoConta += contaUsuario;
	}
	
	public void sacar(double contaUsuario) {
		this.saldoConta -= contaUsuario + 5.0;
	}
	
	// usar o método toString para transformar o objeto em string
	@Override
	public String toString() {
		return "conta da nº " + numeroConta + ", "
				+ "nome do correntista: " + nomeCorrentista + ", "
				+ String.format("saldo na conta: R$ %.2f reais.", saldoConta);
			
	}
}
