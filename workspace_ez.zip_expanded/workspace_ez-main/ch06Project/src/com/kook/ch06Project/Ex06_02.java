package com.kook.ch06Project;

public class Ex06_02 {
//국쌤 변형 예제(원본과 살짝 다름)
	public static void main(String[] args) {
		//Tv가 Ex06_01클래스 내부에 있어도 별도 클래스라서 동일 패키지에 있으므로 접근 가능
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		//System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		//System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
		
		t1.channel = 7;
		//t2.channel = 8;
		
		System.out.println("t1 주소 : " + t1);
		System.out.println("t2 주소 : " + t2);
		
		System.out.println("t1의 채널 " + t1.channel);
		System.out.println("t2의 채널 " + t2.channel);
		
		t2 = t1; //t2의 값인 주소가 t1의 값인 주소로 대임
		
		//동일한 주소를 가진 객체가 생성됨.
		System.out.println("t1의 channel값이 7로 변경됨.");
		System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
		System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
	}
}