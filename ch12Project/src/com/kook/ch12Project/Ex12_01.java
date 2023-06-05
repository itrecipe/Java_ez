package com.kook.ch12Project;

import java.util.*;

public class Ex12_01 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList/*<Procuct>*/();
		/* 생성자의 제네릭에는 java8부터 데이터형은 생략 해도 된다. 단, <>는 생략불가
		   제네릭에 들어가는 데이터형은 참조형 데이터형이어야한다.(기본형은 불가)
		   Class ArrayList<E>로 정의됨
		*/
		ArrayList<Tv> tvlist = new ArrayList<Tv>();
		//지네릭으로 사용되는 타입변수는 다형성이 적용이 안됨
		
		/*ArrayList<Product> tvlist1 = new ArrayList<Tv>(); //error
		  Product와 Tv는 상속관계이나 지네릭 타입매개변수로 사용시는 상속관계에 있어도 에러(동일해야한다)
		*/
		List<Tv> tvlist1 = new ArrayList<Tv>();
		//지네릭이 동일한 클래스에는 다형성이 적용
		
		productList.add(new Tv());
		productList.add(new Audio());
		//지네릭 객체에 요소 추가시 하위 객체는 추가할 수 있음
		printAll(productList);
	}
	static void printAll(ArrayList<Product> productList) {
		//매개변수로 제네릭 객체를 사용하면 제넥을 하위 객체를 사용할수있음
		for(Product p : productList) {
			System.out.println(p);
		}
	}
}

class Product {
	
}

class Tv extends Product {
	
}

class Audio extends Product {
	
}