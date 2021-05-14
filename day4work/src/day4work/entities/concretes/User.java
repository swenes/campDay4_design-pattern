package day4work.entities.concretes;

import day4work.entities.abstracts.Entities;

public class User implements Entities{

	private String identity;
	private String firstName;
	private String lastName;
	private String birthOfDate;
	private double balance;

	public User(String identity, String firstName, String lastName, String birthOfDate,double balance) {
		super();
		this.identity = identity;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.balance=balance;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthOfDate() {
		return birthOfDate;
	}

	public void setBirthOfDate(String birthOfDate) {
		this.birthOfDate = birthOfDate;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
