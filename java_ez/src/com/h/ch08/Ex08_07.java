package com.h.ch08;
//국.변
public class Ex08_07 {

	public static void main(String[] args) {
		
		//throw new Exception();
		//Exception예외는 컴파일 예외(cheaked에러)로 컴파일에러 발생
		//컴파일 에러는 명시적으로 예외 처리
		try {
			throw new Exception();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
