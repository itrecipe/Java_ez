package com.h.ch12;

public class Ex12_05 {

	public static void main(String[] args) {
		/* enum 참조변수 선언은 클래스처럼 해줌, (enum명, 참조변수명)
		   enum형 값은 (enum명.상수명으로 표시), (클래스형 변수처럼 접근)
		*/
		Direction d1 = Direction.EAST; //값은 0
		Direction d2 = Direction.valueOf("WEST"); //값은 2
		Direction d3 = Direction.valueOf(Direction.class, "EAST");
		
		//enum 객체는 상수명을 가짐
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		System.out.println("d3 : " + d3);
		
		/* enum객체 비교는 동일비교는 ==, compartTo()를 사용
		   다른 비교 연산자는 사용불가 >, <, >=, <= 등... 사용(x)
		*/
		System.out.println("d1==d2 ? " + (d1==d2));
		System.out.println("d1==d3 ? " + (d1==d3));
		//equals()도 사용가능
		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
		/* System.out.println("d2 > d3 ? " + (d1 > d3)); //다른비교연산자는 사용불가
		   - compareTo는 사용가능 앞객체-뒷객체(0,-,+)
		   - compareTo는 enum 상수의 값을 비교
		   - enum객체는 Enum(최상위클래스)객체이다.
		*/
		System.out.println("d1.compartTo(d3) ? " + (d1.compareTo(d3)));
		System.out.println("d1.compartTo(d2) ? " + (d1.compareTo(d2)));
		
		switch(d1) {
			case EAST: //switch case문에 사용할시 상수명만 사용(enum명.상수로는 사용불가)
				System.out.println("The direction is EAST.");
				break;
			case SOUTH: 
				System.out.println("The direction is SOUTH.");
				break;
			case WEST: 
				System.out.println("The direction is WEST.");
				break;
			case NORTH: 
				System.out.println("The direction is NORTH.");
				break;
			default : 
				System.out.println("Invalid direction");
				break;
		}
		
		Direction[] dArr = Direction.values();
		/* values() enum명으로 접근(static형), enum배열로 반환(enum형은 Enum객체)
		   values와 valueOf는 static처럼 enum명으로 접근
		*/
		for(Direction d : dArr) {
			/* name()과 ordinal()메서드는 최상위 클래스 Enum이 제공하는 메서드
			   ordinal()은 숫자값(상수값) 반환
			   name()과 ordinal()은 인스턴스형으로 접근
			*/
			System.out.println("상수명 : " + d.name());
			System.out.println("상수값 : " + d.ordinal());
		}
	}
}

enum Direction { //enum정의 클래스처럼 이름은 대문자로 시작
	/* enum은 상수들의 집합이므로 이름을 모두 대문자로 작성
	   문장 마지막 ; 없음
	   값은 자동으로 0부터 1씩 증가하여 각각의 상수에 주어짐
	*/
	EAST,SOUTH,WEST,NORTH
}