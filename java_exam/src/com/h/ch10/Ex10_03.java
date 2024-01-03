package com.h.ch10;
//국.변
import java.util.Calendar;

public class Ex10_03 {

	public static void main(String[] args) {
		//Calendar의 시간 설정 set메서드 사용법, 설정은 전부 set메서드를 이용함
		final int[] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"시간", "분 ", "초 "};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		/* set메서드에 년,월,일,시,분,초를 함께 파라미터로 사용하는 메서드는 있지만,
		   시간, 분, 초만 처리 해주는 메서드는 없음
		*/
		time1.set(Calendar.HOUR_OF_DAY, 10); //24시 기준 시간을 10시로 변경
		time1.set(Calendar.MINUTE, 20); 
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20); //24시 기준 시간을 20시로 변경
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		//두 시각 차이
		long diff = Math.abs((time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000); //초로 나옴
		//System.currenTimeMillis();도 getTimeInMillis()와 같이 posix반환(현재시각만 처리)
		
		String tmp = "";
		for(int i = 0; i < TIME_UNIT.length; i++) {
			tmp += diff / TIME_UNIT[i] + TIME_UNIT_NAME[i];
			//diff를 i가 0일시 3600으로 diff를 나누면 시간(정수)가 나오고 뒤엔 시간이 결합
			diff %= TIME_UNIT[i]; //3600으로 나눈 나머지(즉 시간에 포함되지 못한 초)
		}
		System.out.println("시분초로 변환하면 : " + tmp + " 이다.");
	}
}
