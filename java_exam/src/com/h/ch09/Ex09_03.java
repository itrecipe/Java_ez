package com.h.ch09;

public class Ex09_03 {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		//str1, str2는 주소가 다름
		//String클래스는 이미 equals는 값을 비교하도록 재정의 해둠
		//hashCode메서드는 값이 같으면 동일한 주소값 반환
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode()); //정수로 된 주소
		System.out.println(str2.hashCode());
		
		//identityHashCode()는 주소가 다르면 다른 값을 반환
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
}
