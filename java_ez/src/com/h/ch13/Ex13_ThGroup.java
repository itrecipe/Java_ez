package com.h.ch13;
//국쌤예제 - 교재에 없는 내용(추가설명)
public class Ex13_ThGroup {

	public static void main(String[] args) {
		//쓰레드 생성하는방법(제일중요함!)
		//쓰레드 그룹 활용, main스레드가 만드는 스레드는 스레드 그룹은 main스레드 그룹에 속한다.
		ThreadGroup myGroup = new ThreadGroup("myGroup"); //그룹명이 myGroup
		/* 그룹명과 쓰레드명을 사용하는 쓰레드 생성자를 호출하여 쓰레드 생성
		   두개 쓰레드 모두 쓰레드 그룹이 myGroup으로 동일하다.
		*/
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력내용 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		//main쓰레드가 속해있는 쓰레드그룹을 알아낸다.	
		mainGroup.list(); //쓰레드그룹과 쓰레드명을 출력 해주는 메서드
		
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			
		}
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 호출 ]");
		myGroup.interrupt(); //run()의 sleep를 중단하고 이때 예외가 발생하고 run()종료(스레드 종료)
	}

}

class WorkThread extends Thread {
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
		//부모 클래스인 Thread의 생성자 Thread(ThreadGroup group, String name)를 사용
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000); //sleep중 interrupt()가 실행(정지)되면 예외발생
			} catch (Exception e) {
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		System.out.println(getName() + " 종료됨");
	}
}