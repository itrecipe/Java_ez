package com.h.ch14;
//교재엔 따로 없는 국쌤 추가설명 예제 -p.580

import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.plaf.synth.SynthStyleFactory;

//Stream의 중간연산메서드
public class Ex14_MiddStreamOP {

	public static void main(String[] args) {
		
		IntStream intStream = IntStream.rangeClosed(1, 10);
		//10을 포함하는 범위의 int형 Stream객체 생성 1,2,3,4,5,6,7,8,9,10까지 데이터요소
		intStream.skip(3).limit(5).forEach(System.out::println);
		/* - skip은 앞에서 3개를 생략하는 중간 연산을하여 IntStream을 반환한다.(3개가 생략된 스트림) 
		   - limit는 3개가 생략된 스트림에서 5개를 선택한 새로운 stream을 만든다.
		   - forEach는 최종연산으로 limit로 생성한 stream의 데이터요소를 반복 출력
		*/
		System.out.println();
		IntStream intStream01 = IntStream.of(1,2,2,3,3,3,4,5,5,6);
		intStream01.distinct().forEach(System.out::println);
		/* - distinct()는 중간연산으로 stream객체 데이터요소의 중복값을 1개로 처리하여
		     Stream으로 반환
		*/
		System.out.println();
		IntStream intStream02 = IntStream.range(1, 10);
		intStream02.filter(i -> i%2==0).forEach(System.out::println);
		/* - filter(Predicate형 파라미터)는 파라미터값이 false이면 데이터 요소를 제거한다.
		   - filter메서드도 stream의 데이터툴에 대해 반복 처리
		   - Stream<T> filter<Prodicate<? super T> predicate)
		   - 조건에 맞지 않는 요소를 제거한다.
		   - filter()는 파라미터가 Predicate형이므로 파라미터 1개를 받아 비교하고,
		   	 논리연산으로 true인것만 반환한다.
		*/
		intStream02 = IntStream.rangeClosed(1, 10);

		System.out.println();
		// 최종연산이 끝난 stream객체는 다시 사용할 수 없다.(다시 사용 하려면 다시 새로 생성해야함)
		intStream02.filter(i -> i%2!=0).filter(i->i%3!=0)
		.forEach(System.out::println);
		
		//sorted()중간처리 메서드
		System.out.println();
		Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc","b");
		strStream.sorted().forEach(System.out::println);
		/*
		  - sorted()는 Comparable을 사용하는 기본형 정렬
		  - (사전식 정렬, 대문자가 소문자보다 빠름)
		*/
		
		System.out.println();
		//앞에서 strStream이 forEach최종연산으로 소모됬으므로 다시 생성
		strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
		strStream.sorted(String.CASE_INSENSITIVE_ORDER)
		.forEach(System.out::println);
		/*
		  - 정렬시 Comaprable의 기본 정렬이 아니라,
		    정렬 조건을 주려면 sorted(Comparator c)형태로 바꾼다.
		  - String.CASE_INSENSITIVE_ORDER는 대소문자를 무시하고 정렬하는 조건(소문자로 변환처리)
		  - Comparator<String> CASE_INSENSITIVE_ORDER
		*/
		
		
	}
}
