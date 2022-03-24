package com.day1;

public class Assignment2 {
	public static void main(String[] args) {
		int iv =10;
		float fv =3.0f;
		boolean b1 =true;
		boolean b2 =true;
		boolean b3 =true;
		System.out.println(iv + " % " + fv + "="+(iv % fv));
		System.out.println();
		System.out.println("String Concatenation");
		System.out.println("Day"+ 2+ "Session");
		System.out.println("\n"+ 2+3+"\n"+ (2+3));
		System.out.println();
		System.out.println("Relational");
		System.out.println(iv + "=="+ fv+"=="+ (iv==fv));
		fv = 10.0f;
		System.out.println(iv + "=="+ fv+"=="+ (iv==fv));
		System.out.println();
		b2 = false;
		if(b1 || (b1 &&(b2=false))) {
			System.out.println("Success");
		}
		else {
			System.out.println("Failure");
			
		}
		System.out.println("bool2 value :"+ b2);
		}
		
		
		
	}


