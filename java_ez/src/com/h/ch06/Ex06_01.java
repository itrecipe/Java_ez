package com.h.ch06;

//귝쌤 변형 예제(원본과살짝다름)
public class Ex06_01 {
	public static void main(String[] args) {
		//클래스(멤버가 인스턴스형이 있을시)를 사용하려면 객체를 생성해서 사용함.
		Tv t = null; //메서드안의 변수 이므로 로컬 변수로 기본값이 없음
		System.out.println(t); //t에는 참조형이므로 주소값임
		
		t = new Tv(); //객체생성(인스턴스), t에 주소가 저장됨.
		
		Tv t1 = new Tv(); //t1객체 생성하고 주소가 주어짐.
		System.out.println(t1);
		//인스턴스형 멤버변수나 멤버 메서드는 객체.이름으로 접근
		t.channel = 6;
		t1.channel = 7;
		
		t.chnnelDown();
		t1.chnnelDown();
		System.out.println("현재 채널 t는  " + t.channel + " 입니다.");
		System.out.println("현재 채널 t1은 " + t1.channel + " 입니다.");

	}
}

//메인 클래스에 내용을 작성하기전에 다른 클래스를 먼저 생성할것
class Tv {
	//클래스는 멤버변수와 멤버 메서드로 구성됨(특수 메서드인 생성자 포함)
	//멤버는 인스턴스형과 static형(클래스형)으로 구분됨.
	//인스턴스형은 객체를 생성해서 사용하고, 클래스형은 객체를 생성하지 않고 클래스명으로 사용함.
	//인스턴스형은 String str; str.charAt(3)
	//클래스형은 Math.random(_)
	
	//멤버변수는 모든 데이터형(기본형,참조형) 사용
	//멤버변수는 로컬 변수와 달리 기본값을 가짐(전역 변수)
	//기본 값 숫자형은 0,0,0 char는 ' ', boolean false, 참조형은 기본값이 null
	String color; //null
	boolean power; //false
	int channel; //0
	
	//멤버메서드
	void power() { 
		power = !power; 
	} //!논리부정연산자로 반대값으로 변경
	
	void chnnelUp() {
		++channel; 
	}
	void chnnelDown() {
		--channel; 
	} 
	
	//특수 메서드인 생성자는 명시적으로 없으면 자바 컴파일러가 다음 생성자를 추가
	/*
	 * public Tv(){
	 * 	super(); <- 원래는 이게 있는데 생략됨.
	 * }
	 * 
	 * */
}