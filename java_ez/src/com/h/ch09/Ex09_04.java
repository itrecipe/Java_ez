package com.h.ch09;
//국.변
public class Ex09_04 {

	public static void main(String[] args) {
		Card c1 = new Card(); //c1,c2 서로 주소값이 다름
		Card c2 = new Card();
		
		System.out.println(c1.toString()); 
		System.out.println(c2.toString());
		
		//print문안에 출력하는 객체를 넣으면 자동으로 toString()이 붙어서 출력됨
		System.out.println(c1);
		System.out.println(c2);

	}
}

class Card {
	//상속하는 것이 안적혀 있으므로 Object의 11개 메서드를 상속
	String kind;
	int number;
	
	Card() { //기본형 메서드 
		this("SPADE", 1);
	}
	
	Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
}