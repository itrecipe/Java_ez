package com.kook.ch07Project;

public class Outer { //extends가 없으므로 실제는 Object상속
	//내부클래스는 클래스의 멤버인 멤버변수,멤버메서드처럼 처리함
	int iv = 0; //인스턴스 멤버변수
	static int cv = 0; //클래스형 멤버변수
	
	void myMethod() { //인스턴스 멤버 메서드
		int x = 0;
		//메서드나 초기화 블록안에 있는 클래스는 로컬 클래스이다.
		class Localclass {
			
		}
	}
	
	static void mySMethod() { //클래스형 멤버메서드
		int y = 0;
	}
	
	public Outer() { //생성자
		super(); //Object 생성자 호출,생략 가능
	}
	//내부 클래스도 클래스의 멤버인 멤버변수,멤버메서드,생성자처럼 처리
	//내부 클래스도 멤버이므로 인스턴스형,클래스형 내부 클래스가 존재함
	
	private class InstanceInner { //인스턴스형 내부 클래스
		/* 접근제어자로는 멤버변수나 메서드처럼 
		public,protected,default(아무것도없다는의미(작성안해도적용되는것),private 사용가능 
		일반제어자로는 클래스에 사용하는 abstract,final사용가능
		*/
	}
	
	static class StaticInner { //클래스형 내부 클래스
		
	}
}