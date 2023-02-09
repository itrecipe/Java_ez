package com.kook.ch14Project;
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

	}

}
