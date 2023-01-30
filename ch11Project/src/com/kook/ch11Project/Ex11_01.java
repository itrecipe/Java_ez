package com.kook.ch11Project;

import java.util.*;

public class Ex11_01 {

	public static void main(String[] args) {
		//ArrayList객체는 생성자를 이용
		//ArrayList list1 = new ArrayList(10); //원시적 작성방법 
		//10은 초기 용량
		//ArrayList클래스는 제네릭 클래스로 사용 안하면 원시 타입이다.
		ArrayList<Integer> list1 = new ArrayList<Integer>(10); // <- 이렇게 작성하는것이 정상
		//List인터페이스 계열로 배열 기반으로서 순서를 유지하고 중복을 허용하고 저장 메모리가 연속되어 사용
		//ArrayList객체에 요소값을 추가할시 add메서드를 사용
		list1.add(5); //5는 기본형이나 자동 박싱(오토박싱)에 의해 Integer타입으로 변환
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);

		list1.add(5); //증복 허용
		
		ArrayList<Integer> list2 = new ArrayList<Integer> (list1.subList(1, 4));
		//List<Integer> subList(int fromIndex, int toIndex)메서드는
		//list 객체의 색인번호 fromIndex에서 toIndex-1을 선택한 List객체를 반환
		//생성자의 파라미터로 Collection객체를 사용가능
		print(list1,list2);
		
		Collections.sort(list1); //자신을 정렬
		//<Integer> void sort(List<Integer> list)
		//Collections는 클래스로 인터페이스인 Collection과 별개
		//public class Collections extends Object로 Collection을 구현 안함
		//Collections 클래스는 collection관련 클래스 처리에 유용한 메서드 등을 제공
		//List 객체를 정렬 해줌
		Collections.sort(list2);
		
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : " 
		          + list1.containsAll(list2)); //list1은 list2모두 포함하는가?
		
		list2.add(6);
		list2.add(7);
		//add(값)은 마지막 요소뒤에 추가
		list2.add(3, 8); //이 방법은 속도가 늦어지므로 좋지 않은 방식임
		//add(색인번호, 값)은 색인번호의 값을 추가
		//뒤의 원소는 뒤로 밀림
		print(list1, list2);
		
		list2.set(3, 44); //set는 색인번호 3번을 변경
		print(list1, list2);
		
		/* list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제함(retainAll메서드)
		   반환은 boolean.(list1에서 겹치는 부분만 남김)
		*/
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제
		for(int i = list2.size()-1; i >= 0; i--) {
			/* size()메서드는 List의 원소개수
			   get(색인번호)는 색인번호의 저장된 원소값
			   contains(값)은 값을 포함 여부
			   remove(색인번호)는 색인번호의 원소값 제거(삭제)
			   제거나 추가시 맨끝에서 하는 것은 바로 처리가 됨 
			   맨처음이나 중간에서 처리는 새로운 배열을 만들어 처리(처리 속도는 늦어짐)
			   현재 for문에서는 맨마지막 원소부터 처리 (이유는 속도가 늦어지지 않게 하기 위함)
			*/
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);
		
		Vector v = new Vector(5);
		v.add("5");
		v.add("6");
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		//List계열의 toString()도 값으로 표시되도록 오버라이딩 됨
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}