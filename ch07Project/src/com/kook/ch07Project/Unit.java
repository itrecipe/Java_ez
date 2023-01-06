package com.kook.ch07Project;
//국쌤변형예제(원본과상이)
public abstract class Unit { //abstract:추상클래스
	//추상클래스는 하나 이상의 추상 메서드가 있으면 추상 클래스로 만든다.
	//추상메서드가 하나도 없어도 추상 클래스로 정의된 클래스도 가능(원칙에 어긋난것이니 있다는 정도만 알것)
	//추상메서드가 있다는것 외엔 일반 메서드와 동일(멤버변수,멤버메서드,생성자)
	int x,y;

	//일반메서드
	void stop() {
		System.out.println("Stop!");
	}
	
	//추상메서드 추상을 나타내는 기타 제어자 abstract를 붙이고 선언부만 만들고 ;으로 종료
	abstract void move(int x, int y);
}