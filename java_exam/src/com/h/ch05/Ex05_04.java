package com.h.ch05;

import java.util.Arrays; //java.lang이 아닌것은 import 해줘야 함.

public class Ex05_04 {

	public static void main(String[] args) {
		//shuffle(뒤 섞기 -0번째와 임의로 얻어진 색인번호의 값을 교환)
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		//100회 셔플
		for(int i=0; i < 100; i++) {
			//0번 요소와 교환할 임의의 색인번호
			int n = (int)(Math.random() * 10);
			int tmp = numArr[0]; 
			//임시로 값을 저장할 공간 tmp , 0번 요소가 교환하면 사라지므로 임시로 tmp변수에 저장
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}
