package com.Assignments;

public class simpleinterest {
	int amount;
	int years;
	int rate;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int calculate() 
	{
		int cal=(amount*years*rate)/100;
		return cal;
		
	}
	

}
