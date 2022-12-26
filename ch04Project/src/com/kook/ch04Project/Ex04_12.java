package com.kook.ch04Project;

public class Ex04_12 {

	public static void main(String[] args) {
		//while문
		int i = 5;
		//while(조건식)으로 조건식은 boolean을 반환하는 비교연산식이나 논리연산식
		// !=은 비교연산으로 다를시 true
		while(i--!=0) {
			// i--는 선연산 후 감소
			System.out.println(i + " - I will be back -");
			
		}
	}
}
