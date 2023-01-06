package com.kook.ch07Project;
//Ex07_02~03
public class Ex07_02 { /*extends Object*/
	//상속받은 클래스가 안보이므로 자바의 최상위 클래스인 Object상속, 기본이라 안써도 무방함.
	
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		
		Child2 c2 = new Child2();
		c2.method();
	}
}
