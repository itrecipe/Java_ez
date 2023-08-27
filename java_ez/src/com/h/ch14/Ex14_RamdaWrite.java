package com.h.ch14;
//국쌤-(교재에 없는 예제-추가설명), java의정석 기초편 - 554p
public class Ex14_RamdaWrite {

	public static void main(String[] args) {
		
		/* - 람다식 작성예시
		 
		 - 제일 쉽고 많이 쓰는 방법
		(int a, int b) -> {
			return a > b ? a : b;
		}
		
		(int a, int b) -> a > b ? a : b 
		- return없이 사용시에는 문장이 아닌 수식이므로 ;이 없음
		  {}안의 문장이 하나일시에는 { }생략이 가능하다.
		  (단, return을 사용할시에는 생략이 불가능하다.)
		
		(a,b) -> a > b ? a : b
		- 파라미터의 데이터형은 생략가능(추론에선 데이터형 생략가능)
		
		- 가장 원칙적인 방법
		(String name, int i) -> {
			System.out.println(name + "=" + i);
		}
		
		(name, i) -> {
		System.out.println(name + "=" + i);
		}
		
		- 한 줄이므로 {}생략하고 ; 생략됨
		(name, i) -> 
		System.out.println(name + "=" + i);
		
		- 제일 쉬운 방법
		(int x) -> {
			return x * y;
		}
		
		(int x) -> x * x
		
		- 데이터형을 제거한 방법
		(x) -> x * x  
		- 파라미터 매개변수가 하나일경우 ()생략 가능, 
		(단, 데이터형이 없을시에는 불가능 int x -> 는 에러)
		
		- return이 들어가면 꼭 ; 해줘야함, return사용시에는 한줄이라도 {}사용
		() -> {return (int)(Math.random() * 6);}
		
		- 한줄이므로 return문 없으므로 {}생략 및 ;도 생략 
		() -> (int)(Math.random() * 6)
		
		(int[] arr) -> {
			int sum = 0;
			for(int i : arr)
				sum += i;
			return sum;
		}
		
		*/
	}
	
	int max(int a, int b) {
		return a > b ? a : b;
	}
	
	void printVar(String name, int i) {
		System.out.println(name + "=" + i);
	}
	
	int square(int x) {
		return x * x;
	}
	
	int roll() {
		return (int)(Math.random() * 6); 
				
	}
	
	int sumArr(int[] arr) {
		int sum = 0;
		for(int i : arr)
			sum += i;
		return sum;
	}
}