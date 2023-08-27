package com.h.ch10;

import java.time.*;
import java.time.format.DateTimeFormatter;

//교재?�� ?��?�� ?��?�� - �??�� 추�??���? ?��?��
public class Ex10Time {

	public static void main(String[] args) {
		//?���? 1.8?��?�� 추�??�� time?��?���??�� ?��?��?��?��
		LocalDate myobj = LocalDate.now(); //?��?�� ?���?(?��,?��,?��)�? ?��???��?�� 객체
		System.out.println(myobj); //2023-01-16
		//LocalDate?��?��?��?�� Object?��?�� ?��?��?�� toString()�? ?��?��?��(?��버라?��?��)?��
		//ex)System.out.println(myobj.toString());
		
		LocalTime myobj1 = LocalTime.now(); //?��?�� ?��간을 ?��???��?�� 객체
		System.out.println(myobj1); //09:37:45.630369100(10?��분의 1초까�? ?��?��)
		//LocalTime?��?��?��?�� Object?��?�� ?��?��?�� toString()�? ?��?��?�� ?��
		//ex)System.out.println(myobj1.toString());
		
		LocalDateTime myobj2 = LocalDateTime.now(); //?���? + ?���? ?��?�� 객체
		System.out.println(myobj2.toString());
		//2023-01-16T09:43:59.025973800 ?��짜�? ?��간사?��?�� T�? 첨�??��
		
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formattiong : " + myDateObj);
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		//?��?��?�� 객체�? ?��?��?��?�� ?��짜시�? 객체�? �??��
		//SimpleDateFormat과는 ?���? ?��짜객�?.format(?���??��객체)
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting : " + formattedDate);
	}

}
