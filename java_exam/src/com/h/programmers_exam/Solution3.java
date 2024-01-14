package com.h.programmers_exam;

import java.util.Scanner;

//대소문자 바꿔서 출력
public class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String result = ""; //결과를 받을 문자열을 초기화. result 변수에 대소문자를 반전시킨 문자열을 저장한다.
		
		for(int i = 0; i < a.length(); i++) { //입력 받은 문자열을 한 글자씩 반복적으로 처리하기 위한 반복문
			
			char c = a.charAt(i); //문자열 a에서 현재 인덱스 i에 해당하는 문자를 가져와서 변수 c에 저장한다.
			
			if(Character.isLowerCase(c)) { //c가 소문자인지 확인한다.
										   // Character.isLowerCase() 메서드는 주어진 문자가 소문자인지 확인하여 true 또는 false를 반환한다.
				
				result += Character.toUpperCase(c); //c가 소문자인 경우 해당 문자를 대문자로 변환하여 result에 문자열로 추가한다.
				
			} else {
				
				result += Character.toLowerCase(c); //c가 대문자인 경우 해당 문자열을 소문자로 변환하여 result에 문자열로 추가한다.
				
			}
		}
		System.out.println(result);
	}
}