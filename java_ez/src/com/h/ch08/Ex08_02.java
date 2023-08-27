package com.h.ch08;
//국.변
public class Ex08_02 {

	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			System.out.println(0/0); 
			//수학에선 0을 0으로 못나눔(그래서 산술예외가 ArithmeticException발생함!)
			System.out.println(2); //앞 부분에서 예외 발생시 해당 문장 수행 불가(catch문으로 감)
		}
		catch (ArithmeticException e) {
			//예외가 ArithmeticException(산술연산예외:계산하다에러발생)일시 처리
			//여기서 예외처리 되면 try~catch문 종료
			System.out.println(3);
			e.printStackTrace();
		}
		catch (Exception e) {
			//Exception은 예외 클래스의 최상위 클래스이므로 모든 예외를 처리
			//ArithmeticException을 제외한 예외 처리
			System.out.println("ArithmeticException 아닌 예외 발생");
		}
		
		//예외가 없거나 catch로 예외처리 후 실행되는 문장
		//예외가 발생 헀으나 catch로 예외처리 안되면 이곳으로 안오고 프로그램 종료
		System.out.println("try~catch 문장 밖");
	}
}
