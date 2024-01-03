package com.h.ch08;

public class Ex08_NonException {
	//예외처리 최종인 main에서도 안하고 throwsgkaus JVM으로 넘김
	public static void main(String[] args) throws Exception {
		method1();

	}
	static void method1() throws Exception {
		throw new Exception("예외 발생!");
	}

}
