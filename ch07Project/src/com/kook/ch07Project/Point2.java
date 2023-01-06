package com.kook.ch07Project;

public class Point2 {
	int x,y;
	
	public Point2() { //기본 생성자를 명시적으로 생성하면 해당 생성자 사용가능
		
	}
	
	public Point2(int x, int y) {
		//상위클래스인 Object의 생성자를 자동으로 호출함(super();)
		this.x = x;
		this.y = y;
	}
}