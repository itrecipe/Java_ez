package com.kook.ch06Project;

public class Ex06_08 {

	public static void main(String[] args) {
		Data3 d = new Data3(); //주소값을 저장할 공간을 생성, new연산자로 객체 인스턴스화
		d.x = 10;
		Data3 d2 = copy(d); //return값이 tmp임
		
		System.out.println("d.x : " + d.x);
		System.out.println("d2.x : " + d2.x);
	}
	
	static Data3 copy(Data3 d) {
		//static메서드, Ex06_08클래스의 멤버메서드, 리턴타입이 Data3객체, 파라미터도 Data3객체
		Data3 tmp = new Data3();
		//tmp.x = 0;
		tmp.x = d.x;
	
		return tmp;
	}
}

class Data3 { 
	int x;
}