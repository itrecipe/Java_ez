package com.kook.ch04Project;

import java.util.Scanner;

public class Ex04_18 {

	public static void main(String[] args) {
		//break,continue활용
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("메뉴 (1~3)를 선택 (종료:0)>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("프로그램 종료!");
				break; //반복문 while을 빠져나감
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택함. (종료 : 0)");
				continue; //다음 반복문 시작,for문에서 loop 도는 모습이랑 같다.
			}
			System.out.println("선택한 메뉴는 "+ menu + "번 이다.");
		}
		System.out.println("반복문 탈출!");
	}
}