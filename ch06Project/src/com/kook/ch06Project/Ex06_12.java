package com.kook.ch06Project;
//국쌤 변형 예제(원본과 상이)
public class Ex06_12 {

	public static void main(String[] args) {
		Car01 c1 = new Car01();
		/* 기본형 생성자로 만들면 Car클래스 객체 c1의 멤버변수는 초기값이 기본값으로 생성됨
		 * color는 null, gearType도 null, door는 0 
		*/
		
		//객체를 만든 후에 멤버변수 초기화
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		//객체 생성시 생성자를 이용하여 초기화
		Car01 c2 = new Car01("dark", "manual", 3);
		System.out.println("c2 color = " + c2.color);
		System.out.println("c2 gear = " + c2.gearType);
		System.out.println("c2 door = " + c2.door);
	
		System.out.println("c1 color = " + c1.color);
		System.out.println("c1 gear = " + c1.gearType);
		System.out.println("c1 door = " + c1.door);
	}
}

//동일한 package에서 동일한 이름의 클래스가 존재하는 경우 인식 x
class Car01 {
	String color;
	String gearType;
	int door;
	
	//생성자의 접근 제한자는 class의 접근 제한자와 일치
	Car01() {
		
	}
	
//파라미터를 갖는 생성자 정의(기본형 생성자는 사용 불가 하므로 명시적으로 생성)
Car01(String c, String g, int d){
	color = c;
	gearType = g;
	door = d;
	
	}
}