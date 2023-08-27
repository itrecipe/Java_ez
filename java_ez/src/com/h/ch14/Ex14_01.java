package com.h.ch14;

public class Ex14_01 {

	public static void main(String[] args) {
		
		//MyFunction 인터페이스 객체는 람다식으로 추상메서드를 구현하여 대입
		MyFunction01 f1 = () -> {
			System.out.println("f1.run()");
		};
		
		/*
		  - 단축형 (아래코드처럼 한줄로도 작성가능하다.)
		  MyFunction f1 = () -> System.out.println("f1.run()");
		*/
		
		//예전처럼 익명의 객체 사용
		MyFunction01 f2 = new MyFunction01() {
			@Override
			public void run() {
				System.out.println("f2.run()");
				
			}
		};
		
		MyFunction01 f3 = getMyFunction();
		
		//실제 사용시는 람다식으로 구현된 추상메서드를 호출하여 사용
		f1.run();
		f2.run();
		f3.run();
		
		//파라미터로 람다식을 사용하는 함수형 인터페이스 객체 사용
		execute(f1);
		execute(() -> System.out.println("run()"));
	}	
		static MyFunction01 getMyFunction() {
			//반환할 MyFunction객체를 람다식을 이용해 만들어서 반환
			MyFunction01 f = ()-> System.out.println("f3.run()");
			return f;
			//간단히 return()-> System.out.println("f3.run()");
		}
		
		//파라미터로 람다식을 사용하는 함수형 인터페이스 객체 사용 메서드
		static void execute(MyFunction01 f) {
			f.run();
		}
		
	}


/* - 람다식을 사용하려면 람다식을 구현할 추상메서드가 있는 함수형 인터페이스를 만듬
   - 함수형 인터페이스는 추상메서드가 하나만 있는 인터페이스
*/
@FunctionalInterface
interface MyFunction01 {
	//함수형 인터페이스이므로 추상메서드 하나만 존재
	/*public abstract : 생략해도 되며, 추상이므로 헤드만 있다.*/ void run();
}