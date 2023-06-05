package com.kook.ch09Project;
//국.변
public class Ex09_01 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		//v1과 v2는 주소가 다름(저장된 인스턴스값은 10으로 동일함)
		
		//equals메서드는 Object의 메서드이므로 주소를 비교한다.
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같다");
		} 
		else {
			System.out.println("v1과 v2는 다르다");
			
		}
	}
}

class Value { //상속한 것이 없으므로 extends Object가 생략된 상태
	int value;
	//생성자
	Value() { //메서드명이 클래스명과 같으면 생성자임
		super(); //super는 Object의 생성자
	}
	
	//생성자
	Value(int value) {
		this.value = value;
	}
}