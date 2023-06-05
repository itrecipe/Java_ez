package com.kook.ch13Project;

import javax.swing.JOptionPane;

public class Ex13_09 {

	public static void main(String[] args) {
		// interrupt사용
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		//I/O block이 발생(진행중인 스레드가 대기상태가(일시정지) 된다.)
		String input = JOptionPane.showInputDialog("아무값이나 입력해라");
		//입력처리가 종료되면 Runnable상태가 되고 cpu가 할당되면 run
		System.out.println("입력한 값은" + input + "이다.");
		
		th1.interrupt(); 
		/* - th1스레드의 진행을 일시정지 및 중단 시키고 runnable상태로 변환하도록 요청한다.
		     (실제로 정지기능을 중단시키지는 못한다.)
		   - 정지하고 있는 스레드의 예외를 발생시켜 중단을 멈추고 run메서드에서 나머지 부분을 실행하고 종료한다.
		   - 여기서는 isInterrupted()로 인터럽트 상태를 이용해 run메서드를 종료 시킨다.
		*/
		System.out.println("isInterrupted() : " + th1.isInterrupted());
		
		System.out.println("main메서드 종료");
	}

}

class ThreadEx9_1 extends Thread {
	@Override
	public void run() {
		int i = 10;
		while(i!=0 && isInterrupted()) { //인터럽트가 호출 안된 상태이며 i가 0이아닌 상태라면 true
			System.out.println(i--);
			for(long x=0; x < 2500000000L; x++) {
				
			}
		}
		System.out.println("카운트 종료");
	}
}