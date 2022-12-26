package com.kook.ch03Project;

public class Ex03_08 {

	public static void main(String[] args) {
		//byte 범위는 -128 0~127
		byte a = 10;
		byte b = 30;
		
		//byte x = 300;은 byte형 범위인 127을 벗어나 에러 발생
		
		int c = a + b; //byte인 a와 b는 연산전 int로 변환되고 결과도 int로 출력
		byte c1 = (byte)c;
		
		System.out.println(c1);
	}
}