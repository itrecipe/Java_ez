package com.h.test;

public class GuGuDan {

	public static void main(String[] args) {

		for(int i=2; i<10; i++) {
			
			System.out.println();
			System.out.println(i + "´Ü" + " Ãâ·Â");
			System.out.println();
			
			for(int j=1; j<10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
	}
}