package com.kook.ch14Project;

import java.util.Arrays;
import java.util.stream.Stream;

/* - flatMap()메서드 사용
   - Stream의 데이터요소가 배열요소 String[]처럼 배열 요소일때 간단히 
     문자열 데이터 요소로 변환한다.
*/
public class Ex14_07 {
	Stream<String[]> strArrStrm = Stream.of(
			new String[] {"abc", "def", "jkl"},
			new String[] {"ABC", "GHI", "JKL"}
					);
	/* - Stream의 데이터 구성요소가 String[] 이다.
	   - 이때는 map()메서드 대신 flatMap()을 사용해야 Stream<String>이 된다.
	   - map을 사용하면 Stream<Stream<String>>이 된다. 
	*/
	
	Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
	
}
