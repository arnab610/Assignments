package com.day4;

public class PostGrad extends stud2{
	private int cid;
	private String cname;
	private int fees;
	public PostGrad(int id, char type, String name, int cid, String cname, int fees) {
		super(id, type, name);
		this.cid = cid;
		this.cname = cname;
		this.fees = fees;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}

}
