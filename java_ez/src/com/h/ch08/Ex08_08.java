package com.h.ch08;

public class Ex08_08 {

	public static void main(String[] args) {
		//예외가 발생하였어도 에버 발생 안함(컴파일 에러가 아닌 실행중 발생 에러)--unchecked error
		throw new RuntimeException();
	}

}
