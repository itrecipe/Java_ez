package com.h.ch08;

public class Ex08_01 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			//예외가 발생하는 문장에서 해당 예외를 catch문으로 던져줌
			//예외발생이 없으면 catch블록을 거치지 않고 다음 프로그램으로 진행
			System.out.println(2);
			System.out.println(3);
		}
		catch(Exception e) {
			System.out.println(4);
		}
		System.out.println(5);

	}

}
