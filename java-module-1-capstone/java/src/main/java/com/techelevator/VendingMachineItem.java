package com.techelevator;

public class VendingMachineItem {
	private String name;
	private String type;
	
	public VendingMachineItem(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return name + " " + type;
	}

}
