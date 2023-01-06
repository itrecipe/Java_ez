package com.kook.ch07Project;

public class Point3D extends Point {
	int z;
	public Point3D(int x, int y, int z){
		//상위클래스의 생성자가 기본형이 아니면 꼭 명시적으로 상위클래스 생성자를 호출
		//Point의 기본형 생성자가 없으므로 자동 호출되는 super()를 사용하면 에러뜸
		super(x,y); //상위클래스 생성자를 ex)super(x,y); <- 이런식으로 사용
		this.z = z;
	}
}
