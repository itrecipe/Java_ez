package com.h.ch11;
//국.변
import java.util.*;

public class Ex11_17 {

	public static void main(String[] args) {
		// Map의 메서드 사용
		HashMap map = new HashMap();
		
		//put(키, 값), 키는 구분자라고 보면된다.
		map.put("김자바", 90);
		map.put("김자바", 100); //앞의 김자바는 중복되어 사라진다.
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);
		
		/* Map은 Colection인터페이스를 상속하지 않아 원소에 접근하는 iterator()를 못가진다.
		   그래서 Set으로 변환한뒤 Set에서 Iterator을 만든다.
		*/
		Set set = map.entrySet();
		//map.ketSet()도 Set반환, map.entrySet() : 반환을 세트로함
		System.out.println("entrySet()의 반환 값 : " + set);
		Set set1 = map.keySet();
		System.out.println("keySet()의 반환 값 : " + set1);
		Iterator it = set.iterator(); //iterator() : 원소에 접근한다.
		
		while(it.hasNext()) {
			/* key와 value를 멤버변수로 가지고 있는 클래스는 HashMap의 내부클래스의 Entry이다.
			   Map객체의 iterator는 Entry객체를 반환(멤버변수로 key와 value를 처리)
			*/
			HashMap.Entry e = (HashMap.Entry)it.next();
			System.out.println("이름(key) : " + e.getKey());
			System.out.println("점수(value) : " + e.getValue());
		}
		
		set = map.keySet(); //map의 key들을 set으로 변경
		for(Object str : set) {
			String key = (String)str;
			System.out.println(key);
			System.out.println(map.get(key)); //key로 value를 얻을시 get(key)사용
		}
		
		Collection values = map.values();
		/* Collection values()는 map에 포함된 value만 Collection으로 반환
		   즉 map에서 값만 가져올시 values()메서드로 Collection객체를 얻어 사용
		*/
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			int i = (int)it.next(); //next()의 리턴값은 Object이므로 int로 변환
			total += i;
		}
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + (float)total/map.size());
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
		
	}
}