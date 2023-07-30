package com.kook.ch06Project;

//Card클래스는 각각의 카드(객체=설계도)를 만드는 클래스
public class Card {
	//클래스 영역에 있으므로 멤버 변수
	//static 키워드가 없으므로 인스턴스 멤버 변수
	//카드의 무늬와 숫자는 각 카드별로 다르므로 인스턴스형
	String kind; //카드 무늬
	int number; //카드 숫자
	
	//카드 크기는 모든 카드에서 공통이므로 static
	static int width = 100; //JVM에서 클래스 로딩시 저장되므로 선언시 저장될 초기값을 지정
	static int height = 250;
}
