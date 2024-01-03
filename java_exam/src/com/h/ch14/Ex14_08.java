package com.h.ch14;
import java.util.*;

/* - Optional클래스 사용
   - Optional<T>는 래퍼 클래스로 모든 객체를 감싼다.(모든객체를 수용 가능하다는 의미)
   - Optional을 사용하면 null처리시 if문 없이 Optional의 메서드로 간단히 처리
   - Stream처럼 동작
*/
public class Ex14_08 {

	public static void main(String[] args) {
		Optional<String> optStr = Optional.of("abcde");
		Optional<Integer> optInt = optStr.map(String::length);
		
		//Optional의 저장된 값은 get()으로 구하나 null체크를 해주지는 않는다.
		System.out.println("optStr = " + optStr.get());
		System.out.println("optInt = " + optInt.get());
		
		Optional<String> optStr1 = null;
		/* - System.out.println("optStr1 = " + optStr1.get());
		   - optstr1이 null이므로 get() 사용시 예외가 발생한다.
		*/
		
		int result1 = Optional.of("123")
				.filter(x -> x.length() > 0)
				.map(Integer::parseInt)
				.get();
		System.out.println("result = " + result1);
		
		OptionalInt optInt1 = OptionalInt.of(0);
		// 정수형 Optional객체인 OptionalInt에 0을 저장
		OptionalInt optInt2 = OptionalInt.empty();
		// 빈 객체를 생성, 값을 getAsInt()로 반환 시 예외가 발생한다.
		System.out.println(optInt1.getAsInt()); //0
		// OptionalInt에서는 get()대신 getAsInt()
		/* - System.out.println(optInt2.getAsInt());
		   - optInt2는 empty로 null이므로 NoSuchElementException 예외 발생
		*/
		
		System.out.println("optInt1 = " + optInt1);
		System.out.println("optInt2 = " + optInt2);
		
		System.out.println("optInt1.equals(optInt2)? "
				+ optInt1.equals(optInt2));
		
	}
}