package com.h.ch04;

import java.util.Scanner;

public class Ex04_06 {

	public static void main(String[] args) {
		System.out.print("현재 월을 입력.>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month){ //switch의 조건식으로 month값을 사용
			case 3:
			case 4:
			case 5:
				System.out.println("현재 계절은 봄 입니다.");
			break; //break문 만나면 switch문 종료
			
			case 6: case 7: case 8: //이런식으로 한줄에 작성도 가능, 기타는 default문으로 처리
				System.out.println("현재 계절은 여름 입니다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을 입니다.");
				break;
			default:
				System.out.println("현재 계절은 겨울 입니다.");
			//1,2,12(월) => 겨울
		}
	}
}