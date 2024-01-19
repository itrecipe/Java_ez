package com.h.programmers_exam;

import java.util.Scanner;

//홀짝 구분하기
public class Solution9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + " " + "is even");
		} else {
			System.out.println(n + " " + "is odd");
		}
		
		
	}

}
