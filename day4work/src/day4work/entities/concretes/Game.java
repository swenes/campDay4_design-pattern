package day4work.entities.concretes;

import day4work.entities.abstracts.Entities;

public class Game implements Entities {

	private String name;
	private double unitPrice;

	public Game(String name, double unitPrice) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
