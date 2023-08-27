package com.h.ch02;

public class Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수선언
		int x = 5; //변수 x를 선언과 동시에 초기값 5라는 값을 대입;
		System.out.println(x);
		
		//변수는 값을 변경하여 사용가능
		//한번 만들어진 변수는 다시 선언x
		x = 10;
		System.out.println(x);
		
		int y = 5; //새로운 변수 y생성
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		//변수를 이용한 수식을 사용하면 변수 값이 변경되더라도 수정할일x
		
	}
}
