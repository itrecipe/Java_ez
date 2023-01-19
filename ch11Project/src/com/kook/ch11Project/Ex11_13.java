package com.kook.ch11Project;

import java.util.*;

public class Ex11_13 {

	//TreeSet은 있다는 정도면 알면 된다고함 -feat.국쌤
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i = 0; set.size() < 6; i++) {
			//중복되지 않는 값 6개를 set에 넣어줌
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
		}
		//TreeSet은 정렬되어 처리되므로 sort를 하지 않아도 오름차순 정렬되어 있다.
		System.out.println(set); 
	}
}