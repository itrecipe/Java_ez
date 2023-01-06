package com.kook.ch07Project;
//국쌤변형예제(원본과상이)
public class Ex07_14 {
	//멤버 변수
	private int outerIv = 0; //Ex07_14클래스 안에서만 사용
	static int outerCv = 0; 
	//접근제어자가 없으므로 (default)이므로 내 패키지안에선 어디서나 사용가능
	
	class InstanceInner { //인스턴스형 내부 클래스는 부모클래스의 멤버 이므로 다른 멤버 사용가능
		int liv = outerIv;
		int liv2 = outerCv;
	}
	
	static class StaticInner { //클래스형 내부 클래스
		//static은 static멤버는 그대로 사용하나 인스턴스멤버는 외부객체를 만들어 사용
		//int siv = outerTv;
		static int scv = outerCv;
		
	}
	
	void myMethod() {
		int lv = 0; //메서드의 변수로 로컬 변수
		/*final*/ int LV = 0; 
		//메서드의 변수로 로컬 변수인데 Local클래스에서 사용을 위해 final사용(자바1.8부턴 생략가능)
		
		//로컬 클래스
		class LocalInner {
			//외부클래스 멤버는 모두 사용가능(클래스나 인스턴스 바로 접근)
			int liv = outerIv;
			int liv2 = outerCv;
			//자바 8이전엔 final이 붙은 지역변수만 사용가능했으나 지금은 final생략
			//LV = 4; //final이므로 변경불가
			int liv3 = lv;
			int liv4 = LV;
		}
	}
	
	public static void main(String[] args) {

	}
}
