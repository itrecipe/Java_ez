package com.h.ch04;

public class Ex04_02 {

	public static void main(String[] args) {
	
		int x = 0;
		System.out.printf("x=%d ?�� ?��, 참인 것�?%n", x);
		
		if(x==0) { 
			System.out.println("x==0");
		}
		if(x!=0) { 
			System.out.println("x!=0");
		}
		if(!(x==0)) { 
			System.out.println("!(x==0)");
		}
		if(!(x!=0)) { //x�? 0?��?��?�� !false�? ?��?�� 블록?��?���? ?��?���?
			System.out.println("!(x!=0)");
		}
		
		x = 1;
		System.out.printf("x=%d ?�� ?��, 참인 것�?%n", x);
		
		if(x==0) { 
			System.out.println("x==0");
		}
		if(x!=0) {
			System.out.println("x!=0");
		}
		if(!(x==0)) {
			System.out.println("!(x==0)");
		}
		if(!(x!=0)) {
			System.out.println("!(x!=0)");
		}
	}
}
