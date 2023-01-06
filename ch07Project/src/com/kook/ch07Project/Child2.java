package com.kook.ch07Project;

public class Child2 extends Parent2 {
	//상속받은 멤버변수가 포함되어 있음
	void method() {
		System.out.println("x = " + x ); //상속받은 x
		System.out.println("this.x = " + this.x); //상속받은 x
		System.out.println("super.x = " + super.x); //부모 x
	}
}
