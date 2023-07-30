package com.kook.ch14Project;

import java.util.*;
import java.util.stream.*;

//국쌤예제(교재에 없음, 추가설명) 교재-568p
public class Ex14_IntroStream { //IntroStream : 스트림을 소개한다는 의미

	public static void main(String[] args) {
		//배열이나 Collection의 데이터들을 쉽게 처리하기 위해 Stream을 사용
		String[] strArr = {"aaa", "ddd", "ccc"};
		List<String> strList = Arrays.asList(strArr);
		/* - Stream 객체로 변환
		   - Collection에는 stream으로 변환해주는 stream()을 거친다.
		*/
		Stream<String> strStream1 = strList.stream();
		//Interface Stream<T>
		
		//배열을 Stream으로 변환시 Arrays의 static메서드인 stream(배열)을 사용한다.
		Stream<String> strStream2 = Arrays.stream(strArr); //stream으로 바뀐다.
		
		//Stream에서 제공하는 메서드를 이용
		strStream1.sorted().forEach(System.out::println);
		strStream2.sorted().forEach(System.out::println);
	}

}