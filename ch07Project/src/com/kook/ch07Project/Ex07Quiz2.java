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
		 Pig myPig = new Pig();
		 
		 
		 //myPig mp = new myPig();
		  	//mp.myPig();
		 // 5. 상위 클래스의 객체 myDog는 하위 클래스 Dog를 사용하고 메서드를 실행
		 
		 //myDog md = new myDog();
		  	//md.myDog();
		  	
		 /* 6. OuterClass를 만들고 default형 인스턴스멤버변수 x를 정의하고 초기값 10을 줌
		  default형 인스턴스 내부 클래스 InnerClass를 만들고 default형 멤버변수 int y를 정의하고 초기값 5
		  클래스형 default 내부클래스 StaticInnerClass를 만들고 클래스형 멤버변수 z를 만들고 초기값 15;
		  main메서드에서 Outerclass클래스 객체 out을 만듬, 내부 클래스 InnerClass 객체를 만듬 */
		 Outerclass out = new Outerclass();
		 
		 //System.out.println(OuterClass.CONST);
		 
		 
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
	
	@Override
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

/* 4. main메서드에서 상위 클래스의 객체 myPig는 하위 클래스 Pig를 사용하고
메서드를 실행 */

/*class myPig extends Pig {
	void myPig() {
		System.out.println("myPig");
	}
} 

*/

// 5. 상위 클래스의 객체 myDog는 하위 클래스 Dog를 사용하고 메서드를 실행

/* class myDog extends Dog {
	void myDog() {
		System.out.println("myDog");
	}
}
*/

/* 6. OuterClass를 만들고 default형 인스턴스멤버변수 x를 정의하고 초기값 10을 줌
default형 인스턴스 내부 클래스 InnerClass를 만들고 default형 멤버변수 int y를 정의하고 초기값 5
클래스형 default형 내부클래스 StaticInnerClass를 만들고 클래스형 멤버변수 z를 만들고 초기값 15;
main메서드에서 Outerclass클래스 객체 out을 만듬, 내부 클래스 InnerClass 객체를 만듬 */
class Outerclass {
	int x = 10;
	
	class IneerClass {
		int y = 5;
	}
	
	static class StaticInnerClass {
		int z = 15;
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
