package com.kook.ch07Project;
//국쌤예제-(원본과상이)
public class Ex07_09 {
	public static void main(String[] args) {
		Buyer0709 b = new Buyer0709();
		
		b.buy(new Tv0709()); //Product0709의 자손이므로 인자로 사용 가능
		b.buy(new Computer0709()); 
		b.buy(new Audio0709());
		
		b.buy(new Tv0709()); //Product0709의 자손이므로 인자로 사용 가능
		b.buy(new Computer0709()); 
		b.buy(new Audio0709());
		
		b.buy(new Tv0709()); //Product0709의 자손이므로 인자로 사용 가능
		b.buy(new Computer0709()); 
		b.buy(new Audio0709());
		
		//배열 10개까진 괜춘, 이상가면 배열 크기를 초과하기에 에러발생
		b.summary();
		
	}
}

class Product0709 {
	int price;
	int bonusPoint;
	
	Product0709() {
		
	}
	
	Product0709(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv0709 extends Product0709{
	Tv0709() {
		super(100);
	}
	
	@Override
	// Objcet클래스의 toString()을 오버라이딩한다.
	public String toString() {
		return "Tv";
	}
}

	class Computer0709 extends Product0709 {
		Computer0709() {
		super(200);
	}

	@Override
	// Objcet클래스의 toString()을 오버라이딩한다.
	public String toString() {
		return "Computer";
	}
}
	class Audio0709 extends Product0709 {
		Audio0709() {
		super(50);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

class Buyer0709 {
	int money = 1000; //소유금액
	int bonusPoint = 0; //보너스점수
	Product0709[] cart = new Product0709[10]; //원소를 10개로 지정, 크기 : 10, 배열의 색인번호 : 10
	
	//Vector cart - new Vector(); //기본 10개 추가할 수 있는 객체 생성
	int i = 0; //배열의 색인번호로 활용
	
	void buy(Product0709 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족해 물건 못사");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		cart[i++] = p;
		//cart.add(p);
		System.out.println(p + "을/를 구입했다");
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		for(int i=0; i < cart.length; i++ ) {
			if(cart[i]==null) {
				break;
			}
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("총금액 : " + sum);
		System.out.println("제품 리스트 : " + itemList);
	}
}