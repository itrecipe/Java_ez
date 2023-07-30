package com.kook.ch02Project;

public class Ex02_12 {

	public static void main(String[] args) {
		
		String str = "3"; //숫자 3을 문자열로 처리
		
		char c0 = str.charAt(0);
		//charAt(색인번호)는 문자열에서 색인번호가 가르키는 문자를 반환
		System.out.println(c0);
		
		int c1 = c0 - '0'; //문자 - 문자는 int를 반환
		
		char c2 = (char)c1; //int c1을 char로 형변환(축소형변환으로 강제 형변환)
		
		int c3 = c2; //char에서 int로 형변환을 하며 확대 형변환으로 캐스팅 생략
		
		System.out.println(c1);
		
		System.out.println(str.charAt(0) - '0'); //int값을 반환 3
		System.out.println('3' - '0' + 1); //3 + 1 = 4
		System.out.println(Integer.parseInt("3") + 1);
		//java.lang.Integer.parseInt(숫자형 String) (는),(을) 정수로 변환
		System.out.println("3" + 1); //문자열 + 숫자는 문자열로 결합 31
		System.out.println(3 + '0'); //숫자 + 문자는 문자의 코드인 int로 변환하여 계산 '0'은 48
	}
}
