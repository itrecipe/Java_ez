package com.kook.ch03Project;

public class Ex03_06 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b); //int + int = int
		System.out.printf("%d - %d = %d%n", a, b, a - b); //int - int = int
		System.out.printf("%d * %d = %d%n", a, b, a * b); //int * int = int
		System.out.printf("%d / %d = %d%n", a, b, a / b); //int / int = int
		
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		// int b를 float로 형변환 , 정수 4가 float형 4.000000으로 변환
		// int / float = float
		
		// 피 연산자중 컨테이너형의 결과를 반환
	}
}