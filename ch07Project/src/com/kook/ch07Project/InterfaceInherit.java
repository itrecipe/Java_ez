package com.kook.ch07Project;
//국쌤예제-교재에 없는 내용
public interface InterfaceInherit extends Moveable, Attackable {
	//인터페이스간 상속은 클래간은 단일 상속이나 다중 상속가능
	//상속한 추상메서드 2개를 갖는 인터페이스
}

interface Moveable {
	//추상메서드
	/*public abstract 생략됨*/ void move(int x, int y);
}

interface Attackable {
	void attack();
}
