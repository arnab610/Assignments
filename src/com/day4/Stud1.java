package com.day4;

public class Stud1 {
	private int id;
	private char type;
	private String name;private double fees;
Stud1(int id, char type, String name, double fees) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Stud1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void show() {
		System.out.println(name+" "+fees +" "+id+" "+type);
	}
	

}
