package com.kook.ch04Project;

import java.util.Scanner;

public class Ex04_05 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수 입력.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); 
		//Scanner 클래스에 있는 메서드 next.Int() 키보드 입력 값을 정수로 반환
		
		System.out.printf("당신 점수는? %d입니다.%n", score);
		
		if(score >= 90) {
			grade = 'A';
			//90점 이상일시만 처리되는 내부 if문으로 중첩 if문이라 함
			//내부 if문 단독, if~else if 또는 if~else if ~else로 중첩하여 사용도 가능
			
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		}else if(score >= 80) {
			grade = 'B';
		if (score >= 88) {
			opt = '+';
		} else if (score < 84) {
			opt = '-';
		}
	} else {
		grade = 'C';
	}
	System.out.printf("당신의 학점은? %c%c입니다.%n",grade ,opt);
}
}
