package entities;

public class BusinnesAccount extends Account {
	private Double loanLimit;
	
	
	public BusinnesAccount() {
		super();
	}
	
	public BusinnesAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(Double amont) {
		if (amont <= loanLimit) {
			balance += amont - 10;
		}
		
	}
	
	@Override
	public void withDraw(Double amount) {
		super.withDraw(amount);
		balance -= 2.0;
	}
}
