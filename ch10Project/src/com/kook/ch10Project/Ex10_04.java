package com.kook.ch10Project;

import java.util.Calendar;

public class Ex10_04 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance(); //현재 시각
		date.set(2019, 7, 31);
		System.out.println(toString(date));
		
		/* Calendar객체의 구성요소에 값을 더하거나 뺄시 사용하는 add메서드
		   add메서드는 관련된 다른 구성요소도 변경함
		*/
		
		date.add(Calendar.DATE, 1); //date객체의 날짜에 1을 더함
		System.out.println(toString(date));
		
		date.add(Calendar.MONTH, -6); //6개월 전
		System.out.println(toString(date));
		
		//roll메서드도 구성요소에 값을 더하거나 뺄 수 있으나 관련 요소는 변경 안함(자기자신만 변경됨)
		date.roll(Calendar.DATE, 31); //자기필드만 수정, 월은 변경 안되고 일만 1로 나옴
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 31); //관련된 월도 바뀜
		System.out.println(toString(date));
	
		/* ppt 내용 추가 설명
		 add와 role메서드
		 add(int field, int amount)는 Carendar의 필드에 
		 amount만큼 더하거나 뺄시 사용 (더하거나 빼진 시각을 반환)
         
         role(int field, int amount)도 같으나 차이는 다른 필드에는 영향을 안줌
         (변경한 구분요소상수 field에 해당하는 요소만 변경)
         (단 말일에 월 요소를 변경하면 일요소에 영향을 줄 수 있음)
         
         이번달 말일 파악은 다음달 1일에서 하루 빼면 됨
         또는 getActualMaximum(Calendar.DATE)사용
		  
		*/
	}
	
	static String toString(Calendar date) {
		
		String result = date.get(Calendar.YEAR) + "년"
				+ (date.get(Calendar.MONTH) + 1 ) + "월"
				+ (date.get(Calendar.DATE) + "일");
		
		return result;
	
	}
}