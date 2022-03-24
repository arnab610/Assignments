package com.day3;

public class Asg2 {
public static void main(String[] args) {
	int a[][]= {{1,1,1}, {1,1,1}};
	int b[][]= {{2,2,2}, {2,2,2}};
	for(int i=0;i<a.length; i++) {
		for(int j=0;j<3; j++) {
			System.out.print(a[i][j]);}
			System.out.println();
		}
	for(int i=0;i<b.length; i++) {
		for(int j=0;j<3; j++) {
			System.out.print(b[i][j]);}
			System.out.println();
		}
	for(int i=0;i<a.length; i++) {
		for(int j=0;j<3; j++) {
			System.out.print(a[i][j]+b[i][j]+" ");}
			System.out.println();
		}
	}
}

