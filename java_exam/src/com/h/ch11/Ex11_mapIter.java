package com.h.ch11;
//국쌤예제(교재에없는 내용-추가설명)
import java.util.*;

public class Ex11_mapIter {

	public static void main(String[] args) {
		/* Map은 Collection인터페이스를 구현하지 않은 데이터그룹처리 인터페이스
		   Map객체는 iterator()메서드가 없어서 바로 사용할 수 없음
		   Collection 인터페이스를 상속한 Set계열로 반환하는 메서드를 이용해서 변환후 사용
        */
		Map map = new HashMap();
		
		Set kset = map.keySet(); //HashMap의 key를 Set로 반환
		Set vset = map.entrySet(); //HashMap value(값)을 Set로 반환
		
		map.put("age", 50);
		map.put("name", "kim");
		
		Iterator it = vset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			//key = 값
		}

		Iterator kit = kset.iterator();
		
		while(kit.hasNext()) {
			System.out.println(kit.next());
			//key만
		}
	}

}
