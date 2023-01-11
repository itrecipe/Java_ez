package com.kook.ch09Project;

public class Ex09_11 {

	public static void main(String[] args) {
		//StringBuffer는 java.lang에 있는 기본 크랠스
		StringBuffer sb = new StringBuffer("abc");
		//생성자중 파라미터로 문자열을 사용하느 생성자(문자열 + 16문자 수용 가능 char[]배열 생성)
		//StringBuffer sb1 = "abc"; //StringBuffer는 리터럴로 객체 생성 불가
		StringBuffer sb2 = new StringBuffer("abc");
		
		//==은 참조형 주소 비교
		System.out.println("sb == sb2 ? " + (sb == sb2));
		//StringBuffer는 equals 재정의 x
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		/* StringBuffer의 내용을 String으로 변환하여 equals로 비교
		   toString()은 재정의가 되어 문자열을 출력
		   문자열은 equals로 값 비교 가능 
		*/
		String s = sb.toString(); //재정의 되어 있고 리턴은 String
		String s2 = sb2.toString();
		
		//String의 equals로 값 비교
		System.out.println("s.equals(s2) ? " + s.equals(s2));
	}

}
