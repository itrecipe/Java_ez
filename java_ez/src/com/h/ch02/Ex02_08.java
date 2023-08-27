package com.h.ch02;

public class Ex02_08 {

	public static void main(String[] args) {

	int x = 10 , y = 5; //데이터형이 같은 경우 한줄에 작성
	//int x =10;
	//int y = 5;
	
	System.out.println("x="+x);
	System.out.println("y="+y);
	
	int tmp = x;
	x = y; //변수 x에 y값 대입
	y = tmp;
	//x,y값을 교환
	System.out.println("x="+x);
	System.out.println("y="+y);
	}
}