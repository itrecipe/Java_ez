package com.kook.ch03Project;

public class Ex03_05 {

	public static void main(String[] args) {
		double d = 85.4; //소수점 있는 실수 값은 자바 코드에선 기본값이 double형
		int score = (int) d; 
		
		//숫자 범위별로 double -> float -> long -> int 
		//큰 데이터형에서 double에서 적은 int로 대입하려면 명시적으로 형변환(casting)을 함. 
		//실수에서 정수로 변환하면 소수점 이하는 무조건 삭제(절삭)
		 		
		System.out.println("score=" + score);
		System.out.println("d=" + d);

	}
}
