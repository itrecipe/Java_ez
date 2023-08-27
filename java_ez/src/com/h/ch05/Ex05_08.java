package com.h.ch05;

public class Ex05_08 {

	public static void main(String[] args) {
		//국쌤 변형 예제(원본과살짝다름)
		
		// 2차원 배열의 초기화
		int[][] score = {
				//4행 3열(4*3) 배열 int[4][3]
				//선언과 동시에 리터럴 값으로 초기화
				{100, 100, 100},
				{20, 30, 20},
				{30, 40, 50},
				{45, 55, 67}
		};
		
		int sum = 0;
		
		for(int i=0; i < score.length; i++) {
			//2차원 배열시 score.length는 행의 개수(4)
			for(int j=0; j < score[i].length; j++) {
				//배열 각행의 요소의 개수는 score[i].length
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				
				sum += score[i][j];
			}
		}
		System.out.println("sum = " + sum);
	}
}

/*
 * 2차원 배열 사용예시
 * ex1)
 * int[][] score = new int[][] {
 *  {100, 100, 100}, 
 *  {20, 30, 20}, 
 *  {30,40, 50}, 
 *  {45, 55, 67} 
 *  };
 *  
 *  ex2)
 *  int[][] score = new int[4][3]{
 *  		{100, 100, 100},
				{20, 30, 20},
				{30, 40, 50},
				{45, 55, 67}
			};
 *  
 */
