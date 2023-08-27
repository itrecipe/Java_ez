package com.h.ch13;

public class Ex13_01 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1(); //Thread를 상속한 클래스의 객체
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		//Thread t2 = new Thread(new ThreadEx1_2()); <- 이렇게 간단히 표현도 가능
		
		//thread를 동작 시키려면 start()메서드로 호출
		t1.start();
		t2.start();
		//start()메서드가 호출되면 스레드는 실행 대기상태가 됨
	}

}

//thread를 사용하려면 Thread를 상속하거나 Runnable인터페이스를 구현한 클래스에서만 사용가능

class ThreadEx1_1 extends Thread {
	/* public class Thread extends Object implements Runnable
      -java.lang에 있는 기본 클래스로 import 필요 없음
	*/
	
	@Override
	public void run() {
		//run메서드는 해당 스레드가 해야할 일을 정의함
		for(int i=0; i < 5; i++) {
			System.out.println("t1의 이름 : " + getName());
		//String getName() Thread클래스에서 상속 받은 메서드로 스레드명을 반환 (즉, 인스턴스 메서드)
		}
	}
}
	
class ThreadEx1_2 implements Runnable {
	/* @FunctionalInterface, public interface Runnable
	   -java.lang에 있는 인터페이스로서 import 필요없음
	   @FunctionalInterface 어노테이션은 추상메서드가 아니면 인터페이스를 나타냄
	*/
	@Override
	public void run() {
		for(int i = 0; i < 5 ; i++) {
		//getName()메서드는 Runnable 인터페이스에는 없으므로 구현할 수 없어서 사용불가
		//현재 사용중인 스레드는 Thread.currentThread()로 알아냄 (static메서드)
		System.out.println("현재 사용중인 thread : " + Thread.currentThread().getName());
		}
	}
}