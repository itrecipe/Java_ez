package com.h.ch06;
	//국쌤 예제

	//이클립스로 클래스를 만들면 클래스명.java파일이 패키지 밑에 생성됨
	//java파일의 이름인 클래스를 메인 클래스라고 부르며 main메서드가 있는 클래스임
	//main클래스는 접근제한자가 public ~~public class
	//이 자바 파일 안에 다른 클래스를 만들시는 접근 제한자를 default(public이 없음)으로 함
	//컴파일이 되면 내부의 클래스도 각각 따로 컴파일 되어 생성됨 -> Ex06MultiClass, A.class, B.class
public class Ex06MultiClass {
	
	public static void main(String[] args) {
		

	}
}

//하나의 java파일안의 다른 클래스
class A {
	
}

class B {
	
}
