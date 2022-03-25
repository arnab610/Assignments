package com.day4;

public class DayScholar extends Stud1 {

	private String res;

	public DayScholar(int id, char type, String name, double fees, String res) {
		super(id, type, name, fees);
		this.res = res;
	}

	public String getRes() {
		return res;
	}

	public void setRes(String res) {
		this.res = res;
	}
	@Override
	public void show() {
		super.show();
		System.out.println(res);
	
	}
}
