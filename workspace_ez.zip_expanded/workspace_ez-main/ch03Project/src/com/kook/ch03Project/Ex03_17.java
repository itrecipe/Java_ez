package com.kook.ch03Project;

public class Ex03_17 {

	public static void main(String[] args) {
		//자바의정석 예제
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY , signZ;
	
		//변수 초기화
		x = 10;
		y = -5;
		z = 0;
		
		//삼항연산자는 조건 연산자라 하기도 하고
		//조건식 ? true 일시 값 : false일시 값;
		
		absX = x >= 0 ? x : -x;	//절대값 구하기
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		//삼항연산자는 내부에 삼항연산자를 사용할 수 있다(중첩 사용)
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-'); //조건 연산자를 중첩
		//부호 구하기로 0보다 크면 +, 두번째를 다시한번 삼항 연산자를 이용하여 
		//0일시와 음수일시로 분리
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-'); 
		
		System.out.printf("x=%c%d%n", signX , absX);
		System.out.printf("y=%c%d%n", signY , absY);
		System.out.printf("z=%c%d%n", signZ , absZ);
		
		//삼항연산자는 if ~ else문보다 간략하여 많이 사용함.
		
		//국쌤 수업 예제
		if(x >= 0) {
			absX = x;
		}
		else {
			absX = -x;
		}
		//absX = x >= 0 ? x : -x; ->해당 코드와 현재 코드가 동일함.
	}
}