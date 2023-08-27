package com.h.ch01;

//은 한줄 주석
/*
 * 여러줄 주석
 * 또 주석
 * 또 주석
 */
// /** 내용 */은 문서화 동시에 사용하는 주석

public class Ex01_01 { //클래스명 Ex01_01은 자바파일(Ex01_01.java)의 이름과 동일

	public static void main(String[] args) {
		System.out.println("Hello world"); //메서드 실행문으로 끝에 ; 있어야 함.
		System.out.println(5+5); //내가 임의로 연습해본 코드
		int x = 1; // 변수 x를 선언하여 1이라는 값을 대입 한다는 실행문으로서 끝에 ; 붙여줘야함.
		
		// 보통 하나의 실행문은 한줄에 한개 작성하나 두개 이상 사용해도 무방
		int y =3 ; int z = 5 ;
		
		//자동완성 기능은 약어를 사용하여 ctrl+space를 눌러 완성 
		//sysout 입력 -> ctrl+space키 누르면 자동으로 System.out.println(); 명령이 완성됨
		System.out.println("hello");
		System.out.println("Hi");
	}
}
