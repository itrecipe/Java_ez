package com.kook.ch07Project;
//국쌤 변형 예제-(원본과 상이)
public class Ex07_08 { //메인클래스(클래스명은 자바파일명과 동일해야함)

	public static void main(String[] args) {
		//매개변수(파라미터)의 다형성
		Buyer b = new Buyer(); //기본 생성자 사용
		b.buy(new TVex0708()); //Product파라미터에 하위 클래스인 TVex0708사용
		b.buy(new Computer());
		
		System.out.println("남은 돈은 : " + b.money);
		System.out.println("보너스는 : " + b.bonusPoint);
	}
}

class Product { /* extends Object 생략되어 있음 */
	//보조 클래스(하나의 단독 클래스로 만드는것이 좋으나 편의상 여기다 만듬)
	//보조클래스는 public(접근제어가)이 안붙음, 즉 (default)여야 한다(적어도 되지만 굳이 암것도 안붙여도 됨)
	int price; //접근 제어자 default
	int bonusPoint;
	
	Product() {
		//접근제어자는 default 보통 클래스의 접근제어자를 따름
		//다른 생성자가 만들어져 있을시 기본생성자도 사용하려면 꼭 명시적으로 작성 해줘야함

	}
	
	Product(int price) {
		this.price = price; //멤버변수와 파라미터변수명이 동일할시 구분하기 위해 this사용
		bonusPoint = (int)(price/10.0);
	}
}
	class TVex0708 extends Product {
		//생성자
		TVex0708() {
			//상위클래스 생성자중 파라미터 1개 있는 생성자를 호출
			super(100);
		}
		
		@Override //상위클래스의 메서드를 재정의(override)할시 사용하는 어노테이션 (내용만 수정)
		//toString()메서드는 Object의 클래스의 메서드
		//객체값을 문자열로 변환
		public String toString() {
			return "Tv";
		}
	}
	
	class Computer extends Product {
		Computer() {
			super(200);
			
		}
		
		@Override
		//Object클래스의 toString()을 오버라이딩한다.
		public String toString() {
			return "Computer";
		}	
	}
	
	class Buyer { //실 구매자를 class화함
		int money = 1000; //현 보유액
		int bonusPoint = 0;
		
		//물건 구매하는 메서드
		void buy(Product p) {
			//메서드의 파라미터에 상위클래스인 Product를 이용해 다형성 구현
			//다형성을 활용하지 않으면 파라미터가 TVex0708과 Computer를 가진 메서드를 따로 따로 만들어 줘야함.
			//buy메서드를 사용시 인자로 Product의 하위클래스인 TVex0708과 Computer 객체 사용
			//파라미터로 받은 하위클래스 객체가 여기선 사용가능(하위클래스 메서드 사용가능)
		if(money < p.price) {
			System.out.println("돈 없어서 물건 못삼");	
			return; //메서드를 종료 하라는 의미
		}
		
		money -= p.price; //money = money - p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입 했음");
		//print문에서 객체를 사용하면 자동으로 .toString()메서드가 추가됨.
		System.out.println(p.toString() + "를 구입 했음");
		}
}