package com.kook.ch07Project;

import java.util.Arrays; //내 패키지가 아니므로 클래스명으로 사용하기 위해 import해줌

public class Ex07_04 {

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println("x=" + p.x + ",y=" + p.y + ",z=" + p.z);
		
		Point3D2 p1 = new Point3D2(3, 4, 5);
		System.out.println("x=" + p1.x + ",y=" + p1.y + ",z=" + p1.z);

		Arrays as;
		Math.random(); 
		//Math,String,integer .. 기본 자바 클래스는 java.lang패키지 소속으로
		//java.lang에 있는 클래스는 import안함
	}
}