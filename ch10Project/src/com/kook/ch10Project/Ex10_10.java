package com.kook.ch10Project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_10 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Scanner scanner = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력!"
				+ "(입력예 : 2022/11/03)");
		
		//scanner.hasNextLine()는 맨처음 값이 없을시엔 대기함
		while(scanner.hasNextLine()) {
			try {
				inDate = df.parse(scanner.nextLine()); //입력대기 
				/* 정한 패턴 형식이 아니면 Date객체로 변환실패(예외 발생)
				   예외가 발생하면 catch문으로 가고 아니면 break; -> 문으로 탈출!
				  .parse() 받은 문자열을 데이터 객체로 변환
				*/
				break;
			}
			catch (Exception e) {
				//e.printStackTrace();
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력!"
						+ "(입력예 : 2019/12/31)");
			}
		}

		Calendar cal = Calendar.getInstance(); //현재 시간 객체
		
		cal.setTime(inDate); //입력한 날짜의 객체
		
		Date d = new Date(cal.getTimeInMillis());
		
		Calendar today = Calendar.getInstance(); //현재 시간 객체
		
		long day = (today.getTimeInMillis() - cal.getTimeInMillis()) / (1000 * 60 * 60);
		
		System.out.println("입력과 오늘의 시간차는 : " + day + " 시간 차이남");
	}

}
