package com.h.ch03;

public class Ex03_11 {

	public static void main(String[] args) {
		//자바의정석 예제
		//double pi = 3.141592;
		//double shortPi = Math.round(pi * 1000) / 1000.0;
		
		//System.out.println(shortPi);
		
		//국쌤 수업 예제
		double pi = 3.141592;
		double tem1 = Math.round(pi * 1000);
		//괄호안은 double * int --> double형 3141.592
		//Math클래스의 소수점 첫자리에서 반올림하는 round(3141.592)는 3142L을 반환
		//소수점 셋째 자리만 갖는 pi를 double shortPi로 만들기 위해 1000.0으로 나눔
		double shortPi = tem1 / 1000.0; 
		//자바에선 ex) 1000.0 이런식으로 나오면 double형을 써야함. 반대로 소수점 없는것은 int형
		
		System.out.println(shortPi);
	}
}