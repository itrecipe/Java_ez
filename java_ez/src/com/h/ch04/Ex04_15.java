package com.h.ch04;

import java.util.Scanner;

public class Ex04_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력.>");
			input = scanner.nextInt(); //입력처리
			
		if(input > answer) {
			System.out.println("더 작은 수로 다시시도");
			
		} else if(input < answer) {
			System.out.println("더 큰 수로 다시시도");
		}
	} while(input!=answer); // ; ->문장뒤에 세미콜론 필수!
		System.out.println("정답!");
	}
}
