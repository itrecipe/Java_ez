package com.h.ch10;

import java.time.*;
import java.time.format.DateTimeFormatter;

//κ΅μ¬? ?? ?΄?© - κ΅??€ μΆκ??€λͺ? ?? 
public class Ex10Time {

	public static void main(String[] args) {
		//?λ°? 1.8?? μΆκ?? time?¨?€μ§?? ?΄??€?€
		LocalDate myobj = LocalDate.now(); //??¬ ? μ§?(?,?,?Ό)λ₯? ????΄? κ°μ²΄
		System.out.println(myobj); //2023-01-16
		//LocalDate?΄??€? Object?? ??? toString()λ₯? ?¬? ?(?€λ²λΌ?΄?©)?¨
		//ex)System.out.println(myobj.toString());
		
		LocalTime myobj1 = LocalTime.now(); //??¬ ?κ°μ ????΄? κ°μ²΄
		System.out.println(myobj1); //09:37:45.630369100(10?΅λΆμ 1μ΄κΉμ§? ??)
		//LocalTime?΄??€? Object?? ??? toString()κ°? ?¬? ? ?¨
		//ex)System.out.println(myobj1.toString());
		
		LocalDateTime myobj2 = LocalDateTime.now(); //? μ§? + ?κ°? ?? κ°μ²΄
		System.out.println(myobj2.toString());
		//2023-01-16T09:43:59.025973800 ? μ§μ? ?κ°μ¬?΄? Tκ°? μ²¨κ??¨
		
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formattiong : " + myDateObj);
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		//??? κ°μ²΄λ₯? ?΄?©??¬ ? μ§μκ°? κ°μ²΄λ₯? λ³??
		//SimpleDateFormatκ³Όλ ?¬λ¦? ? μ§κ°μ²?.format(?λ³??κ°μ²΄)
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting : " + formattedDate);
	}

}
