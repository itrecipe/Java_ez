package com.kook.ch07Project;

public class Point3D2 extends Point2 {
	
	int z;
	
	Point3D2(int x, int y, int z) {
		//상위클래스의 명시적으로 기본 생성자인 Point2()가 있으므로
		//자동으로 호출되는 super()가 호출되어도 에러 발생 없음
	
		//super(x, y); //개인적으로는 이렇게 호출하는게 편함
		
		//아래 this코드처럼 사용 해도됨
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
