package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;
	
	public Company() {
	}
	
	
	public Company(String name, Double anuallcome, Integer numberOfEmployees) {
		super(name, anuallcome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}


	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}


	@Override
	public Double tax() {
		if (numberOfEmployees > 10) {
			return getAnuallcome() * 0.14;
		} else {
			return getAnuallcome() * 0.16;
		}
	}

}
