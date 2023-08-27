package com.h.ch09;

public class Ex09_06 {

	public static void main(String[] args) {
		String str1 = "abc";
		/* String객체를 리터럴로 만들시 리터럴 값은 클래스메모리에 저장되어
		   리터럴 값이 사용될때마다 비교하여 같은것이 있으면 기존 것을 사용(주소가 동일) 
		*/
		String str2 = "abc";
		System.out.println("String str1 = \"abc\";");
		/* "String str1 = "abc";" 인데 ""안에 다른 ""를 넘는 것은 금지 되어
		    escape sequence문자 \를 앞에 붙여서 사용함 */
		System.out.println("String str2 = \"abc\";");
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		// ==연산자는 주소 비교
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		//String의 equals는 자바에서 이미 값을 비교하도록 재정의됨
		System.out.println();
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		//new연산자로 객체를 만들면 새로운 저장위치를 찾아 사용하므로 주소가 언제나 다름 
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		
		System.out.println("str3 == str4 ? " + (str3 == str4));
		// ==연산자는 주소 비교
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
		//String에 값을 비교하도록 미리 재정의된 equals 사용
	}
}
