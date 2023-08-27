package com.h.ch10;
//국.변
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_09 {

	public static void main(String[] args) {
		// SimpleDateFormat의 format과 parse메서드 사용
		// format은 date객체를 정한 형식의 문자열로 변환, parse 문자열을 정한 형식의 Date형으로 표시
		DateFormat df1 = new SimpleDateFormat("yyyy년MM월dd일");
		//DateFormat은 추상클래스로 SimpleDateFormat의 부모 클래스
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		Date d = null;
		
		try {
			d = df1.parse("2019년 11월 23일");
			//d = df1.parse("2019/11월 23일"); //패턴이 다르므로 오류
			//정한 형식의 문자열 값을 Date객체로 변환
			//패턴에서 공백은 처리
			//패턴과 다른 문자열을 주면 예외 발생
			System.out.println(d); //원래 Date형으로 출력
			
			//패턴에서 공백은 처리
			//패턴과 다른 문자열을 주면 예외 발생
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		String ds = df2.format(d); //정한 형식 문자열로 변환
		System.out.println(ds);
		
	}
}