package com.kook.ch03Project;

public class Ex03_14 {

	public static void main(String[] args) {
		//자바의정석 예제
		String str1 = "abc"; //값을 대입해서 String 참조변수 만듬
		String str2 = new String("abc"); //생성자를 이용하여 만듬
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");
		// \"은 "을 인용부호 안에서 사용하도록 해주는 이스케이프시퀀스 문자(\)임
		//%b 포멧지시자는 boolean값으로 표시
		System.out.printf(" str1==\"abc\" ? %b%n",  str1=="abc");
		//str1 == "abc"는 str1의 값을 대입하여 만든 변수이므로 값으로 비교
		System.out.printf(" str2==\"abc\" ? %b%n",  str2=="abc");
		//str2는 new로 생성한 객체이므로 ==로 비교 하면 주소로 비교 되어 false
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		//equals메서드는 값만 비교
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n",
						   str2.equalsIgnoreCase("abc"));
		//equalsIgnoreCase()는 대소문자를 구분하지 않고 비교
		
		//국썜 수업 예제
		System.out.printf("str2.equals(str1) ? %b%n", str2.equals(str1));
		//str2잠초변수와 str1 참조변수를 equals로 하면 값만 비교하여 true
		System.out.printf("str2 == str1 ? %b%n", str2.equals(str1));
		//참조변수의 주소를 비교하므로 false
	}
}