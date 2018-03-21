package com.scs.junit;

public class Triangle {
	
	public int Triangle(int a, int b, int c) {
		int state = 0;
		int temp = a-b;
		int differ = Math.abs(temp);
		if(a+b>c && differ<c && a!=0 && b!=0 && c!=0){
			state = 1;
		}
		return state;
	}
	
	public String Equilateral(int a, int b, int c) {
		String str = "NotEquilateral";
		if(a == b) {
			if(b == c)
				str = "Equilateral";
		}
		return str;
	}
	
	public String Isosceles(int a, int b, int c) {
		String str = "NotIsosceles";
		
		if(Triangle(a,b,c) == 1) {
			if(a == b | b == c | a == c)
				str = "Isosceles";
		}
		
		return str;
	}
	
	public String Ordinary(int a, int b, int c) {
		String str = "NotOrdinary";
		
		if(Triangle(a,b,c) == 1) {
			if(Isosceles(a,b,c) == "NotIsosceles")
				str = "Ordinary";
		}
		
		return str;
	}
	
}
