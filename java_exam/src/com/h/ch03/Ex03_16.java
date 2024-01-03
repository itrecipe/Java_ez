package com.h.ch03;

public class Ex03_16 {

	public static void main(String[] args) {
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b); // !는 논리부정 연산자로서 boolean값을 반대로 변환
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!=%b%n", !!!b);
		System.out.println();

		System.out.printf("ch=%c%n", ch);
		//char의 format지시자는 %c
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
		// ||이므로 하나만 true이면 true
		System.out.printf("!('a' <=ch && ch<='z')=%b%n", !('a' <= ch && ch<='z'));
		//논리부정 연산자 !는 결과를 반대로
		System.out.printf("  'a' <=ch && ch<='z' = %b%n", 'a'<=ch && ch<='z');
	}
}