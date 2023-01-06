package com.kook.ch07Project;
import static java.lang.System.out; //System클래스의 클래스멤버변수인 out를 사용시 out으로 바로 사용 
import static java.lang.Math.*; // *은 모두 클래스형 멤버변수나 멤버메서드에 대해 적용

public class Ex07_06 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		out.println(random());

		System.out.println("Math.PI : " + Math.PI);
		out.println("Math.PI : " + PI);
	}
}