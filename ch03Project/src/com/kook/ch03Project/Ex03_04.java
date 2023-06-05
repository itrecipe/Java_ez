package com.kook.ch03Project;

public class Ex03_04 {

	public static void main(String[] args) {
		
		int i = -10;
		i = +i; //+연산은 1을 곱하는 연산
		System.out.println(i);
		
		i = -10;
		i = -i; // -부호 연산은 -1을 곱하는 연산
		System.out.println(i);
		
		//내가 만든 예시
		i = +10; // +부호 연산은 아무 의미 없는 연산 그냥 이런것도 있다는 정도만 알아둘것.
		i = +i;
		System.out.println(i);
	}

}
