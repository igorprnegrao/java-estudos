package entities;

public abstract class TaxPayer {
	
	private String name;
	private Double anuallcome;
	
	public TaxPayer() {
	}
	
	public TaxPayer(String name, Double anuallcome) {
		super();
		this.name = name;
		this.anuallcome = anuallcome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnuallcome() {
		return anuallcome;
	}

	public void setAnuallcome(Double anuallcome) {
		this.anuallcome = anuallcome;
	}
	
	public abstract Double tax();
	
	
}
