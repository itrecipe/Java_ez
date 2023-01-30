package com.kook.ch10Project;
//국.변
import java.text.DecimalFormat;

public class Ex10_06 {

	public static void main(String[] args) {
		double number = 1234567.89;
		
		String[] pattern = { //패턴기호 모음 배열(패턴은 패턴기호를 이용해서 원하는 형식을 작성)
			"0", //10진수로 표시(소수점 x, 자리수 제한 x)
			"#", //10진수로 표시(소수점 x, 자리수 제한 x)
			"0.0", //소수점 1자리 표시
			"#.#", //소수점 1자리 표시
			"#,###.##" //3자리 잘라서 ,붙이고 소수점 두자리 표시
		
		};
		
		for(int i = 0; i < pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			//DecimalFormat은 숫자를 형식화헤서 표시해주는 클래스
			//format메서드는 숫자값을 정해진 패턴 형식으로 변환한 문자열을 반환
			System.out.println("패턴 값 : " + pattern[i] + " , 변환 값 : " + df.format(number));
		}
	}

}