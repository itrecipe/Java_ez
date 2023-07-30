package com.kook.ch05Project;

public class Ex05_06 {

	public static void main(String[] args) {
		//String 배열의 초기화
		String[] names = {"kim", "Park", "Yi"};
		//선언과 동시에 리터럴로 초기화
		//String[] names = new String[]{"kim", "Park", "Yi"};
		//String[] names = new String[3]; names = {"kim", "Park", "Yi"};
		
		for(int i=0; i < names.length; i++)
			System.out.println("names["+i+"] : " + names[i]);
		
		String tmp = names[2]; //배열 요소에 색인번호로 접근
		System.out.println("tmp : " + tmp);
		names[0] = "Yu"; //첫번째 배열값을 Yu로 변경
		names[1] = "Ko";
		
		//기본 for문은 (초기식;조건식;증감식)으로 처리
		//배열이나 데이터처리컬렉션에서는 개선된 for문(enhanced for)를 사용
		
		//국쌤 예제(아래 for문만)
		for(String str : names) {
			//첫번째 파라미터는 요소의 데이터형의 변수, 두번째 파라미터는 배열명
			System.out.println("str값 출력 : " + str);
		}
		
		for(int i=0; i < names.length; i++)
			System.out.println(names[i]);
 	}
}
