package com.kook.ch04Project;

import java.util.Scanner;

public class Ex04_04 {

	public static void main(String[] args) {
		int score = 0; //점수
		char grade = ' '; //학점등급
		
		System.out.print("점수를 입력하라.>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		}else if (score >= 80) {
			grade = 'B';
		}else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("학점은? "+ grade + "입니다.");
	}
}
