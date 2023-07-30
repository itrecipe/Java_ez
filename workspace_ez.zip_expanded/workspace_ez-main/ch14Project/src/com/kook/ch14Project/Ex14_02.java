package com.kook.ch14Project;

import java.util.function.*;
import java.util.*;

public class Ex14_02 {

	public static void main(String[] args) {
		
		Supplier<Integer> s;
		/* - 함수형 인터페이스 Supplier<T>는 파라미터 없고 반환을 T형으로 하는 추상메서드
		     T get()를 갖는다.
		   - 함수형 인터페이스 객체는 추상메서드를 매핑하는 람다식으로 생성
		*/
		s = () -> (int)(Math.random() * 100) + 1; //99까지 돌기 때문에 +1해줌
		
		Consumer<Integer> c;
		/* - 함수형 인터페이스 Consumer는 파라미터가 1개이고 리턴값이 없는 추상메서드
		   - public abstract void accept(T t)를 갖고 있다.
		   - 함수형 인터페이스 객체는 추상메서드를 매핑하는 람다식으로 생성
		*/
		c = i -> System.out.println(i + ", ");
		Predicate<Integer> p;
		/* - 함수형 인터페이스 Predicate<T>는 파라미터 하나와 리턴은 boolean을 하는
		   - 추상메서드 boolean test(T t)를 갖는다.
		*/
		p = i -> i % 2 == 0;
		
		Function<Integer, Integer> f;
		/* 함수형 인터페이스 Function은 파라미터가 1개이고 리턴타입이 있는 추상메서드
		   R apply(T t)를 갖는다.
		*/
		f = i -> i / 10 * 10;
		
		List<Integer> list = new ArrayList<Integer>();
		makeRandomList(s, list);
		System.out.println(list);
		
		printEvenNum(p, c, list);
		
		List<Integer> newList = doSomething(f, list);
		
		System.out.println(newList);
		
	}
	
	//제네릭 클래스가 아닌 클래스의 메서드에서 제네릭 사용을 위해 제네릭 클래스로 정의
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i<10; i++) {
			//list객체에 람다식으로 구현한 get메서드를 호출하여 반환되는 값을 add
			System.out.println(s.get());
			list.add(s.get());
		}
	}
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.println("[");
		for(T i : list) {
			if(p.test(i)) {
				c.accept(i);				
			}
		}
		System.out.println("]");
	}
	
	//메서드를 사용하는 제네릭은 T를 제네릭 메서드의 T를 사용
	static <T> List<T> doSomething(Function<T, T> f, List<T> list){
		List<T> newList = new ArrayList<T>(list.size());
		for(T i : list) { 
			newList.add(f.apply(i));
		}
		return newList;
	}
}