package com.kook.ch07Project;
//국쌤변형예제(원본과상이)
public class Marine extends Unit {
	//추상클래스를 상속한 클래스는 추상클래스의 모든 추상메서드를 구현(재정의)해야 한다.
	//만일 하나라도 안할시 에러나고, 추상클래스로 사용해야함
	//이클립스의 클래스 생성시 상속(SuperClass)을 사용하면 자동으로 블록안의 코드가 없는 추상메서드가 구현됨.
	//내용이 없는 추상메서드 구현도 구현된것으로 처리
	@Override
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y" + y + "]");
	}
	
	void stimPack() {
		System.out.println("stimPack사용");
	}
}