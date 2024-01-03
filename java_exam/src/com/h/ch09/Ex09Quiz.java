package com.h.ch09;

public class Ex09Quiz {

	public static void main(String[] args) {
		//1
		Integer myInt = 5;
		//Integer myInt1 = new Integer(5); 자바9부터 비사용 권고
		
		//2 
		Double myDouble = 5.99; // 소수점 숫자는 기본이 double
		//3
		Character myChar = 'A';
		 
		//4. Wrapper Class는 toString()이 내용을 출력하도록 이미 Override됨
		System.out.println(myInt.toString()); //toString()은 자바컴파일러가 자동으로 부착해줌
		System.out.println(myDouble);
		System.out.println(myChar);
		
		//5.
		//내 코드
		Integer strInt = Integer.valueOf(1);
		Double strDouble = Double.valueOf(2);
		Character strChar = Character.valueOf('3');
		
		/* 기본형을 String형으로 변환하는 메서드 valueOf()
		   거꾸로 문자열 객체를 기본형으로 바꾸는 valueOf()도 있음(반환을 wrapper클래스로 반환)
		   parseData형(문자열)을 사용하는것도 가능(반환이 기본형)
		*/
		
		//남의코드
		String strInt1 = String.valueOf(myInt);
		String strDouble1 = String.valueOf(myDouble);
		String strChar1 = String.valueOf(myChar);
		
		/* 이렇게도 작성가능
		   String strInt1 = myInt.toString();
		   String strDouble1 = myDouble.toString();
		   String strChar1 = myChar.toString();
		*/
		
		//6
		//내 코드
		System.out.println(strInt);
		System.out.println(strDouble);
		System.out.println(strChar);
		//남의코드
		System.out.println(strInt1);
		System.out.println(strDouble1);
		System.out.println(strChar1);
		
		//7
		String greeting = "Hello World"; //new 생성자사용하는것보다 권고함
		
		//8
		//문자열의 문자개수는 length()메서드 사용 특수문자,공백 등이 모두포함
		System.out.println("greeting 문자수: " + greeting.length());
		
		//9
		greeting = greeting.toUpperCase();
		System.out.println(greeting);
		
		//10
		//쌤코드
		System.out.println("john " + "Doe");
		System.out.println("john ".concat("Doe"));
		
		//남의 코드
		String anNyoung = "Hello World";//권고사항 입니다
		StringBuffer a = new StringBuffer(anNyoung);
		System.out.println(a.append("John").append("Doe"));
		
		
		//11.
		//쌤코드
		int idx = greeting.indexOf('e'); //문자열에서 맨처음 일치하는 곳의 색인번호 반환
		System.out.println("index : " + idx);
		
		//남의코드
		char result = greeting.charAt(1);
		System.out.println(result);
		
		//12
		//록 코드
		int x = 5;
		int y = 7;
		System.out.println(greeting.indexOf("e"));
		System.out.println(Integer.compare(x, y));
		
		//쌤 코드
		int x1 = 5;
		int y1 = 7;
		System.out.println(Math.max(x, y));
		System.out.println(Math.min(x, y));
		
		//13
		int z = (int) Math.sqrt(16);
		System.out.println(z);
		
		//14
		StringBuffer sb = new StringBuffer("abcdef"); 

		//15
		System.out.println(sb +"12345"); //StringBuffer도 toString()이 오버라이드 됨
		System.out.println(sb.append("12345"));
	}
}

/* 1.int의 객체형 변수 myInt를 선언하고 초기값 5를 대입
   2.double 객체형 변수 myDouble를 선언하고 초기값 5.99대입
   3.char 객체형 myChar를 선언하고 초기값 A대입
   4.1,2,3 출력
   5.1,2,3 변수를 문자열 변수 strInt,strDouble,strChar로 변환
   6.5번 변수값 각 각각 출력
   7.값이 Hello World인 문자열 변수 greeting을 선언
   8.7번의 greeting 변수의 문자수를 출력
   9.7번의 문자열을 모두 대문자로 변환하여 출력
   10.John과 Doe를 결합하여 출력
   11.7번 greeting변수에서 e문자의 색인번호 알아내기
   12.x는 5이고 y는 7인데 이중 큰값을 얻어내기
   13.z는 16인데 루트값 얻어내기
   14.문자열 abcdef를 갖는 StringBuffer객체 sb 선언
   15.sb에 문자열 12345 붙이기
*/