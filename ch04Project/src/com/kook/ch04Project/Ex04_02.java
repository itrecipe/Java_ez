package com.kook.ch04Project;

public class Ex04_02 {

	public static void main(String[] args) {
		//국쌤 예제
		int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);
		
		if(x==0) { 
			System.out.println("x==0");
		}
		if(x!=0) { 
			System.out.println("x!=0");
		}
		if(!(x==0)) { 
			System.out.println("!(x==0)");
		}
		if(!(x!=0)) { //x가 0일시에 !false가 되어 블록안으로 들어감
			System.out.println("!(x!=0)");
		}
		
		x = 1;
		System.out.printf("x=%d 일 때, 참인 것은%n", x);
		
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