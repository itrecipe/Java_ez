package com.h.ch08;

public class Ex08_04 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //ArithmeticException예외 발생
			System.out.println(4);
			
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		}
		catch (Exception e) {
			System.out.println("앞에 있는");
		}
		System.out.println();
	}
}
