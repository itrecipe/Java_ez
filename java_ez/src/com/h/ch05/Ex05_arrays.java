package com.h.ch05;

import java.util.Arrays;

public class Ex05_arrays {

	//êµ?.?Œ¤ ?˜ˆ? œ(êµì¬?— ?—†?Š” ?‚´?š©)
	public static void main(String[] args) {
		//Arrays ?´?˜?Š¤ : ëª¨ë“  ë©”ì„œ?“œê°? static(?´?˜?Š¤?˜•) ë©”ì„œ?“œë¡? ?˜¸ì¶œì‹œ ?´?˜?Š¤ëª?,ë©”ì„œ?“œëª?()
		
		//Arrays.ë©”ì„œ?“œëª?()
		int[] arr = {0,1,2,3,4}; //1ì°¨ì› ë°°ì—´ ?ƒ?„±
		int[][] arr2D = {{11,12},{21,22}}; //2ì°¨ì› ë°°ì—´ : 2?–‰ * 2?—´ ?ƒ?„±
		
		//1ì°¨ì› ë°°ì—´ ë¬¸ì?—´?™”?Š” Arrays.toString(1ì°¨ì› ë°°ì—´ëª?);
		String strArr = Arrays.toString(arr); 
		System.out.println(strArr); //[0,1,2,3,4] -> ê°? ì¶œë ¥
		/*
		 * toStringë©”ì„œ?“œ : ê°ì²´ê°? ê°–ê³  ?ˆ?Š” ? •ë³´ë‚˜ ê°’ë“¤?„ ë¬¸ì?—´ë¡? ë§Œë“¤?–´ 
		 * ë¦¬í„´(ë°˜í™˜) ë©”ì„œ?“œë¥? ?¬? •?˜?•´?„œ ?‚¬?š© 
		 * (?¬? •?˜ : ? •?˜?˜?–´ ?ˆ?Š” ë³??ˆ˜?‚˜ ë°°ì—´ ?š”?†Œê°? ?‹¤?‹œ ? •?˜?˜?Š”ê²?)
		 * ë©”ì†Œ?“œ?Š” ?ŒŒ?¼ë¯¸í„°ë¡? ë°°ì—´?„ ?…? ¥ë°›ì•„?„œ,
		 * java.util.Arrays.toString() : ë©”ì†Œ?“œ?Š” ?ŒŒ?¼ë¯¸í„°ë¡? ë°°ì—´?„ ?…? ¥ë°›ì•„?„œ,
		 * ë°°ì—´?— ? •?˜?œ ê°’ë“¤?„ ë¬¸ì?—´ ?˜•?ƒœë¡? ë§Œë“¤?–´?„œ ë¦¬í„´?•´ ì¤ë‹ˆ?‹¤.
		 */
		
		//2ì°¨ì› ë°°ì—´ ë¬¸ì?—´?™”?Š” Arrays.toString(1ì°¨ì› ë°°ì—´ëª?);
		System.out.println(Arrays.deepToString(arr2D)); //"[[11,12],[21,22]"
		// Arrays.deepToString(1ì°¨ì› ë°°ì—´ëª?) : ?‹¤ì°¨ì› ë°°ì—´?—?„œ?Š” ?´ê²ƒì„ ?‚¬?š©?•œ?‹¤.
		
		int[] arr1 = {0,1,2,3,4,5};
		int[][] arr2D1 = {{11,12},{21,22}};
		//1ì°¨ì› ë°°ì—´ ë¹„êµ(arr,arr1)
		System.out.println("1ì°¨ì› ë°°ì—´ ë¹„êµ : " + Arrays.equals(arr, arr1));
		
		
		//2ì°¨ì› ë°°ì—´ ë¹„êµ(arr,arr1)
		System.out.println("2ì°¨ì› ë°°ì—´ ë¹„êµ : " + Arrays.deepEquals(arr2D, arr2D1));
		
		//ë°°ì—´?˜ ? •? ¬?? Arrays.sort(ë°°ì—´ëª?);
		int[] arr2 = {5,3,15,6,9,8};
		Arrays.sort(arr2); //sort()ë©”ì„œ?“œ?Š” ë¦¬í„´ê°’ì´ ?—†ê³?, ?ê¸? ??‹ ?„ ? •? ¬?•¨.
		System.out.println("? •? ¬ : " + Arrays.toString(arr2));
		
		/*
		 * ë°°ì—´?˜ ë³µì‚¬ copyOf?Š” ì§?? •?œ ?ˆ«? ë§Œí¼?„,
		 * copyOfRange()?Š” ë°°ì—´?˜ êµ¬ê°„?„ ì§?? •?•˜?—¬ ë³µì‚¬?•œ ?‹¤ë¥? ë°°ì—´?„ ë§Œë“¬ 
		 * ëª¨ë‘ ë³µì‚¬?•˜?—¬ ?ƒˆë¡œìš´ ë°°ì—´?„ ë°˜í™˜
		 */
		int[] arr3 = {5,6,7,8,9};
		int[] arr4 = Arrays.copyOf(arr3, 3); //?ƒˆë¡œìš´ ë°°ì—´?„ ?ƒ?„±
		System.out.println("arr4 : " + Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOf(arr3, 10);
		//ë³µì‚¬?•˜?Š” ë°°ì—´?´ ?›?†Œ?˜ ê°œìˆ˜ ë³´ë‹¤ ë§ì„?‹œ ?‚˜ë¨¸ì??Š” ê¸°ë³¸ê°’ìœ¼ë¡? ì±„ì?
		
		int[] arr6 = Arrays.copyOfRange(arr3, 1, 4);
		//1?? ?‹œ?‘ ?ƒ‰?¸ë²ˆí˜¸, 4?Š” ì¢…ë£Œ ?ƒ‰?¸ë²ˆí˜¸(ë²”ìœ„?Š” ê·? ?•ê¹Œì?)
		System.out.println("arr 6 : " + Arrays.toString(arr6));
		
		//System.arraycopy()ë¥? ?‚¬?š©?•´ ë³µì‚¬
		int[] scopyArr = {1,2,3,4,5};
		int[] scopyArr1 = new int[10];
		System.arraycopy(scopyArr, 0, scopyArr1, 0, 5);
		/*
		 * scopyArr?Š” ë³µì‚¬ë°°ì—´, 0?? ë³µì‚¬ë°°ì—´?˜ ?‹œ?‘ ?ƒ‰?¸ë²ˆí˜¸, 
		 * scopyArr1?? ë³µì‚¬ë³? ë°°ì—´, 0?? ?‹œ?‘ ?ƒ‰?¸ë²ˆí˜¸, 5?Š” ?›?†Œê°œìˆ˜
		 */
		
		System.out.println("System.arraycopy()ë¥? ?‚¬?š©?•œ ë³µì‚¬ scopyArr : " + Arrays.toString(scopyArr));
		System.out.println("System.arraycopy()ë¥? ?‚¬?š©?•œ ë³µì‚¬ scopyArr1 : " + Arrays.toString(scopyArr1));
	}
}
