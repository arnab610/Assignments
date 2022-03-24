package com.day2;

public class Asg8 {
	static int i=22;
	static int j=14000;
	static boolean k,l;
	public static void main(String[] args) {
		Asg8 ob = new Asg8();
		k = ob.m1(i);
		l = ob.m2(j);
		if(k==true && l == true)
			System.out.println("Is a new Employee");
		else
			System.out.println("Not a new employee");
		
	}
public boolean m1(int i) {
	if (i>20 && i<30)
		return true;
	else
		return false;
}
public boolean m2(int j) {
	if(j>14000 && j<20000)
		return true;
	else
		return false;
}

}
