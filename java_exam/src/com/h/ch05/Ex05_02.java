package com.h.ch05;

public class Ex05_02 {

	public static void main(String[] args) {
		int sum = 0; 
		//main메서드 안에 있는 변수로서 로컬 변수(지역변수)라고 함 main메서드 안에서만 사용 및 작동가능
		//로컬 변수는 기본값이 없어 선언시 초기값을 줘야함
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		//배열 선언과 동시에 리터럴로 초기화 
		//int[] score = {100, 88, 100, 100, 90};
		//int[] score = new int[5]; score = {100, 88, 100, 100, 100, 90};
		
		for (int i=0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length; //int / float = float
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
	}
}
