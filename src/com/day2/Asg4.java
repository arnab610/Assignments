package com.day2;

public class Asg4 {
public static void main(String[] args) {
	final char i ='B';
	switch(i) {
	case 'A':
		System.out.println("80-100");
		break;
	case 'B':
		System.out.println("73-79");
		break;
	case 'C':
		System.out.println("65-72");
		break;
	case 'D':
		System.out.println("55-64");
		break;
	case 'E':
		System.out.println("<55");
		break;
		default:
			System.out.println("Grade not exists");
	}
}
}
