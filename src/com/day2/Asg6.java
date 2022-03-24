package com.day2;

public class Asg6 {
String name;

public Asg6(String name) {
	super();
	this.name = name;
}

public Asg6() {
	
	this("Student");
}
public static void main(String[] args) {
	Asg6 ob = new Asg6("Faculty");
	Asg6 ob1 = new Asg6();
	System.out.println(ob.name);
	System.out.println(ob1.name);
}
}
