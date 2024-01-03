package com.h.ch09;
//국.변
public class Ex09_08 {

	public static void main(String[] args) {
		//배열의 길이가 0인 배열
		char[] cArr = new char[0]; //char[] = {};과 동일함

		String s = new String(cArr);
		//String생성자 중 char[]을 인자로 사용하는 메서드 사용
		String s1 = new String("");
		String s2 = "";
		
		System.out.println("cArr.length = " + cArr.length);
		System.out.println("@@@" + s + "@@@");
		
		System.out.println("s와 s1비교 : " + s.equals(s1));
		System.out.println("s1와 s2비교 : " + s1.equals(s2));
		
		//문자열의 값이 없는 초기화는 null보다는 리터럴로 ""을 사용하는것을 권장함
		//char의 값이 없는 초기화도 null인 \u0000보다 ' '(공백)을 사용하는것을 권장함
	}
}

/* 꿀팁 메소드 사용법이나 타입 등 사용법을 잘 모를때는
   예를들면 String s1 = new String(""); 해당 문장에 String 부분에
   커서를 갖다대고 shift + F2키 누르면 해당 내용 API 문서 페이지로 이동함
*/