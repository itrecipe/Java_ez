package com.kook.ch06Project;
//국쌤 퀴즈!
public class Ex06Quiz {
	//1. 인스턴스 변수로 문자열 변수 string
	String str = new String();
	
	//2. 클래스형 변수 int형 변수 number
	static int number;
	
	//11. static블록 만들고 블록안의 실행문은 static출력
	static {
		
	}
	
	//12. 인스턴스 블록 만들고 블록안의 실행문은 instance출력
	public static void main(String[] args) {
		//4. 3번의 메서드 호출
			myMethod();
		//6. 5번의 메서드를 호출하는데 인자를 kook으로 해서 호출
		//8. 인스턴스메서드 instanceMethod를 호출하는데 인자로 "홍길동"을 사용
		//9. 인스턴스변수 string을 abcde를 초기화하고 출력
		//10. 클래스 변수 number를 30으로 초기화 하고 출력
	}
	
	/* 3. 클래스형 메서드 myMethod는 리턴타입은 없고 파라미터도 없으며 실행문은
	     System.out.println("I just got executed!"); */
	static void myMethod {
		System.out.println("I just got executed!");
	}
	
	/* 5. 3번의 myMethod를 오버로딩한 메서드로 만드는데 파라미터를 String name으로 하고
	      실행문은 name을 출력 */
	
	/* 7. 인스턴스 메서드인 이름 instanceMethod이고 리턴타입은 문자열이며
		 파라미터는 문자열인 하나로 되어 있고 파라미터로 받은 값을 출력 하고 리턴값은 khs를 리턴 */
}