package com.kook.ch13Project;

//1
public class Ex13Quiz extends Thread {
	//2
	@Override
	public void run() {
		System.out.println("2번 & 9번 : Ex13QuizClass클래스의 스레드");
		
	}
	public static void main(String[] args) {
		//3
		Ex13Quiz th1 = new Ex13Quiz();
		th1.start();
		//6
		Runnable r = new RunThread();
		Thread th2 = new Thread(r);
		th2.start();
		//8
		try {
			th1.join();
			th2.join();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}			
		//9
//		th1 = new Ex13Quiz();
//		th2 = new Ex13Quiz();
//		th1.start();
//		th2.start();
		
		new Thread(th1).start();
		new Thread(th2).start();
		
		//10
		try {
			while(th1.isAlive() || th2.isAlive()) {
				Thread.sleep(500);
				th1.interrupt();
				th2.interrupt();
		        System.out.println( "interrupt() called" );
		        th1.join( 500 );
		        th2.join( 500 );
				
			}
			System.out.println( "th1 : isAlive = " + th1.isAlive() );
			System.out.println( "th2 : isAlive = " + th2.isAlive() );
		    System.out.println( "th1 : isInterrupted = " + th1.isInterrupted());
		    System.out.println( "th2 : isInterrupted = " + th1.isInterrupted());
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		//7
		System.out.println("7번 : main의 마지막 문");
	}

}

//4
class RunThread implements Runnable {
	//5
	@Override
	public void run() {
		System.out.println("5번 : RunThread의 thread");
	}
}

/* 1.Ex13Quiz클래스를 Thread클래스를 상속한 클래스로 변경
   2.run()메서드를 override하는데 내용은 Ex13Quiz클래스의 스레드임을 출력
   3.Ex13Quiz의 스레드 객체 th1을 생성하고 start해줌
   4.Runnable을 구현한 클래스 RunThread를 만듬
   5.run()메서드는 RunThread의 thread임을 출력
   6.메인스레드에서 RunThread의 스레드 객체 th2생성 후 start
   7.main스레드의 마지막 문은 main의 마지막문임을 출력
   8.start이후 main스레드는 th1과 th2가 종료될때까지 대기하도록 해줌
   9.main스레드 마지막 문 종료후 다시 th1과 th2를 생성하고 start
   10.th1과 th2가 종료시까지 main스레드는 진행되지 않도록 처리(isAlive()사용)
*/
