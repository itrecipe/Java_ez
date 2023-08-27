package com.h.ch04;

import java.util.Scanner;

public class Ex04_14 {

	public static void main(String[] args) {
		int num = 0 , sum = 0;
		System.out.printf("숫자 입력 (예:12345).>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //nextLine()은 문자열 반환
		num = Integer.parseInt(tmp); 
		//Integer.parseInt(변수명) -> 문자열을 정수로 변환하는 메서드
		
		while(num!=0) {
			//num을 10으로 나눈 나머지를 sum에 더함
			sum += num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			//num을 10으로 나눈 몫으로 변환하여 다음 자리수의 나머지값 구하기
			num /= 10; //num = num / 10;
		}
		System.out.println("각 자리수 합:" + sum);
	}
}