package com.kook.ch07Project;

public class Point {
	int x, y;
	//생성자는 리턴타입이 없고(void x) 생성자명이 클래스명과 동일해야함
	//Point는 생성자가 하나 명시적으로 만들어져서 기본형 생성자는 없어짐
	public Point(int x, int y){
		//상위클래스인 Object의 생성자 super();가 자동 호출됨
		super(); //<-이렇게 명시해도 되고, 작성을 해도 안해도 무방하다.
		this.x = x;
		this.y = y;
	}
}