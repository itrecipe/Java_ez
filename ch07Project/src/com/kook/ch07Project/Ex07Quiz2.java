package com.kook.ch07Project;

public class Ex07Quiz2 {

	public static void main(String[] args) {
		/* 1. Animal클래스는 리턴타입이 void이고 파라미터는 없으며 이름은 animalSound인 인스턴스 메서드를 갖는다.
	          메서드 내용은 The animal makes a sound를 출력 */
		Animal a = new Animal();
		a.animalSound();
	
		 /* 2. Animal을 상속한 Pig 클래스는 Animal의 메서드를 재정의하여 사용
	          재정의된 메서드 내용은 The pig says : wee wee을 출력 */
		Pig p = new Pig();
		p.animalSound();
		
		 /* 3. Animal을 상속한 Dog 클래스는 Animal의 메서드를 재정의하여 사용
		      재정의된 메서드 내용은 The dog says : bow wow를 출력 */
		 Dog d = new Dog();
		 d.animalSound();
		 
		 /* 4. main메서드에서 상위 클래스의 객체 myPig는 하위 클래스 Pig를 사용하고 메소드 실행 */
			Animal myPig = new Pig(); //다형성에 의거 하위 클래스를 상위클래스가 참조(부모클래스가 사용하고 있다는 의미)
			myPig.animalSound(); //상속한 하위 클래스
		 
		 // 5. 상위 클래스의 객체 myDog는 하위 클래스 Dog를 사용하고 메서드를 실행
			Animal myDog = new Dog();
			myDog.animalSound();
		  	
		 /* 6. OuterClass를 만들고 default형 인스턴스멤버변수 x를 정의하고 초기값 10을 줌
		  default형 인스턴스 내부 클래스 InnerClass를 만들고 default형 멤버변수 int y를 정의하고 초기값 5
		  클래스형 default 내부클래스 StaticInnerClass를 만들고 클래스형 멤버변수 z를 만들고 초기값 15;
		  main메서드에서 Outerclass클래스 객체 out을 만듬, 내부 클래스 InnerClass 객체를 만듬 */
		 OuterClass out = new OuterClass();
		 OuterClass.InnerClass inner = out.new InnerClass();
		 //다른 클래스에서 내부 클래스 참조변수 선언은 외부클래스명.내부클래스명 참조변수명
		 //인스턴스내부클래스 객체는 외부클래스객체.new 내부클래스 생성자 
		 OuterClass.StaticInnerClass sinner = new OuterClass.StaticInnerClass();
		 //내부 클래스 접근은 클래스형 내부 클래스 경로로 생성자 호출
		
		// 7~8번 문제
		 Animal2 dogi = new Dog1();
		 dogi.animalSound1();
		 dogi.sleep();
		 dogi.def(); //인터페이스의 default메소드 호출
		 Animal2.sta(); //인터페이스의 static메소드 호출,static은 인터페이스로 바로 접근시킨다.
	}	
}

/* 1. Animal클래스는 리턴타입이 void이고 파라미터는 없으며 이름은 animalSound인 인스턴스 메서드를 갖는다.
     메서드 내용은 The animal makes a sound를 출력 */
class Animal {
	void animalSound() {
		System.out.println("The animal makes a sound");
	}	
}


/* 2. Animal을 상속한 Pig 클래스는 Animal의 메서드를 재정의하여 사용
     재정의된 메서드 내용은 The pig says : wee wee을 출력 */
class Pig extends Animal {
	
	@Override //재정의 어노테이션(재정의 메서드의 오류 체크)
	void animalSound() {
		System.out.println("The pig says : wee wee");
	}
}

/* 3. Animal을 상속한 Dog 클래스는 Animal의 메서드를 재정의하여 사용
      재정의된 메서드 내용은 The dog says : bow wow를 출력 */
class Dog extends Animal {
	@Override
	void animalSound() {
		System.out.println("The dog says : bow wow");
	}
}

/* 6. OuterClass를 만들고 default형 인스턴스멤버변수 x를 정의하고 초기값 10을 줌
default형 인스턴스 내부 클래스 InnerClass를 만들고 default형 멤버변수 int y를 정의하고 초기값 5
클래스형 default형 내부클래스 StaticInnerClass를 만들고 클래스형 멤버변수 z를 만들고 초기값 15;
main메서드에서 Outerclass클래스 객체 out을 만듬, 내부 클래스 InnerClass 객체를 만듬 */
class OuterClass {
	int x = 10;
	
	class InnerClass {
		int y = 5;
	}
	
	static class StaticInnerClass {
		static int z = 15;
	}
}

/* 7. 추상클래스는 Animal1을 만들고 추상메서드(리턴타입 void 파라미터 없고 메서드명 animalSound1)만듬
	  일반 메서드는 void 파라미터 없는 sleep를 만듬(내용은 쿨쿨 출력)
	  animal1을 상속한 클래스 Pig1 클래스를 만듬(구현한 메서드 내용은 마음대로) */
abstract class Animal1 {
	 abstract void animalSound1(); //메서드의 선언부(프로토타입)만 정의
	   
	   void sleep() { //일반메서드(인스턴스형)
	      System.out.println("쿨쿨");
	   }
	}

	class Pig1 extends Animal1{
		//추상메서드 구현을 해줘야 만 일반 클래스
	   @Override
	   void animalSound1() {
		   System.out.println("추상 메소드 구현");
	   }
	}
	//일반메소드 sleep()는 재정의해도 되고 그냥 사용해도 됨.
	
/* 8.인터페이스 Animal2를 만듬(메서드는 7번의 메서드 2개 사용)
     구현한 클래스 Dog1 클래스를 만듬(메서드 내용 마음대로) */
	interface Animal2{
		//인터페이스는 추상메서스와 상수(public static final)만 있어야함
		//자바 1.8부터 default인 인스턴스 메서드와 static메서드 추가됨.
		
		//상수
		public static final int CONST = 10;
		
		//추상메서드 2개
		/*public abstract*/ void animalSound1();
		void sleep();
		
		default void def() {
			System.out.println("인터페이스의 default메소드");
		}
		
		static void sta() {
			
		}
	}

	class Dog1 implements Animal2 {
		@Override
		public void animalSound1() {
			System.out.println("인터페이스 구현-sound");
		}
		
		@Override
		public void sleep() {
			System.out.println("인터페이스 구현-sleep");			
		}
	}

/* 1. Animal클래스는 리턴타입이 void이고 파라미터는 없으며 이름은 animalSound인 인스턴스 메서드를 갖는다.
	메서드 내용은 The animal makes a sound를 출력
   2. Animal을 상속한 pig 클래스는 Aimal의 메서드를 재정의하여 사용
	  재정의된 메서드 내용은 The pig says : wee wee을 출력
   3. Animal을 상속한 Dog 클래스는 Animal의 메서드를 재정의하여 사용
	  재정의된 메서드 내용은 The dog says : bow wow를 출력
   4. main메서드에서 상위 클래스의 객체 myPig는 하위 클래스 Pig를 사용하고
	  메서드를 실행
   5. 상위 클래스의 객체 myDog는 하위 클래스 Dog를 사용하고 메서드를 실행
   6. OuterClass를 만들고 default형 인스턴스멤버변수 x를 정의하고 초기값 10을 줌
      default형 인스턴스 내부 클래스 InnerClass를 만들고 default형 멤버변수 int y를 정의하고 초기값 5
      클래스형 default 내부클래스 StaticInnerClass를 만들고 클래스형 멤버변수 z를 만들고 초기값 15;
      main메서드에서 Outerclass클래스 객체 out를 만듬
      내부 클래스 InnerClass 객체를 만듬      
   7. 추상클래스는 Animal1을 만들고 추상메서드(리턴타입 void 파라미터 없고 메서드명 animalSound1)만듬
	  일반 메서드는 void 파라미터 없는 sleep를 만듬(내용은 쿨쿨 출력)
	  animal1을 상속한 클래스 Pig1 클래스를 만듬(구현한 메서드 내용은 마음대로)
   8.인터페이스 Animal2를 만듬(메서드는 7번의 메서드 2개 사용)
	 구현한 클래스 Dog1 클래스를 만듬(메서드 내용 마음대로)
*/
