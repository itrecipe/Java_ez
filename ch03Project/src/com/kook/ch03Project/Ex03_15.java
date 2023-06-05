package com.kook.ch03Project;

import java.util.Scanner; 
//기본클래스인 java.lang패키지와 개발자가 만든 동일한 패키지에 없는 클래스는 import를 해줘야함.

public class Ex03_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' '; //char의 기본값은 ' '(공백)으로 해준다.
		
		System.out.printf("문자를 하나 입력 하세요.>");
		
		String input = scanner.nextLine(); //.nextLine : 값을 입력받을때까지 대기상태
		
		ch = input.charAt(0); 
		//String의 charAt(색인번호)는 문자열에 색인번호에 있는 문자하나를 반환해줌.
		
		if('0' <= ch && ch <= '9') {
			//if문 ()안에는 boolean을 반환하는 연산식이 들어가고,true이면 블록안에서 처리하고
			//false일 경우 블록안에 못들어가서 처리가 안됨.
			System.out.printf("입력하신 문자는 숫자입니다.%n");
		}
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'z')) {
			System.out.printf("입력하신 문자는 영문자입니다.%n");
		}
	} //main
}