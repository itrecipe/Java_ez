package com.h.ch14;
//국쌤예제(교재에 없는 예제), 교재:566~567p 내용참조
import java.util.function.*;

/* - 람다식의 블록(구현부)이(가) 하나의 메서드만 사용할때는 메서드참조로 간단하게 람다식을 생성한다.
   - 생성자 사용시에도 유사하게 사용한다.
*/
public class Ex14_RefMethod {

	public static void main(String[] args) {
		
		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		//Function함수형 인터페이스의 추상메서드는 R apply(T t);을 구현하는 람다식을 사용
		Function<String, Integer> f1 = Integer::parseInt;
		/* - 블록이 하나인 메서드만 사용하므로 메서드 참조식으로 사용, 파라미터-> 가 필요 없으며,
		  	 메서드 호출도 static메서드일시 "클래스명::메서드명" 형태로 간단하게 사용가능하다.
		   - 인스턴스형 메서드를 한번만 호출할때도 "클래스명::메서드명" 으로 호출
		     (인스턴스 객체를 전달 받아서 처리한다.)
		*/
		
		BiFunction<Object, String, String> bf = (Object obj, String s) ->
			obj.toString();
		
		/* - BiFunction<Object, String, Integer> bf1 = Object::toString(); //이건 사용 안되는 코드 이런게 있는것만 알아두자(국쌤)
		   - 외부 객체의 메서드 호출시에는 "외부객체명::인스턴스메서드명;" (알아두기!)
		 */

//		//외부 객체 이용
//		Consumer<String> c = s -> System.out.println(s);
//		Consumer<String> c1 = System.out::println;
		
		
		//블록 부분이 new 생성자일때도 메서드 참조를 이용가능하다.
		Supplier<String> sf = () -> new String("abc");
		Supplier<String> sf1 = String::new;
		/* - Supplier는 추상메서드가 T get(); 
		   - 메서드 참조로 생성자 활용시에는 "클래스명::new;" 형태로 사용한다.
		*/	
	}
}