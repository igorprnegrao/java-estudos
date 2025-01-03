package entities;

public  class Individual extends TaxPayer {	
	
	private Double healthExpenditures;
	
	
	public Individual() {
	}
	
	public Individual(String name, Double anuallcome, Double healthExpenditures) {
		super(name, anuallcome);
		this.healthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		if (getAnuallcome() < 2000.0) {
			return getAnuallcome() * 0.15 - healthExpenditures * 0.5;
		} else {
			return getAnuallcome() * 0.25 - healthExpenditures * 0.5;
		}
	}

}
