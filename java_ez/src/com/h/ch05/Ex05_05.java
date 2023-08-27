package com.h.ch05;

public class Ex05_05 {

	public static void main(String[] args) {
		//로또번호 1에서 45까지의 번호를 갖는 배열 선언(1,2,3...45)
		int[] ball = new int[45];
		
		//for문으로 배열 ball에 요소값 대입
		for(int i=0; i < ball.length; i++)
			ball[i] = i+1; //1부터 45를 넣어야 하므로 색인번호 + 1
			
		int tmp = 0; //교환시 임시로 교환할 값을 저장하는 변수
		int j = 0; //교환할 임의의 색인번호
		
		//색인번호 1번부터 5번까지 6개 원소를 임의로 만든 색인번호(j)의 요소값으로 교환
		for(int i=0; i < 6; i++) {
			j = (int)(Math.random() * 45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		//ball배열에서 앞의 6개만 출력
		for(int i=0; i < 6; i++)
		System.out.printf("ball[%d]=%d%n", i, ball[i]);	
		}
	}