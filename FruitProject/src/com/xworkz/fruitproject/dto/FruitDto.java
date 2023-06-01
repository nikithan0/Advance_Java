package com.xworkz.fruitproject.dto;

public class FruitDto {
	
	private String fruitName;
	private String color;
	private String shape;
	private int cost;
	private int weight;
	
	public FruitDto() {
		super();
	}

	public FruitDto(String fruitName, String color, String shape, int cost, int weight) {
		super();
		this.fruitName = fruitName;
		this.color = color;
		this.shape = shape;
		this.cost = cost;
		this.weight = weight;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "FruitDto [fruitName=" + fruitName + ", color=" + color + ", shape=" + shape + ", cost=" + cost
				+ ", weight=" + weight + "]";
	}
	
	
	
	

}
