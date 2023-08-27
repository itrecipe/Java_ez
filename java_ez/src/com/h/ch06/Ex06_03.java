package com.h.ch06;

public class Ex06_03 {

	public static void main(String[] args) {
		//클래스변수(static변수)는 클래스명,변수명으로 접근
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		//인스턴스 변수는 객체를 생성해 객체.변수명으로 접근
		Card c1 = new  Card();
		//기본 생성자는 클래스에 생성자가 하나도 없을시 컴파일시 자바가 제공
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		//클래스형은 객체.클래스형 변수로 접근도 무방(사용법:권고x)
		System.out.println("c1은 " + c1.kind + "," + c1.number
				+ " 이며, 크기는 (" + c1.width + "," + c1.height + ")" );
				
		System.out.println("c2는 " + c2.kind + "," + c2.number
				+ " 이며, 크기는 (" + c2.width + "," + c2.height + ")" );
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경한다.");
		
		//사용법:권고o
		c1.width = 50;
		c2.height = 80;
		
		//width,height는 공통으로 사용하는 클래스형 변수이므로 c2로 접근하더라도 변경된 값 출력
		System.out.println("c1은 " + c1.kind + "," + c1.number
				+ " 이며, 크기는 (" + c1.width + "," + c1.height + ")" );
		
		System.out.println("c2는 " + c2.kind + "," + c2.number
				+ " 이며, 크기는 (" + c2.width + "," + c2.height + ")" );

		//좋은 방법은 클래스형 변수는 클래스명.변수로 사용할것.
		Card.width = 51;
		Card.height = 81;
		
	}
}
