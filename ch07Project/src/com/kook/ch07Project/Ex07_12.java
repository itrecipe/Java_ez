package com.kook.ch07Project;
//국쌤변형예제(원본과상이)
public class Ex07_12 { //외부 클래스는 일반제어자는 abstract,final
	//인스턴스형 내부 클래스
	class InstanceInner {
		int iv = 100;
		//static int cv = 100; //클래스형 멤버변수는 instance 내부 클래스에선 사용불가,1.7버전은 지원? 
		final static int CONST = 100; //단, 상수는 인스턴스 내부클래스에서도 사용가능
	}
	
	//클래스형 내부 클래스
	static class StaticInner {
		int iv = 200; //인스턴스형도 사용가능
		static int cv = 200; //static 내부 클래스에선 static변수 사용가능
		final static int CONST = 100;
	}
	
	void myMethod() {
		class LocalInner { //local 내부 클래스
			int iv = 300; //인스턴스 사용가능
			//static int cv = 100;
			final static int CONST = 300; //상수는 로컬클래스에서도 사용가능	
		}
	}
	
	public static void main(String[] args) {
		//자기 클래스에서 내부 클래스의 상수나 static변수 접근은 내부 클래스명으로 가능
		System.out.println(InstanceInner.CONST);
		//System.out.println(InstanceInner.iv); //접근불가
		System.out.println(StaticInner.cv); //클래스형은 이름 으로 접근가능
		//System.out.println(StaticInner.iv); 
		//클래스형은 내부 클래스이지만 인스턴스변수는 클래스명으로 접근불가	
	}
}