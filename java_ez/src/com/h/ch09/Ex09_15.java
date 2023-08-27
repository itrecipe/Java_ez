package com.h.ch09;
//국.변
public class Ex09_15 {

	public static void main(String[] args) {
		
		int i = new Integer("100").intValue(); //요즘은 안쓰는 방식임
		//문자열을 인자로 받아 Integer객체를 생성 후 intValue()로 int값으로 변환
		int i2 = Integer.parseInt("100"); //parseInt는 int로 반환 
		Integer i3 = Integer.valueOf("100"); //valueOf는 wrapper클래스로 반환
		int ix = Integer.valueOf("100"); //반환된 래퍼클래스인 Integer가 자동 int로 변환(오토박싱 수행함)
	
		//진법 적용해서 변환
		int i4 = Integer.parseInt("100",2); //문자열 100을 2진수로 처리
		System.out.println("2진법 수 : " + i4); //결과는 10진수 4가 나옴
		int i5 = Integer.parseInt("100",8); //결과 : 64
		int i6 = Integer.parseInt("100",16); //결과 : 256
		int i7 = Integer.parseInt("FF",16); //결과 : 16 * 15 + 15 = 255
		System.out.println(i7);
		//Integer.parseInt("FF")는 에러(10진수인데 10진수에는 FF없음)
	}
}
