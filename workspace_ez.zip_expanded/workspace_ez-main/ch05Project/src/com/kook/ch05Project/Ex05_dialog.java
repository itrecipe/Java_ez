package com.kook.ch05Project;

import javax.swing.JOptionPane;

public class Ex05_dialog {

	public static void main(String[] args) {
		//국쌤 예제
		
		// GUI swing 패키지의 클래스를 이용해 그래픽 대화창 생성
		String input = JOptionPane.showInputDialog("숫자를 입력하라");
		
		//입력된 값을 반환, 파라미터는 안내문
		System.out.println(input);
	}
}