package com.h.test;

import java.util.Arrays;

public class JavaStudyClass {
	//5��-�迭(����) ����� Ư�� Ȱ��
	public static void main(String[] args) {
	
	//��
		String[] cars1 = {"Volvo","BMW","Ford","Mazda"};
		//��
		String[] cars2 = new String[]{"Volvo","BMW","Ford","Mazda"};
		//��
		String[] cars3 = new String[4];
		cars3 [0] = "Volvo";
		cars3 [1] = "BMW";
		cars3 [2] = "Ford";
		cars3 [3] = "Mazda";
		//��
		for(int i=0; i < cars1.length; i++) {
			System.out.println("cars1 �迭�� ��� ��� (�⺻ for) : " + cars1[i]);
		}
		//��
		for(String str:cars2) { //���ο� for��
			System.out.println("(��) enhanced for�� : " + str);
			
		}
		//��
		int[][] myNumbers = {
				{1,2,3,4},
				{5,6,7}
		};
		//��
		System.out.println("(��) : " + (myNumbers[1][1]));
		
		//��
		for(int j=0; j < myNumbers.length; j++) {
			System.out.println("(��) myNumbers �迭�� ��Ұ� : " + Arrays.deepToString(myNumbers));
		}
		
		//Ÿ
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		
		//��
		animal1.kind = "bird";
		animal1.age = 10;
		animal1.name = "puppy";
		
		animal2.kind = "fish";
		animal2.age = 15;
		animal2.name = "kalchi";
		
		//��
		animal1.setAge(10);
		animal2.setAge(15);
	}
}

//��
class Animal {
	//��
	String kind;
	int age;
	String name;
	
	//ī
	public void setAge(int age) {
		this.age = age;
	}
}