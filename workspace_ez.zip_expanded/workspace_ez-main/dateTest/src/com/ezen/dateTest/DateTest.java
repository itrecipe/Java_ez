package com.ezen.dateTest;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateTest {
	//10장 시험 - 라이브러리 활용
	public static void main(String[] args) {
		//1
		Date date1 = new Date();
		//2
		Calendar date2 = Calendar.getInstance();
		//3
		LocalDateTime date3 = LocalDateTime.now();
		//4
		System.out.println("1번-format이전시각 : " + date3.toString());
		//5
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		//6
		String formattedDate = date3.format(myFormatObj);
		System.out.println("6번-포맷이후 : " + formattedDate);
		
	}

}

/*
1.현재 시각 date1을 Date클래스를 이용하여 작성하시오
2.현재 시각 date2를 Calendar클래스를 이용하여 작성하시오
3.현재시각 date3을 LocalDateTime클래스를 이용하여 작성하시오  
4.date3를 출력하시오(출력시 “format이전시각” 문자열 다음에 출력)
5.date3를 “dd-MM-yyyy HH:mm:ss”로 포맷화하는 객체 myFormatObj를 만드시오
6.date3를 포맷화된 형식의 문자열로 변환하여 formattedDate변수에 대입하시오
7.formattedDate변수를 프린트 문자열 “포맷이후 : ” 문자열과 함께 프린트 하시오
*/