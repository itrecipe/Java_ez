package com.h.ch09;

import java.util.StringJoiner;

//국.변
public class Ex09_09 {

	public static void main(String[] args) {
		// 문자열의 반환
		String animals = "dog,cat,bear";
		//우선 문자열을 배열로 반환
		String[] arr = animals.split(","); //split("문자열 중간중간 구분해주는 문자")
		//arr = {"dog","cat,"bear"}
		//배열을 원하는 구분문자를 넣어 문자열로 변환
		animals = String.join("-",arr);
		//join은 String static메서드 join("구분문자",사용할배열)로 문자열을 반환		
		System.out.println("animals : " + animals);
		
		/* StringJoiner객체를 생성하여 add메서드로 배열의 원소를 문자열로 변환시,
		   그리고 생성시 설정한 구분자와 접두사, 접미사를 첨가 
		*/
		StringJoiner sj = new StringJoiner("/","[","]");
		//생성시에 구분문자 / ,맨처음 문자는 [, 마지막 문자는 ]을 사용
		for(String s : arr) {
			sj.add(s); //StringJoiner객체를 반환(즉 자신을 반환)
		}
		System.out.println(sj.toString());
		//StringJoiner에서 toString()을 Override해놓음
		System.out.println(sj); //print문의 객체값 사용시엔 자동으로 toString()이 붙어있음
	}
}