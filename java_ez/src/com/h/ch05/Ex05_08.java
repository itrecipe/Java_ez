package com.h.ch05;

public class Ex05_08 {

	public static void main(String[] args) {
		//êµ??Œ¤ ë³??˜• ?˜ˆ? œ(?›ë³¸ê³¼?‚´ì§ë‹¤ë¦?)
		
		// 2ì°¨ì› ë°°ì—´?˜ ì´ˆê¸°?™”
		int[][] score = {
				//4?–‰ 3?—´(4*3) ë°°ì—´ int[4][3]
				//?„ ?–¸ê³? ?™?‹œ?— ë¦¬í„°?Ÿ´ ê°’ìœ¼ë¡? ì´ˆê¸°?™”
				{100, 100, 100},
				{20, 30, 20},
				{30, 40, 50},
				{45, 55, 67}
		};
		
		int sum = 0;
		
		for(int i=0; i < score.length; i++) {
			//2ì°¨ì› ë°°ì—´?‹œ score.length?Š” ?–‰?˜ ê°œìˆ˜(4)
			for(int j=0; j < score[i].length; j++) {
				//ë°°ì—´ ê°í–‰?˜ ?š”?†Œ?˜ ê°œìˆ˜?Š” score[i].length
				System.out.printf("score[%d][%d]=%d%n", i, j, score[i][j]);
				
				sum += score[i][j];
			}
		}
		System.out.println("sum = " + sum);
	}
}

/*
 * 2ì°¨ì› ë°°ì—´ ?‚¬?š©?˜ˆ?‹œ
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
