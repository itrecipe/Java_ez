package com.h.test;

import java.util.*;

public class ProgramControlClass {

	public static void main(String[] args) {
		System.out.println("현재 월을 입력하세요.>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("현재 계절은 봄 이다.");
			break;
			
			case 6: case 7: case 8:
				System.out.println("현재 계절은 여름 이다.");
				break;
			case 9: case 10: case 11:
				System.out.println("현재 계절은 가을 이다.");
				break;
			default:
				System.out.println("현재 계절은 겨울 이다.");
	
		}
	}
}