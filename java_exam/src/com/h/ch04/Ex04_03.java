package com.h.ch04;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {
		System.out.print("숫자를 하나 입력하라.>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); //nextInt()는 입력값을 숫자로 반환
		//화면을 통해 입력받은 숫자를 input에 저장
		//입력하고 Enter를 칠때까지 대기하다가 Enter치면 input변수에 입력값 대입
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}else { //input!=0인 경우
			//else는 if의 조건이 아닌 모든 다른 조건이므로 조건식을 사용하는 ()가 없음
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
	}
}