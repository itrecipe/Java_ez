package com.kook.ch14Project;

import java.util.*;
import java.util.stream.*;

//Stream의 reduce()최종연산자
public class Ex14_09 {

	public static void main(String[] args) {
		
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		
		Stream.of(strArr).forEach(System.out::println);
		//배열 strArr을 Stream객체로 만들어서 출력한다.
		
		boolean noEmptyStr =
				Stream.of(strArr).noneMatch(s -> s.length() == 0);
		//noneMatch()는 모든 요소가 조건에 맞지 않으면 true
		System.out.println("noEmptyStr : " + noEmptyStr);
		
		Optional<String> sWord = Stream.of(strArr)
				.filter(s->s.charAt(0)=='s') //첫번째 요소가 s인것을 골라내서
				.findFirst(); //그 중 첫번째인것을 찾으라는 의미
		
		//첫 글자가 s로 시작되는것만 선택한 후 그 중 첫번째 것만 반환
		System.out.println("sWord = " + sWord.get());
		
		//문자열 Stream을 mapToInt()로 기본형 Stream인 IntStream으로 변환한다.
		IntStream intStream1 = 
				Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = 
				Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = 
				Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = 
				Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b) -> a + 1);
		//reduce(초기값,
	}

}