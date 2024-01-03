package com.h.test;

public class GuGuDan2 {

	public static void main(String[] args) {
		
		//정수 n을 입력 받아서 구구단을 출력하라
		
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		*/
		
		System.out.println("구구단 출력!");

		for(int i=2; i<10; i++) {
			System.out.println();
			for(int j=1; j<10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
		System.out.println("");
		System.out.println("시스템을 종료 합니다.");
	}
}