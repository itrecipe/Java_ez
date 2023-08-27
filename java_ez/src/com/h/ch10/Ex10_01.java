package com.h.ch10;

import java.util.*;

public class Ex10_01 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		/* Calendar클래스는 추상 클래스이며 Date클래스 이후에 나옴
		   생성된 Calendar객체는 현재 시각을 나타내는 객체
		   현재 시각의 각 구성요소인 년,월,일,시간 등은 get(구성요소를 나타내는 상수값)
		   인스턴스 = 객체 라는 뜻임
		*/
		
		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
		//public static final Calendar.YEAR = 1;로 정의 됨
		System.out.println("월(0~11, 0:1월) : " + today.get(Calendar.MONTH));
		//월은 0월부터 11월까지 나옴
		System.out.println("이 해의 몇 째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("이 달의 몇 일 : " + today.get(Calendar.DATE));
		System.out.println("이 달의 몇 일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇 일 : " + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("요일(1~7, 1:일요일) : " + today.get(Calendar.DAY_OF_WEEK));
		// 1:일요일, 2:월요일, ... 7:토요일
		System.out.println("이 달의 몇 째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//몇번째 주를 반환
		System.out.println("오전_오후(0:오전, 1:오후) : " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23) 24시간 형식 : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("1000분의 1초(0~999) : " + today.get(Calendar.MILLISECOND));
		System.out.println("Timezone(~12~+12) : " + today.get(Calendar.ZONE_OFFSET)/(60*60*1000));	
		/* TimeZone은 세계표준시각(UTC)를 기준으로 지역 시간이 몇시간 늦는지 아님 빠른지를 나타냄
		   UTC와의 차이가 밀리세컨드로 나와서 초로 환산시 1000으로 나누고 초는 분으로 환산 60으로 나누고
		   분은 시간으로 환산하기 위해 60으로 나눔
		*/
		System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE)); //이 달의 마지막 달을 찾는다.
	}
}
