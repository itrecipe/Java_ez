package com.h.ch05;

public class Ex05_08 {

	public static void main(String[] args) {
		//���� ���� ����(��������¦�ٸ�)
		
		// 2���� �迭�� �ʱ�ȭ
		int[][] score = {
				//4�� 3��(4*3) �迭 int[4][3]
				//����� ���ÿ� ���ͷ� ������ �ʱ�ȭ
				{100, 100, 100},
				{20, 30, 20},
				{30, 40, 50},
				{45, 55, 67}
		};
		
		int sum = 0;
		
		for(int i=0; i < score.length; i++) {
			//2���� �迭�� score.length�� ���� ����(4)
			for(int j=0; j < score[i].length; j++) {
				//�迭 ������ ����� ������ score[i].length
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				
				sum += score[i][j];
			}
		}
		System.out.println("sum = " + sum);
	}
}

/*
 * 2���� �迭 ��뿹��
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
