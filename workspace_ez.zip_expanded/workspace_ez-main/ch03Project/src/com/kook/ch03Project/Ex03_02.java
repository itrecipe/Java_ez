package com.kook.ch03Project;

public class Ex03_02 {

	public static void main(String[] args) {
		int i=5 , j=0;
		
		j = i++; //후위증가 연산자 : 선처리 후 증가
		System.out.println("j = i++; 실행 후, i=" + i +", j=" + j);
		
		i=5; //결과 비교를 위해 i와 j값을 다시 5와 0으로 초기화
		j=0;
		
		j = ++i; //전위증가 연산자 : 선증가 후 처리
		System.out.println("j = ++i; 실행 후, i=" + i + ", j=" + j);

	}
}
