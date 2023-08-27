package com.h.ch03;

public class Ex03_quiz {

	public static void main(String[] args) {
		//1~10번 문제는 내가 직접 푼것들
		
		//3,5 : int x,y를 선언하고 초기값을 10,5 각각 초기화 한다
		int x = 10 , y = 5;
		
		//1. 10 * 5 결과 출력
		System.out.println("10 * 5 = " + x * y);
		
		//2. 10 / 5 결과 출력
		System.out.println("10 / 5 = " + x / y);
		
		//4. x값을 1 증가시켜 출력(증가 연산자 사용)
		x = ++x;
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
		System.out.println("str1이 null인지 비교 : " + (str1==null)); 
		//문자열 비교시 == 사용가능
	
		//10. str1이 xyz인지 비교하고 출력
		System.out.println("str1이 xyz인지 비교 : " + (str1==xyz));
		//문자열 리터럴(값) 비교시 == 사용가능
		
		//국쌤 퀴즈 수업설명
		System.out.println("str1 값 출력 : " + str1.equals("xyz")); //값을 줄땐 equals를 사용하는것이 좋음
		
		String str2 = new String("abcde"); //str1과 str2는 값은 같은데 주소가 다름
		//참조변수인 String의 변수 값에는 주소가 저장됨
		System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2)); //참조형 비교시 ==은 주소 비교로 false
		System.out.println("str1과 str2가 같은지 equals메서드로 비교 : " + str1.equals(str2)); //값을 비교하므로 true
		
		String str3 = "abcde";
		System.out.println("str1과 str3가 같은지 비교 : "+ (str1 == str3));
		//리터럴로 만든 String객체는 값이 같으면 주소가 같음
		//대소문자 무시하고 동등 비교는 equalsIgnoreCase(str)
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