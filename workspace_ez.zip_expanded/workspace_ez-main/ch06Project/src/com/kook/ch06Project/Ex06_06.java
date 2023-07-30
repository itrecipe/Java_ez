package com.kook.ch06Project;

public class Ex06_06 {

	public static void main(String[] args) {
		// 기본형 값을 매개변수로 전달
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x); //change메서드 호출
		/*main메서드 안에서 메서드명으로 바로 호출이 가능한 것은
		main메서드와 같은 클래스의 static메서드만 가능
		static메서드 안에서 동일 클래스의 static메서드 호출은 메서드명만
		입력하여 사용가능 */
		System.out.println("After change(d.x) : " + d.x);
	}
	static void change(int x) {
		/*인자값을 받는 기본형일시 해당 코드 안에서 로컬 변수로 작용
		  변경된 값이 인자값을 변경 하지는 못한다.
		*/
		x = 1000;
		System.out.println("change() : x = " + x);
	} 
}

class Data {
	int x;
}