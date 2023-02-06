package com.kook.ch14Project;

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
		System.out.println(all.test(150));
	}
}