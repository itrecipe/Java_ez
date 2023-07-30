package com.kook.ch14Project;
//국쌤(교재에 없는 예제-추가설명), 자바의정석(기초)-555p
public class Ex14_anony {

	public static void main(String[] args) {
		
		//익명의 객체 obj를 생성
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		
		/* obj.max(5,3); Object클래스에는 max메서드가 없어서 에러
		   람다식으로 익명 객체의 메서드를 구현하기 위해서는 아래 코드처럼 작성한다.
		   그러나, 람다식을 익명의 객체에 대입하려면 람다식만 대입해 주면 되나,
		   (단, 익명의 객체는 추상메서드가 하나만 있는 인터페이스 객체여야 한다.)
		   추상메서드가 하나만 있는 인터페이스는 @FunctionalInterface
		   Objetct는 추상메서드 하나만 있는 인터페이스가 아니므로 에러가 발생한다.
		   
		   ex) 일부러 에러가 발생 되도록 작성된 예시코드
			obj = (int a, int b) -> {
				return a > b ? a : b;
		 	}
		
		*/
	}

}
