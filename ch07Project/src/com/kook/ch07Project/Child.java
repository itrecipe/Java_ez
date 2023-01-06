package com.kook.ch07Project;

//Parent 클래스를 상속받은 클래스(child)
public class Child extends Parent {
	int x = 20;
	
	void method() {
		System.out.println("x = " + x); //x는 자기클래스의 x
		System.out.println("this.x = " + this.x);
		//this는 자기객체이므로 x는 자기 클래스의 x
		System.out.println("super.x = " + super.x); //x는 자기클래스의 x
		//super객체는 상위클래스 객체를 나타내므로 x는 상위클래스의 x
	}
	//클래스명인 Child로된 생성자 x (기본 생성자만 있음)
}
