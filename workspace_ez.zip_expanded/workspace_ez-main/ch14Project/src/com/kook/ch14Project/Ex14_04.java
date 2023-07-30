package com.kook.ch14Project;

import java.util.*;

public class Ex14_04 {

	public static void main(String[] args) {
		//Collection 프레임워크가 갖는 함수형 인터페이스 사용 메서드 예제
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		/* - list의 모든 요소를 출력하는 메서드는 ArrayList에 있는 forEach사용
		   - void forEach(Consumer<E> action)
		   - forEach의 파라미터는 Consumer 함수형 인터페이스 객체 사용
		*/
		list.forEach(i -> System.out.print(i + ","));
		/* - forEach의 파라미터로 람다식을 바로 사용, forEach는 자동으로 원소값을 반복처리 한다.
		   - i는 list객체의 원소값을 나타낸다.
		*/
		System.out.println();
		
		/* - boolean removeIf(Predicate<E> filter)는 함수형 인터페이스, (boolean을 반환)
		   - Predicate 객체를 파라미터로 사용
		   - 컬렉션 list의 모든 요소를 반복해서 처리
		*/
		list.removeIf(x -> x%2==0 || x%3==0);
		//list의 요소가 2나 3의 배수이면, true일때 해당 요소를 제거한다.
		System.out.println(list);
		
		list.replaceAll(i -> i * 10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		//Map<K, V>
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		/* - Map의 void forEach(BiConsumer<K, V> action)
		   - 즉, 파라미터를 2개로 받고 처리는 반환없이 처리한다, 메서드는 void accept(K, V)
		*/
		map.forEach((k, v)-> System.out.print("{" + k + "," + v + "}"));
		/* - map의 forEach에는 BiConsumer를 구현하는 람다식을 사용
		   - map의 요소들을 반복하여 처리한다.
		*/
		System.out.println();
	}
	
}