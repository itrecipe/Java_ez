package com.h.ch06;

public class Ex06_09 {

	public static void main(String[] args) {
		//static 메서드 호출
		System.out.println(MyMath2.add(200, 200L));
		System.out.println(MyMath2.subtract(200, 200L));
		System.out.println(MyMath2.multiply(200, 200L));
		System.out.println(MyMath2.divide(200, 200L));
	
		//인스턴스 메서드 호출
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 200L;
	}
}

class MyMath2 {
	long a, b; //인스턴스 변수(글로벌 변수로 클래스 내 어디서나 사용가능)
	
	long add() { //리턴타입이 long형, 파라미터x
		//인스턴스 메서드는 인스턴스 멤버 or static멤버 클래스만 사용 가능
		return a + b; //a, b는 인스턴스 변수 사용하므로 인스턴스 메서드
	}

	long subtract() { 
		
		return a - b; //a, b는 인스턴스 변수 사용하므로 인스턴스 메서드
	}
	
	long multiply() { 
		
		return a * b; //a, b는 인스턴스 변수 사용하므로 인스턴스 메서드
	}

	long divide() { 
		
		return a / b; //a, b는 인스턴스 변수 사용하므로 인스턴스 메서드
	}
	
	//인스턴스 변수나 메서드를 호출하지 않는 경우엔 static으로 정의
	static long add(long a, long b) {
		return a + b; //인스턴스 변수 a,b가 아닌 전달받은 인자 값
		
	}
	static long subtract(long a, long b) {
		return a - b; //인스턴스 변수 a,b가 아닌 전달받은 인자 값
		
	}
	static long multiply(long a, long b) {
		return a * b; //인스턴스 변수 a,b가 아닌 전달받은 인자 값
		
	}
	static double divide(long a, long b) {
		return a / (double)b; //인스턴스 변수 a,b가 아닌 전달받은 인자 값
		
	}
}