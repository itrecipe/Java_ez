package com.h.test;

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