package com.kook.ch04Project;

public class Ex04_08 {

	public static void main(String[] args) {
		for (int i = 1; i <=3; i++) {
			//초기화부는 로칼변수로 선언
			//조건식은 true/false를반환하는 비교연산이나 논리 연산을 사용
			//증감식은 증가시에는 ++ , 감소시 --
			System.out.println("Hello");
		}
		//ex04_09예제-112p
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
			for(int i=1; i<=5; i++) {
				System.out.print(i);	
		}
		
		//ex04_10예제-112p
		int sum = 0; //누계를 위한 변수
		
		for(int i=1; i <= 5; i++) { //int i = 1은 로컬 변수로 {}안에서만 사용
			sum += i; //sum = sum + i;
			System.out.printf("1부터 %2d 까지 합: %2d%n", i, sum);
		}
	}
}
