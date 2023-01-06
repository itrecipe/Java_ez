package com.kook.ch07Project;
//국쌤변형예제(원본과상이)

//익명 클래스 만들기
public class Ex07_17 {
	//바로 해당 조상 클래스나 인터페이스 참조변수(객체)를 원하는 위치에 만들어 사용
	
	//인스턴스형
	Object iv = new Object() { //생성자 뒤 구현부를 만들어 원래 클래스로 처리할 내용을 작성함
		void method() {
			
		}
	};
	
	//클래스형
	static Object cv = new Object() {
		void method() {
			
		}
	};
	
	//로컬형
	void myMetgod() {
		Object lv = new Object() {
			void method() {
				
			}
		};
	}
}
