package com.h.ch06;

public class Ex06_07 {

	public static void main(String[] args) {
		// 참조형 변수값을 인자로 사용시
		Data1 d = new Data1();
		d.x = 10;
		System.out.println("main () x = " + d.x);
		change(d); //Data1의 객체 d를 인자로 사용
		System.out.println("After change(d)");
		/* 인자로 전달시 주소를 전달하여 그 주소에 저장된 멤버변수 값을 변경하므로
		  호출한 곳 멤버변수도 변경 */
		System.out.println("main () x = " + d.x);

	}
	static void change(Data1 d) {
		//파라미터 참조형변수(객체)를 사용하면 주소를 전달
		d.x = 1000; //파라미터로 전달 받은 Data1의 객체 d의 멤버변수 x를 변경
		System.out.println("change() : x = " + d.x);
	}
}

class Data1{
	int x;
}