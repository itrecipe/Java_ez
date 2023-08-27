package com.h.ch14;

import java.util.*;
import java.util.stream.*;

//Stream?�� reduce()최종?��?��?��
public class Ex14_09 {

	public static void main(String[] args) {
		
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		
		Stream.of(strArr).forEach(System.out::println);
		//배열 strArr?�� Stream객체�? 만들?��?�� 출력?��?��.
		
		boolean noEmptyStr =
				Stream.of(strArr).noneMatch(s -> s.length() == 0);
		//noneMatch()?�� 모든 ?��?���? 조건?�� 맞�? ?��?���? true
		System.out.println("noEmptyStr : " + noEmptyStr);
		
		Optional<String> sWord = Stream.of(strArr)
				.filter(s->s.charAt(0)=='s') //첫번�? ?��?���? s?��것을 골라?��?��
				.findFirst(); //�? �? 첫번째인것을 찾으?��?�� ?���?
		
		//�? �??���? s�? ?��?��?��?��것만 ?��?��?�� ?�� �? �? 첫번�? 것만 반환
		System.out.println("sWord = " + sWord.get());
		
		//문자?�� Stream?�� mapToInt()�? 기본?�� Stream?�� IntStream?���? �??��?��?��.
		IntStream intStream1 = 
				Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = 
				Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = 
				Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = 
				Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b) -> a + 1); //count() ?��?�� ?��?��
		/* - reduce(초기�?, BinaryOpperator객체)메서?��?�� 초기값을 
		   - BinaryOpperator객체?�� ?��개의 ?��?��미터�? 첫번�? ?��?��미터�? ?��?��?��?��.
		     ?��?��?��?�� 리턴값을 초기값으�? ?��?�� 반복?�� ?��?��.
		*/
		int sum = intStream2.reduce(0, (a,b) -> a + b); //sum() ?��?�� ?��?��
		
		OptionalInt max = intStream3.reduce(Integer::max);
		//�? ?��?��?�� 문자?�� �? �??�� �? 문자?��?�� 문자?�� 
		OptionalInt min = intStream4.reduce(Integer::min);
		//�? ?��?��?�� 문자?�� �? �??�� ?��?? 문자?��?�� 문자?�� 
		
		System.out.println("count = " + count);
		System.out.println("sum = "  + sum);
		System.out.println("max = " + max.getAsInt());
		//OptionalInt객체 ?��?��?�� get()?�� ?��?�� getAsInt()�? ?��?��?��?��
		System.out.println("min = " + min.getAsInt());
				
	}
}
