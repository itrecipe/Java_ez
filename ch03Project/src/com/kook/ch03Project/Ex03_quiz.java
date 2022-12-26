package com.kook.ch03Project;

public class Ex03_quiz {

	public static void main(String[] args) {
		//3,5 : int x,y를 선언하고 초기값을 10,5 각각 초기화 한다
		int x = 10 , y = 5;
		
		//1. 10 * 5 결과 출력
		System.out.println("10 * 5 = " + x * y);
		
		//2. 10 / 5 결과 출력
		System.out.println("10 / 5 = " + x / y);
		
		//4. x값을 1 증가시켜 출력(증가 연산자 사용)
		y = ++x;
		System.out.println("x + 1 증가 값 : " + x);
		
		x = 10;
		y = 5;
		
		//6. x와 y가 같은지 비교하여 결과 출력
		System.out.println("x와 y가 같은지 비교 : " + (x==y));
	
		//7. x와 y가 다른지 비교하여 결과 출력
		System.out.println("x와 y가 다른지 비교 : " + (x!=y));
		
		//8. 문자열 str1을 선언하고 초기값 abcde
		String str1 = "abcde";
		String xyz = "xyz";
			
		//9. str1이 null인지 비교하고 결과 출력
		System.out.println("str1이 null인지 비교하라 : " + (str1==null));
	
		//10. str1이 xyz인지 비교하고 출력
		System.out.println("str1이 xyz인지 비교하라 : " + (str1==xyz));
	}
}

/*
1. 10 * 5 결과 출력 
2. 10 / 5 결과 출력
3. int x를 선언하고 초기값을 10으로 한다.
4. x값을 1 증가시켜 출력(증가 연산자 사용)
5. int y를 선언하고 초기값을 5로 한다.
6. x와 y가 같은지 비교하여 결과 출력
7. x와 y가 다른지 비교하여 결과 출력
8. 문자열 str1을 선언하고 초기값 abcde
9. str1이 null인지 비교하고 결과 출력
10. str1이 xyz인지 비교하고 출력
*/
