package com.kook.ch07Project;

public class Ex07_10 {

	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new Dropship() };
		//추상클래스도 객체로 사용할 수 있다.(다형성)
		//추상클래스를 상속하여 추상메서드를 구현한 하위 클래스인 일반클래스의 객체를 대입
		for(Unit u:group) {
			//u는 group배열의 실제 원소인 객체의 move 메서드 호출
			u.move(100, 200);
		}

	}
}

