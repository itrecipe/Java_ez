package com.kook.ch14Project;
//국쌤(교재에 없는 예제-추가설명), 자바의정석(기초)-556p

/* - 람다식을 사용하려면 @FunctionalInterface의 추상메서드에 매핑하는
     람다식을 인터페이스 객체에 대입하여 사용
   
   - 람다식 사용할시에는 람다식으로 구현한 추상메서드를 호출해야한다.
*/
public class Ex14_fuctional {

	public static void main(String[] args) {
		//익명의 객체를 생성하여 사용할시(기존의 자바 (구)방식)
		MyFunction f = new MyFunction() {
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
	};
	
	int res = f.max(5, 10);
	System.out.println("res : " + res);
	
	System.out.println("람다식 사용");
	
	//익명의 객체를 만드는 대신 해당 인터페이스의 추상메서드를 람다식으로 구현하여 대입
	MyFunction f1 = (a,b) -> a > b ? a : b;
	
	int res1 = f1.max(11, 6);
	System.out.println("res1 : " + res1);

	}
}	

@FunctionalInterface
interface MyFunction {
	/*public abstarct (생략됨)*/ int max(int a, int b);
}
