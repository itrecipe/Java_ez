package com.kook.ch10Project;

import java.util.Calendar;

public class Ex10_05 {

	public static void main(String[] args) {
		
		if(args.length !=2) {
			System.out.println("입력법 : 2022 11");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		//args로 입력 받은 달의 1일로 sDay를 설정
		sDay.set(year, month-1, 1); 
		//eDay는 그 다음달 1일로 설정
		eDay.set(year, month, 1);
		
		//마지막 말일을 알아내기 위해 다음달 1일로 된 eDay에서 1일 뺌
		eDay.add(Calendar.DATE, -1);
	}
}