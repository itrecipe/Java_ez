package com.h.ch04;

public class Ex04_19 {

	public static void main(String[] args) {
		
		Loop1 : for(int i=2; i<=9; i++) { //Loop1은 라벨을 의미
			for(int j=1; j<=9; j++) {
				if(j==5)
					//라벨 Loop1의 for문을 나감,즉 j가 4까지만 반복하고 2단 4번째줄에서 종료 구구단 종료
					break Loop1;
					
					//break;
					//continue Loop1; //4까지만 곱하고 다음 반복으로 이동하여 9단까지 처리
					//continue;
					System.out.println(i + "*" + j +"="+ i*j);
			}
			System.out.println();
		}
	}
}