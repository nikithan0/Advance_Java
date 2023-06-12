package com.xworkz.electronicsproject.dto;

public class ElectronicsDto {

	private String name;
	private String colour;
	private int price;
	private int date;
	private float warranty;
	
	public ElectronicsDto() {
		super();
	}

	public ElectronicsDto(String name, String colour, int price, int date, float warranty) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.date = date;
		this.warranty = warranty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public float getWarranty() {
		return warranty;
	}

	public void setWarranty(float warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "ElectronicsDto [name=" + name + ", colour=" + colour + ", price=" + price + ", date=" + date
				+ ", warranty=" + warranty + "]";
	}	
}
