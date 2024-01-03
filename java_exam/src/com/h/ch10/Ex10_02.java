package com.h.ch10;
//국.변
import java.util.Calendar;

public class Ex10_02 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		//요일값은 색인번호로 사용(요일값은 1~7까지 반환 (1이 일요일))
		Calendar date1 = Calendar.getInstance(); //객체생성순간의 현재시각
		Calendar date2 = Calendar.getInstance(); 
		
		//Calendar객체의 각 구성요소를 변경하기 위해 set메서드 사용
		date1.set(2019, 3, 29); //년,월,일을 변경하는 set메서드, 월은 0부터 시작함을 감안해 값을 집어 넣음
		/* void java.util.Calendar.set, void set(int year, int month, intdate)
		   date.set(2019, Calendar.APRIL, 29)
		*/
		System.out.println("date1은 " + toString(date1) + " " + 
				DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] +" 요일이고, ");
		/* toString(date1)은 Object의 toString()이 아님
		   Calendar의 toString()은 오버라이드는 되어 있으나, Calendar의 모든 멤버변수를 표시
		   필요한 Calendar의 요소만 문자열로 출력하도록 메서드를 toString(Calendar cal)를 만듬
		   실제로 지정된 2019.4.29의 요일을 얻어서 배열의 색인번호를 활용하여 요일 출력
		*/
		System.out.println("오늘(date2)은 " + toString(date2) + " "
				+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + " 요일입니다.");
		
		/* 두 시각의 차이는 밀리세컨드로 반환하는 getTimeInMillis()를 사용하여 구한다.
		   getTimeInMillis()의 리턴값은 posix(unix)타임인 1970.1.1 0시 정각부터 경과한 시간이
		   밀리세컨드로 반환
		*/
		long diff = (date2.getTimeInMillis()-date1.getTimeInMillis()) / 1000;
		//두 시각의 차를 초로 반환
		System.out.println("그날(date1)부터 지금(date2)까지 " + diff + " 초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + diff / (24*60*60) + " 일 입니다.");
		// 1일 = 24 * 60 * 60
	}	
		static String toString(Calendar date) {
			String result = date.get(Calendar.YEAR) + "년"
					+ (date.get(Calendar.MONTH) + 1 ) + "월"
					+ (date.get(Calendar.DATE) + "일");
			return result;
		
	}
}