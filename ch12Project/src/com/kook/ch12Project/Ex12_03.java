package com.kook.ch12Project;

import java.util.*;

public class Ex12_03 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		/* FruitBox는 제네릭이 <T extends Fruit & Eatable>로 정의됨.
	       Fruit포함 하위 클래스이며 인터페이스 Eatable구현한 클래스는 매개변수로 타입변수로 사용가능
	    */
		FruitBox<Apple> appleBox = new FruitBox<Apple>(); //Fruit후손 이므로 가능
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		//FruitBox<Grape> grapeBox = new FruitBox<Apple>(); //에러, 타입 불일치
		//FruitBox<Toy> ToyBox = new FruitBox<Toy>(); //Fruit후손이 아니므로 에러
		
		/* 데이터 원소에 값을 추가시는 상속관계에 있는것은 가능
		   Box<T>의 add메서드를 사용하여 Fruit를 상속한 객체를 수용하여 ArrayList에 저장
		*/
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); //값 추가시 하위클래스 객체도 가능하다.
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		
		//appleBox.add(new Grape()); //에러, Grape Apple의 자손이 아님
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox : " + fruitBox);
		System.out.println("appleBox : " + appleBox);
		System.out.println("grapeBox : " + grapeBox);
		
	}
}

class Fruit implements Eatable {
	@Override
	public String toString() {
		return "fruit";
	}
}

interface Eatable {
	
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
	/* 제네릭을 상속관계와 구현관계를 이용하여 정의 할 수 있음
	   이때 extends키워드로 지정(자신 포함 하위 클래스)
	   Box<T>를 상속하여 Box의 모든 메서드 사용가능
	*/
	
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>(); //list생성시 T사용
	void add(T item) { //인스턴스 메서드의 파라메터로 사용
		list.add(item);
	}
	@Override
	public String toString() {
		return list.toString();
	}
}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	@Override
	public String toString() {
		return "Grape";
	}
}

class Toy extends Fruit {
	@Override
	public String toString() {
		return "Toy";
	}
}