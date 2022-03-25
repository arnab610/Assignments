package com.day4;

public class Student {
private int id;
protected char type;
protected String name;protected double fees;
public Student(int id, char type, String name, double fees) {
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
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}
