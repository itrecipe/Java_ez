package com.h.ch05;

import java.util.Arrays;

public class Ex05_arrays {

	//κ΅?.?€ ?? (κ΅μ¬? ?? ?΄?©)
	public static void main(String[] args) {
		//Arrays ?΄??€ : λͺ¨λ  λ©μ?κ°? static(?΄??€?) λ©μ?λ‘? ?ΈμΆμ ?΄??€λͺ?,λ©μ?λͺ?()
		
		//Arrays.λ©μ?λͺ?()
		int[] arr = {0,1,2,3,4}; //1μ°¨μ λ°°μ΄ ??±
		int[][] arr2D = {{11,12},{21,22}}; //2μ°¨μ λ°°μ΄ : 2? * 2?΄ ??±
		
		//1μ°¨μ λ°°μ΄ λ¬Έμ?΄?? Arrays.toString(1μ°¨μ λ°°μ΄λͺ?);
		String strArr = Arrays.toString(arr); 
		System.out.println(strArr); //[0,1,2,3,4] -> κ°? μΆλ ₯
		/*
		 * toStringλ©μ? : κ°μ²΄κ°? κ°κ³  ?? ? λ³΄λ κ°λ€? λ¬Έμ?΄λ‘? λ§λ€?΄ 
		 * λ¦¬ν΄(λ°ν) λ©μ?λ₯? ?¬? ??΄? ?¬?© 
		 * (?¬? ? : ? ???΄ ?? λ³??? λ°°μ΄ ??κ°? ?€? ? ???κ²?)
		 * λ©μ?? ??Όλ―Έν°λ‘? λ°°μ΄? ?? ₯λ°μ?,
		 * java.util.Arrays.toString() : λ©μ?? ??Όλ―Έν°λ‘? λ°°μ΄? ?? ₯λ°μ?,
		 * λ°°μ΄? ? ?? κ°λ€? λ¬Έμ?΄ ??λ‘? λ§λ€?΄? λ¦¬ν΄?΄ μ€λ?€.
		 */
		
		//2μ°¨μ λ°°μ΄ λ¬Έμ?΄?? Arrays.toString(1μ°¨μ λ°°μ΄λͺ?);
		System.out.println(Arrays.deepToString(arr2D)); //"[[11,12],[21,22]"
		// Arrays.deepToString(1μ°¨μ λ°°μ΄λͺ?) : ?€μ°¨μ λ°°μ΄??? ?΄κ²μ ?¬?©??€.
		
		int[] arr1 = {0,1,2,3,4,5};
		int[][] arr2D1 = {{11,12},{21,22}};
		//1μ°¨μ λ°°μ΄ λΉκ΅(arr,arr1)
		System.out.println("1μ°¨μ λ°°μ΄ λΉκ΅ : " + Arrays.equals(arr, arr1));
		
		
		//2μ°¨μ λ°°μ΄ λΉκ΅(arr,arr1)
		System.out.println("2μ°¨μ λ°°μ΄ λΉκ΅ : " + Arrays.deepEquals(arr2D, arr2D1));
		
		//λ°°μ΄? ? ? ¬?? Arrays.sort(λ°°μ΄λͺ?);
		int[] arr2 = {5,3,15,6,9,8};
		Arrays.sort(arr2); //sort()λ©μ?? λ¦¬ν΄κ°μ΄ ?κ³?, ?κΈ? ?? ? ? ? ¬?¨.
		System.out.println("? ? ¬ : " + Arrays.toString(arr2));
		
		/*
		 * λ°°μ΄? λ³΅μ¬ copyOf? μ§?? ? ?«? λ§νΌ?,
		 * copyOfRange()? λ°°μ΄? κ΅¬κ°? μ§?? ??¬ λ³΅μ¬? ?€λ₯? λ°°μ΄? λ§λ¬ 
		 * λͺ¨λ λ³΅μ¬??¬ ?λ‘μ΄ λ°°μ΄? λ°ν
		 */
		int[] arr3 = {5,6,7,8,9};
		int[] arr4 = Arrays.copyOf(arr3, 3); //?λ‘μ΄ λ°°μ΄? ??±
		System.out.println("arr4 : " + Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOf(arr3, 10);
		//λ³΅μ¬?? λ°°μ΄?΄ ??? κ°μ λ³΄λ€ λ§μ? ?λ¨Έμ?? κΈ°λ³Έκ°μΌλ‘? μ±μ?
		
		int[] arr6 = Arrays.copyOfRange(arr3, 1, 4);
		//1?? ?? ??Έλ²νΈ, 4? μ’λ£ ??Έλ²νΈ(λ²μ? κ·? ?κΉμ?)
		System.out.println("arr 6 : " + Arrays.toString(arr6));
		
		//System.arraycopy()λ₯? ?¬?©?΄ λ³΅μ¬
		int[] scopyArr = {1,2,3,4,5};
		int[] scopyArr1 = new int[10];
		System.arraycopy(scopyArr, 0, scopyArr1, 0, 5);
		/*
		 * scopyArr? λ³΅μ¬λ°°μ΄, 0?? λ³΅μ¬λ°°μ΄? ?? ??Έλ²νΈ, 
		 * scopyArr1?? λ³΅μ¬λ³? λ°°μ΄, 0?? ?? ??Έλ²νΈ, 5? ??κ°μ
		 */
		
		System.out.println("System.arraycopy()λ₯? ?¬?©? λ³΅μ¬ scopyArr : " + Arrays.toString(scopyArr));
		System.out.println("System.arraycopy()λ₯? ?¬?©? λ³΅μ¬ scopyArr1 : " + Arrays.toString(scopyArr1));
	}
}
