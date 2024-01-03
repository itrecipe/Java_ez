package com.h.ch11;

import java.util.*;

public class Ex11_10 {

	public static void main(String[] args) {
		//로또 당첨번호 발행시 중복된 번호를 피하기 위해 Set사용
		Set set = new HashSet();
		for(int i=0; set.size() < 6; i++) {
			/* 반복 조건으로 set에 추가되는 원소 갯수를 사용
			   로또 복권번호는 6개이므로 5개 추가되고 블록에서 마지막 하나 추가
			*/
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);
		}
		
		System.out.println(set);
		
		List list = new LinkedList(set);
		//배열이면 Arrays.sort(배열)로 정렬하나 set는 배열이 아님
		Collections.sort(list);
		//sort(list객체)만 허용
		System.out.println("로또번호 생성 (중복x) : " + list);
	}
}