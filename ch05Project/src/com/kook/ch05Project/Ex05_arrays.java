package com.kook.ch05Project;

import java.util.Arrays;

public class Ex05_arrays {
	//국쌤 예제(교재에 없는 내용)
	public static void main(String[] args) {
		
		// Arrays 클래스 모든 메서드가 static(클래스형) 메서드로 호출시 클래스명.메서드명()
		//Arrays.메서드명()
		int[] arr = {0,1,2,3,4}; //1차원배열
		int[][] arr2D = {{11,12},{21,22}}; //2차원 배열 2행 * 2열
		
		//1차원 배열 문자열화는 Arrays.toString(1차원 배열명);
		String strArr = Arrays.toString(arr);
		System.out.println(strArr); //[0, 1, 2, 3, 4] -> 값 출력
		
		//2차원 배열 문자열화는 Arrays.toString(1차원 배열명);
		System.out.println(Arrays.deepToString(arr2D)); // "[[11, 12], [21, 22]]"
	
		int[] arr1 = {0,1,2,3,4,5};
		int[][] arr2D1 = {{11,12},{21,22}};
		//1차원 배열 비교(arr,arr1)
		System.out.println("1차원 배열 비교 : " + Arrays.equals(arr, arr1));
		//2차원 배열 비교(arr,arr1)
		System.out.println("2차원 배열 비교 : " + Arrays.deepEquals(arr2D, arr2D1));
	
		//배열의 정렬은 Arrays.sort(배열명);
		int[] arr2 = {5,3,15,6,9,8};
		Arrays.sort(arr2); //sort()메서드는 리턴값이 없고 자기 자신을 정렬
		System.out.println("정렬 : " + Arrays.toString(arr2));
		
		//배열의 복사
		//copyOf는 지정된 숫자 만큼을
		//copyOfRange()는 배열의 구간을 지정하여 복사한 다른 배열을 만듬
		//모두 복사하여 새로운 배열을 반환
		int[] arr3 = {5,6,7,8,9};
		int[] arr4 = Arrays.copyOf(arr3, 3); //새로운 배열을 생성
		System.out.println("arr4 : " + Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOf(arr3, 10);
		//복사하는 배열의 원소개수 보다 많을시 나머지는 기본값으로 채움
		System.out.println("arr5 : " + Arrays.toString(arr5));
		
		int[] arr6 = Arrays.copyOfRange(arr3, 1, 4);
		//1은 시작 색인번호 4는 종료 색인번호(범위는 그 앞까지)
		System.out.println("arr6 : " + Arrays.toString(arr6));
		
		//System.arraycopy()를 사용해 복사
		int[] scopyArr = {1,2,3,4,5};
		int[] scopyArr1 = new int[10];
		System.arraycopy(scopyArr, 0, scopyArr1, 0, 5);
		//scopyArr는 복사배열, 0은 복사배열의 시작 색인번호, scopyArr1은 복사본 배열, 0은 시작
		//색인번호, 5는 원소개수
		System.out.println("System.arraycopy()를 사용한 복사 : " + Arrays.toString(scopyArr1));
	}
}
