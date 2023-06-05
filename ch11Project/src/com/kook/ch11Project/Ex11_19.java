package com.kook.ch11Project;
//국.변
import java.util.*;
import static java.util.Collections.*;
// Collections클래스의 모든 static멤버는 Collections.없이 사용

public class Ex11_19 {

	public static void main(String[] args) {
		// Collections클래스
		List<Integer> list = new ArrayList<Integer>();
		//List계열들은 toStoring()메서드가 항상 오버라이딩(재정의) 되어 있다.
		System.out.println("list : " + list);
		
		/*Collections.(생략됨)addAll()*/addAll(list, 1, 2, 3, 4, 5); //import static Collections 생략가능
		/*<Integer> boolean addAll(Collection<? super Integer> c, Integer... elements)
 		  addAll메서드의 반환은 boolean이고 c 컬렉션객체(요소(삽인되는데이터)가 Integer의 상위 클래스 Collection)
		  가변 Integer를 파라미터로 가짐
		*/
		System.out.println("addAll : " + list);
		
		rotate(list, 2); //list의 구성요소를 뒤로 2칸씩 밀어서 회전시킨다.
		System.out.println("rotate : " + list);
		
		swap(list, 0, 2); //첫 번쨰와 세 번째를 교환(swap)
		System.out.println("swap : " + list);
		
		shuffle(list); //저장된 요소의 위치를 임의로 변경
		System.out.println("shuffle : " + list);
		
		System.out.println("============================");
		sort(list); //오름차순 정렬
		System.out.println("sort 오름차순 정렬 : " + list);
		
		sort(list, reverseOrder()); //역순 정렬(내림차순) reverse(list); 와 동일하다.
		System.out.println("sort, reverseOrder() 역순정렬 : " + list);
		
		reverse(list); //list를 역순으로 정렬
		System.out.println("reverse : " + list);
		
		//2진검색(binarySearch)를 위해 정렬
		sort(list); //오름차순 정렬
		System.out.println("sort 오름차순 정렬 : " + list);
		
		int idx = binarySearch(list, 3); //3이 저장된 위치(index)를 반환, 정렬후 사용
		System.out.println("index of 3 = " + idx);
		
		//Collections.max(list), 위에서 미리 import를 해주었기 때문에 컬렉션 생략
		System.out.println("max : " + max(list)); 
		System.out.println("min : " + min(list));
		
		System.out.println("reverseOrder(), min : " + max(list, reverseOrder()));
		
		fill(list, 9); //list를 9로 채움
		System.out.println("fill(), list : " + list);
		
		//list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
		List newList = nCopies(list.size(),2);
		System.out.println("nCopies(list.size(),2), newList : " + newList);
		
		/* disjoint(list, list2)는 공통된 부분이 있는지 없는지 찾는 메서드
		   공통된 요소가 하나도 없을시 true, (즉 연결된 것이 하나도 없다는 의미)
		*/
		System.out.println("disjoint : " + disjoint(list, newList));
		
		copy(list, newList); //newList값을 list에 복사
		System.out.println("copy(list, newList), newList : " + newList);
		System.out.println("copy(list, newList), list : " + list);
		
		replaceAll(list, 2, 1); //list에서 2를 1로 교체
		System.out.println("replaceAll(), list : " + list);
		
		Enumeration e = /*Collections.(생략됨)*/enumeration(list);
		/* 어떤 컬렉션 요소에 접근할수 있는 인터페이스이자 Iterator의 구버전
		   list 객체를 반복 접근 가능한 Enumeration으로 변환
		*/
		ArrayList list2 = list(e);
		System.out.println("ArrayList, list2 : " + list2);
		
	}
}
