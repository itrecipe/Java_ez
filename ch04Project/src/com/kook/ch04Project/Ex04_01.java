package com.kook.ch04Project;

public class Ex04_01 {

	public static void main(String[] args) {
		//자바의정석 예제
		int score = 80;
		
		//if문()안에는 비교 연산이나 논리연산처럼 boolean값을 반환해야함.
		//괄호 안의 연산결과가 true이면 { }안으로 진입하여 코드 실행 (즉 처리한다는 뜻)
		if (score > 60) {
			System.out.println("합격입니다.");
		}
		//국쌤 수업 예제
		System.out.println("if문 결과에 상관없이 실행하는 문");
	}
}
