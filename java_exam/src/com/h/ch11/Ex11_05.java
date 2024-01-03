package com.h.ch11;
//국.변
import java.util.*;

public class Ex11_05 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		/* ArrayList는 List인터페이스를 구현했고 List인터페이스는 Collection인터페이스를 상속
		   genneric(제네릭)을 이용하여 객체 선언
		   제네릭은 ArrayList의 데이터들의 데이터형을 지정
		   list객체에 사용되는 요소는 String이어야만함
	    */
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		/* list의 요소에 접근하기 위해 Iterator를 사용
		   Interface Iterator<E>로 정의되어 제네릭형 인터페이스
		*/
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		//양방향으로 개선된 Iterator
		//Interface ListIterator<E> 제네릭 인터페이스 List계열에서만 사용
		ListIterator<String> lit = list.listIterator();
		
		while(it.hasNext()) {
			//Iterator보다 추가된 메서드를 가짐
			String str = lit.next();
			System.out.println(str);
		}
	}
}