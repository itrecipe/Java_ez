package com.kook.ch04Project;

public class Ex04_11 {

	public static void main(String[] args) {
		//중첩 for문
		//for문 안에 for문은 바깥쪽 for문의 반복 변수에 대해
		//중첩된 반복문의 모든 반복을 처리한 후 밖의 반복문의 반복 변수를 증감시켜
		//다시 안쪽 반복을 모두 처리
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				//조건식을 밖의 반복변수 이하시에만 반복
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
