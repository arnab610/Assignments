package com.day2;

public class Asg9 {
	private static int sid =550;
	private char stp;
	private String sname;
	public Asg9(char stp, String fname, String lname) {
		
		this.sid= sid+1;
		this.stp = stp;
		this.sname = fname+ lname;
	}
	public Asg9() {
		super();
		this.sid+=1;
	}
	public void displaydetails(Asg9 ob) {
		System.out.println(ob.sname+" "+ ob.stp+" "+ ob.sname);
		System.out.println(sid);
	}
	public static void main(String[] args) {
		Asg9 ob = new Asg9('b',"ala1" , "an1");
		
		ob.displaydetails(ob);
		Asg9 ob1 = new Asg9('a',"ala" , "an");
		ob1.displaydetails(ob1);
	}
}
