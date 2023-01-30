package com.kook.ch13Project;

public class Ex13Quiz {

	public static void main(String[] args) {
		//3
		Thread th1 = new Thread();
		th1.start();
		//6
		Runnable r = new RunThread();
		Thread th2 = new Thread(r);
		
		th2.start();
		//7
	}
}

//1
class Ex13QuizClass extends Thread {
	//2
	@Override
	public void run() {
		System.out.println("Ex13QuizClass클래스의 스레드");
	}
}
//4
class RunThread implements Runnable {
	//5
	@Override
	public void run() {
		System.out.println("RunThread의 thread");
	}
}
//6

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