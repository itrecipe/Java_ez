package com.kook.ch02Project;

import java.util.Scanner; //Scanner를 사용하기 위해 추가

public class Ex02_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//Scanner클래스는 java.lang 패키지에 있는 클래스가 아니므로 import한다.
		//System이나 String클래스는 자바의 기본 패키지인 java.lang에 있어 import안해도 됨.
		System.out.print("두자리 정수를 하나 입력하세요.>");
		String input = scanner.nextLine(); //입력 대기상태에서 입력이 들어오면 Enter키를 입력하여 엽력된 값을 반환(반환된 값은 String(문자형)이다.)
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 : "+input);
		System.out.printf("num = %d%n", num);
		
	}
}
