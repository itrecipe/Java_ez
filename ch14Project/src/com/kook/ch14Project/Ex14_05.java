package com.kook.ch14Project;
import java.util.*;
import java.util.stream.*;

//Student를 데이터요소로 사용하는 Stream객체를 정렬
public class Ex14_05 {

	public static void main(String[] args) {
		
		Stream<Student> studentStream = Stream.of(
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200),
				new Student("안자바", 2, 100),
				new Student("박자바", 2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("김자바", 3, 180)
				);
		/* Comparator의 메서드를 이용하여 특정값을 비교하여 정렬할때는 Comparable 인터페이스를
		   구현한 클래스에 대해서는 파라미터가 하나인 comparing()을 사용한다.
		*/
		studentStream.sorted(Comparator.comparing(Student::getBan)
				.thenComparing(Comparator.naturalOrder()))
				.forEach(System.out::println);
		/* - Comparing()은 특정값을 이용한 올림차순
		   - Comparator.naturalOrder()는 Comparable에서 구현한 Student에서 정의한
		     compareTo()에서 정의한 내림차순 정렬 방식을 사용한다.
		*/
	}
}