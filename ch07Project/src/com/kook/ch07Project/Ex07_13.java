package com.kook.ch07Project;
//국쌤변형예제(원본과상이)
public class Ex07_13 {
	
	int outerV = 100;
	
	class InstanceInner { //인스턴스형 내부 클래스
		
	}
	
	static class StaticInner { //static클래스(클래스형)
		
	}
	
	InstanceInner iv = new InstanceInner();
	//인스턴스형 멤버변수 iv 인스턴스 내부클래스의 객체로 바로 사용
	static StaticInner cv = new StaticInner();
	//클래스형 멤버 변수 cv는 클래스형 내부 클래스를 바로 사용
	
	//outer클래스의 클래스형 멤버 메서드
	static void staticMethod() {
		//static메서드는 인스턴스멤버에 직접 접근할 수 없다.(인스턴스멤버객체를 만들어 접근)
		//InstanceInner obj1 = new InstanceInner(); //접근 불가
		//static메서드 안에서 static내부 클래스로는 바로 접근가능
		StaticInner obj2 = new StaticInner();
		//인스턴스 내부 클래스에 접근하려면 부모(outer객체)객체를 만들어 접근
		Ex07_13 outer = new Ex07_13();
		InstanceInner obj3 = outer.new InstanceInner();
		//일반클래스의 static메서드안에서 자기 클래스의 인스턴스멤버 접근시 자기클래스 객체를 생성하여 접근
	}
	
	void instanceMethod() {
		/* 일반클래스의 인스턴스메서드에서 자기 클래스의 인스턴스멤버나 클래스멤버 접근시는 객체를 만들거나
		   자기 클래스(외부클래스) 이름 없이 바로 접근하는 원칙을 사용 */
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//Local클래스는 밖에선 사용못함(로컬변수처럼 사용x)
		//LocalInner Iv  = new LocalInner();
	}
	
	void myMethod() {
		class LocalClass {
			
		}
		LocalClass lv = new LocalClass(); //메서드안에서만 바로 사용가능
	}
	
	//main메서드
	public static void main(String[] args) {
		staticMethod(); //main은 static이므로 static멤버인 staticMethod()는 바로 호출함
		
		Ex07_13 outer = new Ex07_13();
		outer.instanceMethod(); 
		//static메서드안에서 자기 클래스의 인스턴스멤버 접근시 자기 클래스 객체 만들어 접근
		//outer.staticMethod(); //자기클래스객체.클래스멤버도 상관없으나 비사용 권고
	}
}