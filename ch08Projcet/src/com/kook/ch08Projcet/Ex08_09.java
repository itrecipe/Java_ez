package com.kook.ch08Projcet;
//국.변
public class Ex08_09 {
	//메소드에 throws를 사용하면 맨처음 try~catch처리한 메소드까지 계속 예외처리를 위임
	public static void main(String[] args) {
		
		try {
			method1(); //메소드명으로 호출시 static이어야만 호출가능
		}
		catch (Exception e) {
			System.out.println("main메서드까지 예외처리 위임하여 main에서 처리");
		}

	}
	static void method1() throws Exception {
	//메소드에 throws 예외클래스명 하면 예외처리를 자신 메서드에서 안하고 자신을 호출한 메서드로 위임한다.
		method2();
	}
	static void method2() throws Exception {
		throw new Exception();
	}
}
