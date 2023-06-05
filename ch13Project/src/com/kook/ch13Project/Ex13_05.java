package com.kook.ch13Project;
//국.변

import javax.swing.JOptionPane;

public class Ex13_05 {
	//main스레드와 다른 스레드로 스레드 I/O 블록킹시 처리 실행 예시
	public static void main(String[] args) {
		//main스레드에서 다른 스레드를 생성함
		Runnable r = new Thread5_1();
		Thread th1 = new Thread(r);
		//한줄로 작성할때 예시 ex) -> new Thread(new Thread5_1);
		
		th1.start(); 
		/* th1을 실행가능한 대기상태로 보낸다.(runnable상태), 
		   실행은 window os에서 cpu를 할당해주면 run()메서드를 실행
	    */
		
		//main스레드 처리
		String input = JOptionPane.showInputDialog("아무값이나 입력해라");
		//입력 I/O블록킹되는 시간동안 다른 스레드 th1이 동작한다.
		System.out.println("입력한 값은? : " + input + " 이다.");
	}

}

class Thread5_1 implements Runnable {
	@Override
	public void run() { //스레드 처리할때는 public void run() 이 메소드 하나밖에 없다고 함 
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //sleep(밀리세컨드)는 밀리세컨드 동안 스레드 정지, 1초간 시간지연
			}
			catch (Exception e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}