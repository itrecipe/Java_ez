package com.kook.ch07Project;

public class Ex07_01 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10; //channel은 상속한 멤버변수
		stv.channelUp(); //상속한 메서드
		System.out.println(stv.channel);
		
		stv.displayCaption("hello, world"); //자신이 만든 메서드(조상인 Tv에는 없음)
		stv.caption = true;	//자신이 만든 멤버 변수(조상에는 없음)
		stv.displayCaption("hello, world");
	}
}