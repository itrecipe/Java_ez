package com.h.ch10;

import java.time.*;
import java.time.format.DateTimeFormatter;

//êµì¬?— ?—†?Š” ?‚´?š© - êµ??Œ¤ ì¶”ê??„¤ëª? ?˜ˆ? œ
public class Ex10Time {

	public static void main(String[] args) {
		//?ë°? 1.8?—?„œ ì¶”ê??œ time?Œ¨?‚¤ì§??˜ ?´?˜?Š¤?“¤
		LocalDate myobj = LocalDate.now(); //?˜„?¬ ?‚ ì§?(?…„,?›”,?¼)ë¥? ?‚˜???‚´?Š” ê°ì²´
		System.out.println(myobj); //2023-01-16
		//LocalDate?´?˜?Š¤?˜ Object?—?„œ ?ƒ?†?•œ toString()ë¥? ?¬? •?˜(?˜¤ë²„ë¼?´?”©)?¨
		//ex)System.out.println(myobj.toString());
		
		LocalTime myobj1 = LocalTime.now(); //?˜„?¬ ?‹œê°„ì„ ?‚˜???‚´?Š” ê°ì²´
		System.out.println(myobj1); //09:37:45.630369100(10?–µë¶„ì˜ 1ì´ˆê¹Œì§? ?‘œ?‹œ)
		//LocalTime?´?˜?Š¤?˜ Object?—?„œ ?ƒ?†?•œ toString()ê°? ?¬? •?˜ ?¨
		//ex)System.out.println(myobj1.toString());
		
		LocalDateTime myobj2 = LocalDateTime.now(); //?‚ ì§? + ?‹œê°? ?‘œ?‹œ ê°ì²´
		System.out.println(myobj2.toString());
		//2023-01-16T09:43:59.025973800 ?‚ ì§œì? ?‹œê°„ì‚¬?´?— Tê°? ì²¨ê??¨
		
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formattiong : " + myDateObj);
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		//?˜•?‹?™” ê°ì²´ë¥? ?´?š©?•˜?—¬ ?‚ ì§œì‹œê°? ê°ì²´ë¥? ë³??™˜
		//SimpleDateFormatê³¼ëŠ” ?‹¬ë¦? ?‚ ì§œê°ì²?.format(?˜•ë³??™˜ê°ì²´)
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting : " + formattedDate);
	}

}
