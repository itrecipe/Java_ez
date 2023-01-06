package com.kook.ch07Project;

public class SmartTv extends Tv {
	/* Tv클래스를 상속
	 * Tv클래스의 멤버변수와 멤버메서드를 상속(생성자나 초기화 블록은 상속 x)
	   멤버변수 power, chnnel과 멤버메서드 power(), chnnelUp(), chnnelDown()을 상속
	   상속된 것의 추가할것만 작성
	*/
	boolean caption;
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}
