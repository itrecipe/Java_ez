package com.h.programmers_exam;

import java.util.Scanner;

//덧셈식 출력하기
public class Solution6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a + b;
		
		System.out.println(a + " + " + b + " = " + c);
	}
}
