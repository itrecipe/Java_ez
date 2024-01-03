package com.h.ch06;
//국쌤 변형 예제(원본과 상이함)
public class Ex06_13 {

	public static void main(String[] args) {
		Car0613_01 c1 = new Car0613_01();
		Car0613_01 c2 = new Car0613_01("dark");
	}
}

class Car0613_01{
	String color;
	String gearType;
	int door;
	
	Car0613_01(){
		this("white"); //자기 클래스의 다른 생성자인 파라미터 하나 가진 생성 호출
	}
	
	Car0613_01(String color){
		this(color,"auto",4); //자기 클래스의 다른 생성자인 파라미터 세개 가진 생성 호출
		//color는 받은 파라미터를 활용
	}
		
	Car0613_01(String color, String gearType, int door){
		//멤버변수명과 파라미터명이 같을시 멤버변수에 this를 사용하여 구분
		//this는 자기클래스의 객체
		super();
		//this는 자신 객체를 나타내는 인스턴스 객체로 모든 메서드에선 지역 변수로 존재
		this.color = color;
		this.gearType = gearType;
		this.door = door; 
	}
	int sum(int a, int b) {
		return a + b;
	}
	
	void call() {
		/* 자기클래스의 인스턴스 메서드 호출시 이름으로 호출 해도 되지만, 
		 * sum(5,10) <- 이렇게 호출해도 상관없음
		   모든 메서드에 숨겨진 자신의 인스턴스 객체인 this를 사용해도 무방하다(권고사항)
		 */
		this.sum(5,10);
	}
}

class Car0613_02 {
	String color;
	String gearType;
	int door;
	
	//명시적인 생성자 x
	//자바컴파일러가 기본생성자를 추가함(안보일뿐임)
}