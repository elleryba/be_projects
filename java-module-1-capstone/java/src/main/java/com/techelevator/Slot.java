package com.techelevator;

import java.text.NumberFormat;

public class Slot {
	private double price;
	private int quantity;
	private NumberFormat formatter = NumberFormat.getCurrencyInstance();
	private VendingMachineItem slotItem;
	
	public Slot(double price, int quantity, NumberFormat formatter, VendingMachineItem slotItem) {
		super();
		this.price = price;
		this.quantity = quantity;
		this.formatter = formatter;
		this.slotItem = slotItem;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public NumberFormat getFormatter() {
		return formatter;
	}

	public void setFormatter(NumberFormat formatter) {
		this.formatter = formatter;
	}

	public VendingMachineItem getSlotItem() {
		return slotItem;
	}

	public void setSlotItem(VendingMachineItem slotItem) {
		this.slotItem = slotItem;
	}

	@Override
	public String toString() {
		return slotItem + " | Price " + formatter.format(price) + " | Quantity available: " + quantity;
	}

}
