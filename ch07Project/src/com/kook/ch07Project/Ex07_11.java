package com.kook.ch07Project;

public class Ex07_11 {

	public static void main(String[] args) {
		ChildEx0711 c = new ChildEx0711();
		c.method1(); //인터페이스의 default메서드가 충돌나서 클래스에서 재정의한 메서드를 사용함
		c.method2(); //조상 ParentEx0711과 인터페이스의 메서드가 충돌시 조상의 메서드를 사용함
		
		//static(클래스형)메서드는 인터페이스명으로 접근
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
		
		//구현 추상 메서드 호출
		c.absMethod1();
	}
}

//조상 클래스 생성
class ParentEx0711 { 
	public void method2() {
		System.out.println("method2() in ParentEx0711");
	}
}

class ChildEx0711 extends ParentEx0711 implements MyInterface,MyInterface2 {
	//구현한 인터페이스의 default메서드간의 충돌(MyInterface,MyInterface2의 mothod1)
	@Override // 충돌메서드 재정의
	public void method1() {
		System.out.println("method1() in ChildEx0711"); //오버라이딩
	}
	
	//상속한 메서드 method2가 인터페이스의 default 메서드 method2와 충돌시
	//조상의 메서드 선택
	
	//추상메서드 구현
	@Override //국썜 : 추상메서드 구현시 Override 해주는게 좋다
	public void absMethod1() {
		System.out.println("추상메서드 구현");
	}
}

interface MyInterface {
	//추상메서드가 없는 인터페이스
	//인터페이스의 메서드는 public(생략 가능)
	//default메서드와 static메서드를 JDK1.8에서 추가한 이유는 인터페이스 수정을 쉽게 함
	//추상메서드를 추가하면 이를 구현한 모든 클래스의 추상메서드를 구현해야하는 불편함이 있다.
	/*public*/ default void method1() { //일반 인스턴스 메서드를 인터페이스안에 만들시 default를 사용해야함
		System.out.println("method1() in MyInterface");
	}
	default void method2() { //인터페이스에 있는 일반 인스턴스형 메서드
		System.out.println("method2() in MyInterface");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
	public abstract void absMethod1();
}
	
interface MyInterface2 {
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}