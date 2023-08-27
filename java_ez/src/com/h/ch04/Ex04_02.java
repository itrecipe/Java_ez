package com.h.ch04;

public class Ex04_02 {

	public static void main(String[] args) {
	
		int x = 0;
		System.out.printf("x=%d ?¼ ?•Œ, ì°¸ì¸ ê²ƒì?%n", x);
		
		if(x==0) { 
			System.out.println("x==0");
		}
		if(x!=0) { 
			System.out.println("x!=0");
		}
		if(!(x==0)) { 
			System.out.println("!(x==0)");
		}
		if(!(x!=0)) { //xê°? 0?¼?‹œ?— !falseê°? ?˜?–´ ë¸”ë¡?•ˆ?œ¼ë¡? ?“¤?–´ê°?
			System.out.println("!(x!=0)");
		}
		
		x = 1;
		System.out.printf("x=%d ?¼ ?•Œ, ì°¸ì¸ ê²ƒì?%n", x);
		
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
