package com.kook.ch09Project;

import java.util.ArrayList;

public class Ex09_16 {

	public static void main(String[] args) {
		int i = 10;
		
		/* 기본형도 참조형으로 강제형변환(casting) 가능
		   지금은 아니지만, 예전엔 해당 방식을 사용하였다고함
		*/
		Integer intg = (Integer)i;
		Object obj = (Object)i;
		
		Long lng = 100L; //100L은 기본형인데 Long형(wrapper클래스)으로 사용가능(오토박싱)
		int int2 = intg + 10;
		/* 래퍼객체형 + 기본형 연산이 JDK 1.5부터 가능
		   intg에 intValue()가 자동으로 첨가됨(컴파일러가 자동으로 처리함)
		*/
		
		long l = intg + lng; //참조형간의 연산도 가능
		
		ArrayList<Integer> list = new ArrayList<>();
		list = new ArrayList<>();
		/* ArrayList는 배열을 처리하기 쉽도록 한 컬렉션(데이터들의 집합)
		   <Integer>는 제네릭으로 데이터형을 전달하는 매개변수(list요소가 전부 Integer형으로 되어있음)
		*/
		list.add(10); //자동으로 박싱(오토박싱)
		list.add(intg);
		int res = list.get(0);
		//Integer를 반환하나 int로 받음, 즉 자동으로 객체에서 정수로 변환(언박싱)
		Integer res1 = list.get(1);
		
		System.out.println(res);
		System.out.println(res1);
		
	}
}