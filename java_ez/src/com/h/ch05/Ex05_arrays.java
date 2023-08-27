package com.h.ch05;

import java.util.Arrays;

public class Ex05_arrays {

	//�?.?�� ?��?��(교재?�� ?��?�� ?��?��)
	public static void main(String[] args) {
		//Arrays ?��?��?�� : 모든 메서?���? static(?��?��?��?��) 메서?���? ?��출시 ?��?��?���?,메서?���?()
		
		//Arrays.메서?���?()
		int[] arr = {0,1,2,3,4}; //1차원 배열 ?��?��
		int[][] arr2D = {{11,12},{21,22}}; //2차원 배열 : 2?�� * 2?�� ?��?��
		
		//1차원 배열 문자?��?��?�� Arrays.toString(1차원 배열�?);
		String strArr = Arrays.toString(arr); 
		System.out.println(strArr); //[0,1,2,3,4] -> �? 출력
		/*
		 * toString메서?�� : 객체�? 갖고 ?��?�� ?��보나 값들?�� 문자?���? 만들?�� 
		 * 리턴(반환) 메서?���? ?��?��?��?��?�� ?��?�� 
		 * (?��?��?�� : ?��?��?��?�� ?��?�� �??��?�� 배열 ?��?���? ?��?�� ?��?��?��?���?)
		 * 메소?��?�� ?��?��미터�? 배열?�� ?��?��받아?��,
		 * java.util.Arrays.toString() : 메소?��?�� ?��?��미터�? 배열?�� ?��?��받아?��,
		 * 배열?�� ?��?��?�� 값들?�� 문자?�� ?��?���? 만들?��?�� 리턴?�� 줍니?��.
		 */
		
		//2차원 배열 문자?��?��?�� Arrays.toString(1차원 배열�?);
		System.out.println(Arrays.deepToString(arr2D)); //"[[11,12],[21,22]"
		// Arrays.deepToString(1차원 배열�?) : ?��차원 배열?��?��?�� ?��것을 ?��?��?��?��.
		
		int[] arr1 = {0,1,2,3,4,5};
		int[][] arr2D1 = {{11,12},{21,22}};
		//1차원 배열 비교(arr,arr1)
		System.out.println("1차원 배열 비교 : " + Arrays.equals(arr, arr1));
		
		
		//2차원 배열 비교(arr,arr1)
		System.out.println("2차원 배열 비교 : " + Arrays.deepEquals(arr2D, arr2D1));
		
		//배열?�� ?��?��?? Arrays.sort(배열�?);
		int[] arr2 = {5,3,15,6,9,8};
		Arrays.sort(arr2); //sort()메서?��?�� 리턴값이 ?���?, ?���? ?��?��?�� ?��?��?��.
		System.out.println("?��?�� : " + Arrays.toString(arr2));
		
		/*
		 * 배열?�� 복사 copyOf?�� �??��?�� ?��?�� 만큼?��,
		 * copyOfRange()?�� 배열?�� 구간?�� �??��?��?�� 복사?�� ?���? 배열?�� 만듬 
		 * 모두 복사?��?�� ?��로운 배열?�� 반환
		 */
		int[] arr3 = {5,6,7,8,9};
		int[] arr4 = Arrays.copyOf(arr3, 3); //?��로운 배열?�� ?��?��
		System.out.println("arr4 : " + Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOf(arr3, 10);
		//복사?��?�� 배열?�� ?��?��?�� 개수 보다 많을?�� ?��머�??�� 기본값으�? 채�?
		
		int[] arr6 = Arrays.copyOfRange(arr3, 1, 4);
		//1?? ?��?�� ?��?��번호, 4?�� 종료 ?��?��번호(범위?�� �? ?��까�?)
		System.out.println("arr 6 : " + Arrays.toString(arr6));
		
		//System.arraycopy()�? ?��?��?�� 복사
		int[] scopyArr = {1,2,3,4,5};
		int[] scopyArr1 = new int[10];
		System.arraycopy(scopyArr, 0, scopyArr1, 0, 5);
		/*
		 * scopyArr?�� 복사배열, 0?? 복사배열?�� ?��?�� ?��?��번호, 
		 * scopyArr1?? 복사�? 배열, 0?? ?��?�� ?��?��번호, 5?�� ?��?��개수
		 */
		
		System.out.println("System.arraycopy()�? ?��?��?�� 복사 scopyArr : " + Arrays.toString(scopyArr));
		System.out.println("System.arraycopy()�? ?��?��?�� 복사 scopyArr1 : " + Arrays.toString(scopyArr1));
	}
}
