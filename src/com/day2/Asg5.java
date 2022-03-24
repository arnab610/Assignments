package com.day2;

public class Asg5 {
	private int sid;
	private char stp;
	public Asg5(int sid, char stp) {
		super();
		this.sid = sid;
		this.stp = stp;
	}
	public char getStp() {
		return stp;
	}
	public int getSid() {
		return sid;
	}
	
	public static void main(String[] args) {
		Asg5 ob1 = new Asg5(7, 'F');
       System.out.println(ob1.getSid()+" "+ ob1.getStp());
	}
}
