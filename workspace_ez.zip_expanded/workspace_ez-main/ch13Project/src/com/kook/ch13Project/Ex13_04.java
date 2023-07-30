package com.kook.ch13Project;

import javax.swing.JOptionPane; //그래픽 처리
//국.변
public class Ex13_04 {
	//main스레드만 사용
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("아무값이나 입력해라");
		//대화창을 제공하는 GUI창, 확인 버튼을 클릭해야만 작업종료 --여기까지는 I/O블록킹(스레드 대기상태)
		System.out.println("입력한 값은? : " + input + " 이다.");
		
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