package com.kook.ch05Project;

import java.util.Scanner;

public class Ex05_10 {

	public static void main(String[] args) {
		//String 2차원 배열
		String[][] words = {
				//3행 * 2열 , words[3][2] 
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		}; //문장이라 꼭 ;으로 구문을 닫아 줘야함.
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			//영어를 문제로 내고 맞추기
			System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);
			String tmp = scanner.nextLine(); //영어문제에 대한 답을 입력 : ex) "의자"
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답! %n%n");
			} else {
				System.out.printf("틀렸슈 정답은 %s 입니다. %n%n", words[i][1]);
			}
		}	
		System.out.println("for문 탈출");
	}
}