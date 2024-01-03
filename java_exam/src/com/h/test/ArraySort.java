package com.h.test;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		int array[] = {5, 4, 3, 2, 1}; //1차원 배열 선언
		
		Arrays.sort(array);
		
		for(int i : array) {
			System.out.println("결과 : " + i);
		}
		System.out.println("시스템 종료");
	}

 }
