package com.h.ch13;

public class Ex13_08 {

	public static void main(String[] args) {
	// sleep()메서드 사용
	// cpu할당시에 run실행
	Thread08_01 th1 = new Thread08_01();
	Thread08_02 th2 = new Thread08_02();
	
	th1.start(); //실행대기상태인 Runnable상태
	th2.start(); //실행대기상태인 Runnable상태
	
	//메인스레드를 sleep
	try {
		Thread.sleep(2000); //sleep는 현재의 스레드에 적용
	}
	catch (Exception e) {
		System.out.print(e.getMessage());
	}
	System.out.print("main스레드 종료");
	}

}

class Thread08_01 extends Thread {
	//스레드 th1이 실행할 run메서드
	//cpu할당시 run실행
	@Override
	public void run() {
		for(int i=0; i < 300; i++) //블록안의 문장이 한줄일때는 {}블록 생략가능,(단,들여쓰기는 해야함)
		System.out.print("");
		
		System.out.print("<<th1 종료>>");
	}
}

class Thread08_02 extends Thread {
	//스레드 th2가 실행할 run메서드
	//cpu할당시 run실행
	@Override
	public void run() {
		for(int i=0; i < 300; i++) //블록안의 문장이 한줄일때는 {}블록 생략가능,(단,들여쓰기는 해야함)
			System.out.print("");
		
		System.out.print("<<th2 종료>>");
	}
}