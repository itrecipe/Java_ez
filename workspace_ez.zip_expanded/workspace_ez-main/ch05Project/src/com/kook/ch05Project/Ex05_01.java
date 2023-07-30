package com.kook.ch05Project;

import java.util.Arrays;

public class Ex05_01 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10]; //메모리 확보 및 int 기본값인 0으로 요소가 채워짐
		//String str = new String("abc");
		//다른 참조변수의 new 사용법과 형태가 다른점을 주시
		
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70, 60};
		//선언시 배열의 값(리터럴)로 초기화
		//배열값을 표시하는 방법은 {}안에 ,로 구분된 값을 넣어줌
		//리터럴 값으로 초기화 할시에는 선언시에 바로 해줘야 함.
		
		//만약, 선언과 초기화 따로 진행할 경우 에러 발생(아래 여러줄 주석처리 된 예시코드 참조)
		/* 에러 발생 예시 코드
		 int[] iArr4;
		 iArr4 = {100,95,80,70,60};
		 이렇게 할 경우 에러가 발생함.
		*/
		
		char[] chArr = {'a', 'b', 'c', 'd'};
		//for문을 이용해 배열의 각 요소값 출력
		for (int i=0; i < iArr1.length; i++) {
			iArr1[i] = i + 1; //각각의 요소에 i + 1을 대입
		}
		for (int i=0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1;
			//1부터 10까지의 임의의 수를 요소에 대입
		}
		//for문을 이용해 대입된 요소값을 print문으로 출력
		for(int i=0; i < iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println(); //줄 변경처리를 위해 사용
				
		//Arrays 클래스의 toString() 메서드를 이용하여 배열 값 출력
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		//배열변수로 바로 출력
		System.out.println(iArr3); //번지값 -> [I@156643d4
		System.out.println(chArr); //문자열 형태로 출력 -> abcd
		//ch배열을 바로 print하면 , 없는 문자열 형태로 출력(print에서 처리)
	}
}