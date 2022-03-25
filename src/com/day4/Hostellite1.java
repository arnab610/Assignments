package com.day4;

public class Hostellite1 extends Stud1 {
	private int roomno;
	private String hn;
	
	
	
	
	
	public Hostellite1(int id, char type, String name, double fees, int roomno, String hn) {
		super(id, type, name, fees);
		this.roomno = roomno;
		this.hn = hn;
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public String getHn() {
		return hn;
	}
	public void setHn(String hn) {
		this.hn = hn;
	}
	public void show() {
	super.show();
	System.out.println(hn+" "+ " "+ roomno);
	}
	public static void main(String[] args) {
		Hostellite1 ob = new Hostellite1(100, 'h', "Ankit", 20.0, 343, "RHR");
		//ob.show();
		Hostellite1 ob1 = new Hostellite1(101, 'h', "An", 20.0, 343, "RHR");
		ob1.show();
		ob.show();
		//System.out.println(ob.hn + " " + ob.roomno+" "+ob.fees+" "+ ob.type);
	}

}
