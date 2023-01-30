package com.kook.ch10Project;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_08 {

	public static void main(String[] args) {
		Date today = new Date();
		
		Calendar cal = Calendar.getInstance();
		//Date date = new Date(cal.getTimeInMillis());
		
		System.out.println("today객체 : " + today);
		//Fri Jan 13 12:37:16 KST 2023
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
		//E는 요일 표시, '는 특수문자앞에 붙여서 특수문자를 일반 문자로 처리
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		//H는 시간 표시로 0~23, h는 1~12, 표시 S는 밀리세컨드
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		//a는 오전,오후 표시 h는 1~12로 시간 표시
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날");
		//D는 월의 몇번째 일 표시
		sdf6 = new SimpleDateFormat("오늘은 올 해의 d번째 날");
		//d는 달의 몇번째 일 표시		
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 날");
		//w는 해의 몇번째 주 표시
		sdf8 = new SimpleDateFormat("오늘은 올 해의 W번째 날");
		//W는 월의 몇번째 주 표시
		sdf9 = new SimpleDateFormat("오늘은 올 해의 F번째 날");
		//F는 달의 몇번째 요일 표시
		
		System.out.println(sdf1.format(today)); //format(Date d)
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));
		
	}
}