package com.kook.ch12Project;
//국.변
public class Ex12_06 {

	public static void main(String[] args) {
		for(Direction2 d : Direction2.values()) {
			//enum명.values()는 enum명이 갖고 있는 각각의 원소(상수)객체를 배열로 반환
			System.out.printf("%s=%d%s%n", d.name(),d.getValue(),d.getSymbol());
		}
		
		Direction2 d1 = Direction2.EAST; //enum의 각각의 상수를 객체로 처리
		Direction2 d2 = Direction2.SOUTH;
		
		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
	}
}

enum Direction2 {
	EAST(1, ">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	/* - 상수 값을 별도로 부여할시 ( )안에 부여한다.(여기서는 2개값을 줌)
	   - 상수 열겨후에 ;을 사용
	   - 괄호안의 첫번째 인자는 value, 두번째 인자는 symbol변수를 나타낸다.
	   - 괄호안의 2개 인자를 초기화하는 생성자와 두개 인자를 나타내는 멤버변수를 만들어 줘야함.
	*/
	
	private final int value;
	private final String symbol;
	
	Direction2(int value, String symbol) { //접근제어자는 묵시적으로 private
		this.value = value;
		this.symbol = symbol;
	}
	
	//외부에서 멤버변수 접근이 가능하도록하는 get메서드 생성
	public int getValue() {
		return value;
	}
	public String getSymbol() {
		return symbol;
	}
	public String toString() {
		return name()+getSymbol();
	}
}