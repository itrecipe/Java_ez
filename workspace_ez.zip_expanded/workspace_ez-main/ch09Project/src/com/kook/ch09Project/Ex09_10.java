package com.kook.ch09Project;
//국.변
public class Ex09_10 {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		/* String클래스의 클래스형(static)메서드인 valueOf()는 
		   파라미터; 데이터형을 달리하는 오버로딩된 메서드들임 
		*/
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; //문자열과 결합하면 문자열(+는 결합연산자)
		
		//각 wrapper클래스(기본형을 클래스형으로 처리)의 parse데이터형 메서드를 이용 기본형으로 변경
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		/* parse(숫자형태문자열)가 아니면 변환 x
		   +붙은 문자열 변환은 JDK 1.7부터 지원
		   valueOf()메서드를 사용하여 변환
		*/
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		//parse는 기본형으로 반환하고, valueOf는 클래스형으로 반환
		//기본형과 클래스형으로 변환은 박싱(포장)기능이 처리됨
		System.out.println(sum);
		System.out.println(sum2);
	
		System.out.println(String.join("",strVal,"+",strVal2," = ") + sum);
		/* String join(CharSequence delimiter, CharSequence... elements)
		   Join(구분자, 뒤의 파라미터는 문자열을 이용해 연결된 문자열을 만들어 줌
		   ...는 파라미터 수가 가변형(varargs) --여기선 4개의 파라미터(인자) 사용
		*/
		System.out.println(strVal + "+" + strVal2 + " = " + sum2);
		
		//parseInt("숫자문자열",진법)은 진법이 갖고 있는 문자도 사용가능
		//parseInt("abc123",16)는 16진수에 a,b,c,d,e,f가 있으므로 변환 가능
	}
}