package com.techelevator;

import java.text.NumberFormat;

public class VendingMachine {
	private double currentBal = 0.00;
	private NumberFormat formatter = NumberFormat.getCurrencyInstance();
	public double getCurrentBal() {
		return currentBal;
	}
	public void setCurrentBal(double currentBal) {
		this.currentBal = currentBal;
	}
	public NumberFormat getFormatter() {
		return formatter;
	}
	public void setFormatter(NumberFormat formatter) {
		this.formatter = formatter;
	}
	

}
