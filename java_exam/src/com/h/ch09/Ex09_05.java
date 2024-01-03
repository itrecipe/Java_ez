package com.h.ch09;

public class Ex09_05 {
	
	//클래스 객체의 멤버변수 값을 파악할시에는 toString()으로 재정의
	public static void main(String[] args) {
		
		Card2 c1 = new Card2(); //인자없이 생성자 호출
		Card2 c2 = new Card2("DIAMOND", 25); //2개의 인자로 생성자 호출
		
		//Card2의 재정의한 toString()을 사용
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		//print문안에 출력하는 객체를 넣으면 자동으로 toString()이 붙어서 출력됨
		System.out.println(c1);
		System.out.println(c2);

	}
}

class Card2 {
	//상속하는 것이 안적혀 있으므로 Object의 11개 메서드를 상속
	String kind;
	int number;
	
	Card2() { //기본형 메서드 
		this("SPADE", 1);
	}
	
	Card2(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	//Object의 toString()을 Override에서 멤버변수값을 출력
	@Override
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}