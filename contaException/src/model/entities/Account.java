package model.entities;

import model.DomainException.DomainExceptions;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	
	public Account() {
	}


	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}


	public Integer getNumber() {
		return number;
	}


	public void setNumber(Integer number) {
		this.number = number;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public Double getBalance() {
		return balance;
	}


	public void setBalance(Double balance) {
		this.balance = balance;
	}


	public Double getWithdrawLimit() {
		return withdrawLimit;
	}


	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) throws Exception  {
		validationWithdraw(amount);
		this.balance -= amount;
	}
	
	private void validationWithdraw(Double amount) throws Exception{
		if (withdrawLimit < amount) {
			throw new DomainExceptions("Withdraw error: The amount exceeds withdraw limit");
		}
		if (amount > balance) {
			throw new DomainExceptions("Withdraw error: Not enough balance");
		} 
	}
	
	@Override
	public String toString() {
		return "New balance: $" + balance;
	}
	
}
