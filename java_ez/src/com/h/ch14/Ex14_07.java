package com.h.ch14;

import java.util.*;
import java.util.stream.*;

/* - flatMap()메서드 사용
   - Stream의 데이터요소가 배열요소 String[]처럼 배열 요소일때 간단히 
     문자열 데이터 요소로 변환한다.
*/
public class Ex14_07 {
	public static void main(String[] args) {
	Stream<String[]> strArrStrm = Stream.of(
			new String[] {"abc", "def", "jkl"},
			new String[] {"ABC", "GHI", "JKL"}
			);
	/* - Stream의 데이터 구성요소가 String[] 이다.
	   - 이때는 map()메서드 대신 flatMap()을 사용해야 Stream<String>이 된다.
	   - map을 사용하면 Stream<Stream<String>>이 된다. 
	*/
	
	Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
	//Stream<Stream<String> strStrmStrm = strArrStrm.map(Arrays::stream);
	
	strStrm.map(String::toLowerCase) //소문자로 변환
	.distinct() //중복 제거
	.sorted() //정렬(오름차순)
	.forEach(System.out::println); //최종연산 반복처리
	
	String[] lineArr = {
		"Believe or not It is true",	
		"Do or do not is no try"
	};
	System.out.println("+++++++++++++");
	//lineArr배열을 Stream으로 변환
	Stream<String> lineStream = Arrays.stream(lineArr);
	lineStream.flatMap(line -> Stream.of(line.split(" +")))
	/* - 배열의 문자열을 받아서 구분자를 이용해 배열로 반환한다.
	   - 구분자가 " +"인데 +는 정규식에서 사용하는 하나 이상의 문자를 나타낸다.
	   - 즉, 공백이 하나 이상이다.
	   - 배열의 1행과 2열이 String[]로 변환
	*/
	.map(String::toLowerCase)
	.distinct()
	.sorted()
	.forEach(System.out::println);
	
	}
}