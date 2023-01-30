package com.kook.ch10Project;
//국.변
import java.util.*;

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
		
		Calendar sDay = Calendar.getInstance(); //현재시각을 나타내는 객체
		Calendar eDay = Calendar.getInstance(); //현재시각을 나타내는 객체
		
		//args로 입력 받은 달의 1일로 sDay를 설정
		sDay.set(year, month-1, 1);
		//eDay는 그 다음달 1일로 설정
		eDay.set(year, month, 1);
		
		//마지막 말일을 알아내기 위해 다음달 1일로 된 eDay에서 1일 뺌
		eDay.add(Calendar.DATE, -1); //eDay객체는 전달 말일자가 지정된 객체로 변경
		//eDay Camendar객체가 가진 날짜 값을 가져옴(전달 마지막일)
		END_DAY = eDay.get(Calendar.DATE);
		//END_DAY = sDay.getActualMaximum(Calendar.DATE);를 사용해도 됨
		
		//첫번째 요일이 무슨 요일인지 알아낸다.
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		//DAY_OF_WEEK는 1(일요일)부터 7, sDay는 일력받은 월의 1일이므로 1일의 요일값 반환
		System.out.println("     " + args[0] + "년 " + args[1] + "월");
		
		//1일이 어느 요일이냐에 따라 앞의 요일 일은 공백
		//i는 날짜, n은 요일
		for(int  i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			if(i==1) {
				System.out.println("  SU  MO  TU  WE  TH  FR  SA");
				//1일의 요일 전까지는 공백으로 채움
				for(int j = 1; j < START_DAY_OF_WEEK; j++) {
					System.out.print("        ");
				}
			}
			System.out.print((i < 10) ? "  " + i : " " + i);
			//숫자 자리수에 따라 공백 추가해줌(10일 이상은 2자리 이므로 공백이 하나 적음)
			if(n%7==0) {
				System.out.println(); //줄바꾸기
			}
		}
		
		//Calendar객체를 Date로 변환
		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis());
		
		//Date객체를 Calendar 객체로 변환
		Date d1 = new Date();
		Calendar call = Calendar.getInstance();
		call.setTime(d1);
		
	}
}