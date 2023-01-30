package com.ezen.myProject1;

import java.util.Arrays;

public class JavaStudyClass {
	//5장-배열(시험) 언어의 특성 활용
	public static void main(String[] args) {
	
	//가
		String[] cars1 = {"Volvo","BMW","Ford","Mazda"};
		//나
		String[] cars2 = new String[]{"Volvo","BMW","Ford","Mazda"};
		//다
		String[] cars3 = new String[4];
		cars3 [0] = "Volvo";
		cars3 [1] = "BMW";
		cars3 [2] = "Ford";
		cars3 [3] = "Mazda";
		//라
		for(int i=0; i < cars1.length; i++) {
			System.out.println("cars1 배열의 요소 출력 (기본 for) : " + cars1[i]);
		}
		//마
		for(String str:cars2) { //새로운 for문
			System.out.println("(마) enhanced for문 : " + str);
			
		}
		//바
		int[][] myNumbers = {
				{1,2,3,4},
				{5,6,7}
		};
		//사
		System.out.println("(사) : " + (myNumbers[1][1]));
		
		//아
		for(int j=0; j < myNumbers.length; j++) {
			System.out.println("(아) myNumbers 배열의 요소값 : " + Arrays.deepToString(myNumbers));
		}
		
		//타
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		
		//파
		animal1.kind = "bird";
		animal1.age = 10;
		animal1.name = "puppy";
		
		animal2.kind = "fish";
		animal2.age = 15;
		animal2.name = "kalchi";
		
		//하
		animal1.setAge(10);
		animal2.setAge(15);
	}
}

//자
class Animal {
	//차
	String kind;
	int age;
	String name;
	
	//카
	public void setAge(int age) {
		this.age = age;
	}
}

/*
main메서드 안에서 다음을 구현한다 (자바교재의 ch5 배열편을 참조한다)   
가. 문자열 배열 cars1를 만들고 초기값을 배열값 "Volvo", "BMW", "Ford", "Mazda"로 초기화

나. 문자열 배열 cars2를 new를 이용하여 만들고 초기값은 "Volvo", "BMW", "Ford", "Mazda" 사용

다. 문자열 배열 cars3를 크기 4를 지정하여 만들고 각원소에 "Volvo", "BMW", "Ford", "Mazda"를 넣어줌

라. cars1의 원소값을 기본 for문을 이용하여 출력

마. cars2의 원소값을 enhnaced for문을 이용하여 출력

바. int로된 2차원 배열 myNumbers를 만들고 초기값은 {1, 2, 3, 4}, {5, 6, 7}를 이용

사. 2번째 행의 두번째 열값을 출력

아. for문을 이용하여 각 원소값을 출력

자. Animal클래스를 이 java파일 안에 만듬

차 멤버변수는 kind, age, name을 갖는다.(type은 age는 int나머지는 String)

카. 멤버 메서드는 public void setAge(int age) {
       this.age = age;
 }

타. main메서드 안에서 Animal객체 animal1과 anlmal2를 만듬

파. animal1의 kind는 bird, age는 10,name은 puppy로 초기화
   animal2의 kind는 fish, age는 15,name은 kalchi로 초기화
		
하. 메서드 setAge를 call해보세요

*/
