package com.kook.ch07Project;
//국쌤변형예제(원본과상이)
public class Ex07_16 {

	public static void main(String[] args) {
		OuterEx0716 out = new OuterEx0716();
		OuterEx0716.Inner inner = out.new Inner();
		//외부클래스의 내부 클래스 접근 (데이터형)은 외부클래스명.내부클래스명
		inner.method();
	}
}

class OuterEx0716{
	//변수명들이 같을시 this를 사용
	int value = 10;
	
	class Inner {
		int value = 10;
		void method() {
			int value = 30; //Inner내부클래스의 로컬변수 value
			System.out.println("value : " + value); //로컬변수값 30
			System.out.println("this.value : " + this.value); //내부객체 변수값 : 10
			//this는 자신의 클래스의 객체(메서드에 자동 저장된 로컬 객체 = 해당 메소드 안에서만 사용한다는 의미)
			System.out.println("OuterEx0716.this.value : " + OuterEx0716.this.value);
			//외부클래스의 변수 10;
		}
	}
}