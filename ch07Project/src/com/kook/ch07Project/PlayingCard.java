package com.kook.ch07Project;
//국쌤예제-교재에 없는 내용(인터페이스 만드는 방법)
public interface PlayingCard {
	//인터페이스는 상수와 추상메서드로만 만듬
	public static final int SPADE = 4;
	//인터페이스안의 상수는 public static final을 생략하거나 일부 생략가능
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;
	
	//인터페이스안의 추상메서드는 접근제어자가 public이어야 한다.(추상클래스는 public이 아니어도 된다.)
	public abstract String getCardNumber();
	//인터페이스 안에선 public abstract는 생략가능
	String getCardkind();
}
