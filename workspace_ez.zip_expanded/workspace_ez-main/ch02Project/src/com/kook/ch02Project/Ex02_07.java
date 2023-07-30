package com.kook.ch02Project;

public class Ex02_07 {

	public static void main(String[] args) {

		String name = "JA" + "VA"; //+는 문자열 결합 연산자
		String str = name + 8.0;
		//name은 String형 변수이며 저장된 값이 "Java"
		//8.0은 소숫점 있는 숫자 자바에선 소수점 숫자는 기본이 double형 이므로 8바이트 리터럴
		//name + 8.0은 문자열 + 숫자는 문자열 + 문자열
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + " ");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
	}
}