package com.kook.ch08Projcet;
//국.변
public class Ex08_05 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}
		catch(Exception e) { //최상위 예외(Exception)이므로 모든 예외가 거쳐감 
			e.printStackTrace();
			//call stack메모리에 있는 메서드의 정보에서 예외정보 콘솔창에 출력
			System.out.println(e.getMessage());
			//해당 예외 객체에 정의된 예외 메시지
		}
		System.out.println("try~catch 외부");
	}

}
