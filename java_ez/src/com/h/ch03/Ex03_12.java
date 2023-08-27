package com.h.ch03;

public class Ex03_12 {
	public static void main(String[] args) {
		int x = 10;
		int y = 8;

		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y , x % y);
		// int / int는 int이므로 몫을 구하고,
		// int % int는 나머지를 구함
		
		// 자바의정석 - Ex03_13예제
		System.out.println(-10 % 8);
		System.out.println(10 % -8);
		System.out.println(-10 % -8);
		//나누는 수에 음수도 허용되나 무시됨.
	}
}