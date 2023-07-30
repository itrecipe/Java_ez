package com.kook.ch03Project;

public class Ex03_01 {
	//main메서드는 자바 프로그램의 시작점
	public static void main(String[] args) {
		int x , y;
		/*
		 * int x;
		 * int y;
		 * 를 한줄에 작성
		 */
		
		x = y = 3; //y에 3이 먼저 저장된 후, x에 3이 저장됨,=은 대입연산자이며,우->좌(측)으로 연산
		System.out.println("x=" + x); // "x = 3"
		System.out.println("y=" + y); // "y = 3"
	}
}

