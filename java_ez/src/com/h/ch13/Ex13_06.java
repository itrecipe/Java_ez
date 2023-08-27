package com.h.ch13;
//국.변
public class Ex13_06 {
	public static void main(String[] args) {
		/* 스레드 우선순위
		 - main쓰레드가 다른 쓰레드를 생성(main쓰레드가 부모 쓰레드)
		 - main은 기본 NORM_PRIORITY인 5이다.
		 - 자식 쓰레드는 부모의 우선순위를 상속한다.
		*/
		ThreadEx6_1 th1 = new ThreadEx6_1(); //main스레드의 우선순위 NORM_PRIORITY를 상속
		ThreadEx6_2 th2 = new ThreadEx6_2(); //main스레드의 우선순위 NORM_PRIORITY를 상속
		
		//priority설정은 start()이전에 가능하다.
		th2.setPriority(7); //우선순위가 3개의 스레드 중 제일 높으므로 cpu할당 시간이 제일 크다.
		
		System.out.println("Priortity of th1(-) : " + th1.getPriority());
		System.out.println("Priortity of th2(|) : " + th2.getPriority());
		
		th1.start();
		th2.start(); //우선순위가 제일 높아 cpu를 오래 사용하므로 th1보다는 빨리 종료됨
		
		System.out.println("main스레드 종료");
	}
}

class ThreadEx6_1 extends Thread {
	//쓰레드를 사용하기 위해선 쓰레드가 처리해야할 일을 담당하는 run()메서드를 재정의 해준다.
	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
			for(int x=0; x < 10000000; x++);
		}
		System.out.println("th1종료");
	}
}

class ThreadEx6_2 extends Thread {	
	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
			for(int x=0; x < 10000000; x++);
		}
		System.out.println("th2종료");
	}
}