package com.h.ch14;

import java.util.function.*;

//Predicate객체를 결합하여 사용하는 메서드
public class Ex14_03 {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i < 100; //i < 100이면 true
		Predicate<Integer> q = i -> i < 100; //i < 200이면 true
		Predicate<Integer> r = i -> i%2 == 0; //i가 짝수면 true
		
		Predicate<Integer> notP = p.negate(); //i >= 100 , !연산
		Predicate<Integer> all = notP.and(q.or(r));
		/* - q객체와 r객체를 ||연산한뒤 notP객체와 &&연산 수행
		   - (i >= 100) && (i < 200 || i%2==0)
		   - 연산의 결과는 test()로 얻어낸다.
		*/
		System.out.println("all.test() : " + all.test(150));
		
		String str1 = "abc";
		String str2 = "abc";
		
		/* - str1과 str2가 같은지 비교한 결과를 반환
		   - 동등비교할 목적의 Predaicate객체를 만들시 
		   - Predicate인터페스의 static메서드인 isEqual(비교할객체)사용
		*/
		Predicate<String> p2 = Predicate.isEqual(str1);
		//문자열 str1을 다른 문자열과 동등비교를 위해 사용할 객체 p2생성
		boolean result = p2.test(str2); //p2객체가 가진 str1을 str2와 동등비교
		
		System.out.println("result : " + result);
	}
}