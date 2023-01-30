package com.kook.ch11Project;
//국.변
import java.util.*;

public class Ex11_09 {

	public static void main(String[] args) {
		Integer i1 = 1;
		Object[] objArr = {"1",i1,"2","2","3","3","4","4","4"};
		//문자열값과 Integer 객체가 원소르 사용되므로 데이터형은 Object
		Set set = new HashSet();
		for(int i=0; i < objArr.length; i++) {
			//배열의 원소를 set객체에 추가(중복값은 추가로는 안들어감)
			set.add(objArr[i]);
			//"1"과 Integer i1=1은 다른걸로 처리
		}
		System.out.println(set);
		//Set는 Object의 toString이 오버라이딩됨
		
		//HashSet에 저장된 요소들을 출력(Iterator사용)
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}