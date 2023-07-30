package com.kook.ch02Project; //패키지가 젤 위에 옴

public class Ex02_01 { //블록의 시작을 나타내는 중괄호 {
	//블록은 자바의 코드를 작성하는 부분
	//블록은 그룹,영역을 나타냄
	//class블록,메서드 블록,일반 블록
	
	//자바는 프로그램 시작을 main메소드로부터 시작
	public static void main(String[] args) {
		System.out.println("hello,world"); //문자열 출력하고 줄바꿈,문자열은 인용부호 "" 사이에 작성
		System.out.print("hello"); //문자열 출력하고 줄 안바꿈
		System.out.println("world");
		
		System.out.println("3+5=");//3+5= 는 " "안에 있으므로 문자열
		System.out.println(3+5); //3+5는 사칙연산(수식)
		
		int x = 5;
		System.out.println("x = " + x); //변수값 출력
		
		//사칙연산 출력
		System.out.println(5 + 5); //연산자 좌,우로는 앞뒤로 한칸씩 띄워쓰기하는게 좋다.(별 의미는 없지만 가독성을 위함임)
		System.out.println(5 - 3);
		System.out.println(5 * 3);
		System.out.println(5 / 3); // 정수/정수 = 정수
		
	}	
}//블록의 끝을 나타내는 중괄호 }