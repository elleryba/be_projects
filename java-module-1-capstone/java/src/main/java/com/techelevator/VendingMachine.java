package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.NumberFormat;
import java.util.Scanner;

public class VendingMachine {
	private double currentBal = 0.00;
	private NumberFormat formatter = NumberFormat.getCurrencyInstance();

	public void printBanner() throws FileNotFoundException{
	File bannerTxt = new File("banner.txt");
	Scanner inputFile = new Scanner(bannerTxt);
	
	while(inputFile.hasNext()) {
		String aLine = inputFile.nextLine();
		System.out.println(aLine);
	}
	inputFile.close();
	}

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
