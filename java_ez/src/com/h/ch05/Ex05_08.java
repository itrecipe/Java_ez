package com.h.ch05;

public class Ex05_08 {

	public static void main(String[] args) {
		//�??�� �??�� ?��?��(?��본과?��짝다�?)
		
		// 2차원 배열?�� 초기?��
		int[][] score = {
				//4?�� 3?��(4*3) 배열 int[4][3]
				//?��?���? ?��?��?�� 리터?�� 값으�? 초기?��
				{100, 100, 100},
				{20, 30, 20},
				{30, 40, 50},
				{45, 55, 67}
		};
		
		int sum = 0;
		
		for(int i=0; i < score.length; i++) {
			//2차원 배열?�� score.length?�� ?��?�� 개수(4)
			for(int j=0; j < score[i].length; j++) {
				//배열 각행?�� ?��?��?�� 개수?�� score[i].length
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				
				sum += score[i][j];
			}
		}
		System.out.println("sum = " + sum);
	}
}

/*
 * 2차원 배열 ?��?��?��?��
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
