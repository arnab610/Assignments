package com.day4;

public class Hostellite extends Student{
	private int roomno;
	private String hn;
	public Hostellite(int id, char type, String name, double fees, int roomno, String hn) {
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
	public static void main(String[] args) {
		Hostellite ob = new Hostellite(100, 'h', "Ankit", 20.0, 343, "RHR");
		System.out.println(ob.hn + " " + ob.roomno+" "+ob.fees+" "+ ob.type);
	}

}
