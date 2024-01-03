package com.h.ch10;

import java.text.DecimalFormat;

public class Ex10_07 {

	public static void main(String[] args) {
		//문자열로 숫자로 DecimalFormat에서 정한 패턴 형식으로 변환(Parse메서드 사용)
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		try {
			Number num = df.parse("1,234,567.89"); //wrapper클래스중 숫자 클래스들의 상위 클래스
			System.out.print("1,234,567.89" + " -> ");
			//double d = num.doubleValue(); //num이 참조변수형이므로 기본형으로 바꿈
			double d = (double)num;
			System.out.print(d + " -> ");
			System.out.println(df2.format(num)); //format메서드는 숫자를 패턴형식의 문자열로 변경
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
}
