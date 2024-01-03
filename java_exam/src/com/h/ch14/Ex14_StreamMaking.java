package com.h.ch14;
//국쌤예제(추가설명, 교재에 없는 예제)

import java.util.*;
import java.util.stream.*;

public class Ex14_StreamMaking {

	public static void main(String[] args) {
		/* - Collection인터페이스에는 stream()메서드가 존재하므로 Collection의 하위 
		     클래스인 List, Set등은 구현된 stream() 메서드를 가진다.
		   - Stream<E> stream(); , stream()메서드는 Stream객체를 반환
		*/
		
		// List로 작성된 객체를 stream객체로 반환
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();
		/* - 스트림 객체를 이용해 스트림의 메서드를 공유
		   - forEach는 list로 만든 stream의 데이터를 내부 반복을 통해서 람다식으로 처리
		*/
		intStream.forEach(System.out::println);
		
		/* - 가변 인자를 사용하여 Stream만들기
		   - Stream의 static메서드 of사용
		*/
		Stream<String> strStream1 = Stream.of("a", "b", "c", "d");
		//strStream2는 인자(파라미터)로 배열을 직접 넣어줌
		Stream<String> strStream2 = Stream.of(new String[]{"a", "b", "c"});
		//strStream3는 static메서드 arrays에 stream메서드를 사용한다.
		Stream<String> strStream3 = Arrays.stream(new String[]{"a", "b", "c"});
		
		Stream<String> strStream4 = 
				Arrays.stream(new String[]{"a", "b", "c"},0,3);
		//0은 색인번호 0이며, end색인번호는 3~1까지 선택
		
		//기본형 Stream만들기
		IntStream intStream1 = IntStream.of(1, 2, 3);
		IntStream intStream2 = IntStream.of(new int[]{1, 2, 3});
		IntStream intStream3 = Arrays.stream(new int[]{1, 2, 3});
		IntStream intStream4 = 
				Arrays.stream(new int[]{1, 2, 3},0,3);
		
		intStream4.forEach(System.out::println); //출력해보기
		
		//Random클래스를 이용해 임의의 기본형 스트림 만들기
		IntStream intStream5 = new Random().ints();
		/* - ints() 무한개의 정수는 갖는 IntStream을 만듬
		   - Random클래스는 java.util
		*/
		intStream5.limit(5).forEach(System.out::println);
		
		DoubleStream doubleStream1 = new Random().doubles(5);
		doubleStream1.limit(5).forEach(System.out::println);
		
		IntStream intStream6 = IntStream.range(1, 5);
		//1, 2, 3, 4의 값을 갖는 IntStream반환
		intStream6.forEach(System.out::println);
		
		IntStream intStream7 = IntStream.rangeClosed(1, 5);
		//1, 2, 3, 4, 5의 값을 갖는 IntStream반환
		intStream7.forEach(System.out::println);

		IntStream intStream8 = new Random().ints(1, 5);
		//Random의 ints()를 사용하는것도 가능하다. (이때는 5는 포함하지 않는 무한 stream을 생성한다.)
		intStream8.limit(4).forEach(System.out::println);
		
		//iterate()와 generate()는 static이며 무한반복을 Stream객체 생성
		Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2);
		//무한 Stream이 생기며, seed값을 이용하고 리턴값이 다음값의 seed가 된다. 
		evenStream.limit(10).forEach(System.out::println);
	
		Stream<Double> geStream = Stream.generate(Math::random);
		geStream.limit(5).forEach(System.out::println);
		
		//비어있는 Stream객체를 만들어 사용하는 것을 null을 사용하는것보다 권고한다.
		Stream emptyStream = Stream.empty();
		long count = emptyStream.count();
		System.out.println("count : " + count);
		
	
	}
}