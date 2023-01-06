package com.kook.ch07Project;

import java.awt.*;
import java.awt.event.*;
//가장 기본의 GUI패키지 클래스

//익명 클래스를 사용하지 않고 클래스를 만들어 사용
public class Ex07_18 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
		//파라미터로 ActionListenner을 구현한(EventHandler) 객체

	}

}

class EventHandler implements ActionListener {
	//ActionListener의 인터페이스를 구변할시 추상메서드를 구현
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!");
	}
	
}
