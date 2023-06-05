package com.kook.ch13Project;

//1
public class Ex13Quiz extends Thread {
	//Thread는 Runnable인터페이스를 구현한 클래스로 java.lang에 있는 기본 클래스
	
	//2
	@Override
	public void run() {
		System.out.println("Ex13QuizClass클래스의 스레드");
		
	}
	public static void main(String[] args) {
		//3
		Ex13Quiz th1 = new Ex13Quiz();
		//6
		Thread th2 = new Thread(new RunThread());
		//Ex13Quiz 명시적으로 작성된 생성자가 없으므로 기본 생성자를 사용
		//public Ex13Quiz() { super();}를 사용
		th1.start(); //스레드는 Runnable상태가 됨(실행 가능한 대기상태가 되어 있다가 cpu할당시 run()를 실행함)
		th2.start();

		/* 남의 코드(한줄에 작성했음)
		Thread th2 = new Thread(new RunThread());
		th2.start();
		*/
		//8
		try {
			//현재스레드인 main스레드는 th1과 th2스레드 종료시까지 정지
			th1.join();
			th2.join();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}			
		//9
		
		/*
		- 이렇게 생성하는 방법도 있다.
		new Thread(th1).start();
		new Thread(th2).start();
		*/
		
		//스레드를 다시 사용하려면 새로 생성해야 사용가능
		th1 = new Ex13Quiz();
		th2 = new Thread(new RunThread());
		//th2 = new Ex13Quiz();
		th1.start();
		th2.start();
		//10
		//국쌤코드
		/* isAlive()는 스레드가 사용가능한 상태인지 아닌지 반환(종료 상태이면 false)
		   isAlive()는 메인스레드 진행을 지연시킨다.
		 */
		
		while(true) {
			if(th1.isAlive() || th2.isAlive()) {
				System.out.println("아직은 th1과 th2 진행중");
			}
			else {
				break;
			}
		}
		
		System.out.println("main스레드의 재시작 마지막 문장");
		/*
		try {
			while(th1.isAlive() || th2.isAlive()) {
				Thread.sleep(500);
				th1.interrupt();
				th2.interrupt();
		        System.out.println("interrupt() called");
		        th1.join( 500 );
		        th2.join( 500 );
				
			}
			System.out.println( "th1 : isAlive = " + th1.isAlive() );
			System.out.println( "th2 : isAlive = " + th2.isAlive() );
		    System.out.println( "th1 : isInterrupted = " + th1.isInterrupted());
		    System.out.println( "th2 : isInterrupted = " + th2.isInterrupted());
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
  		*/
		//7
		System.out.println("7번 : main의 마지막 문");
	}
}

//4
class RunThread implements Runnable {
	//5
	
	//Runnable인터페이스의 추상메서드 구현(재정의)
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