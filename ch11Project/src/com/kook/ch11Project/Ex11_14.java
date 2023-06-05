package com.kook.ch11Project;
//국.변
import java.util.*;

public class Ex11_14 {

	public static void main(String[] args) {
		// TreeSet 메서드
		TreeSet set = new TreeSet();

		String from = "b";
		String to = "d";
		
		set.add("car");
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("fan");
		set.add("flower");
		
		System.out.println("set의 원소수 : " + set.size());
		System.out.println(set); //Set는 toStrong()이 재정의(오버라이딩) 됨
		System.out.println("범위 검색 : from : " + from + " to " + to);
		SortedSet ss = set.subSet(from, to);
		/* public SortedSet<E> subSet(E fromElement, E toElement)
		   subSet메서드는 SortedSet을 반환
		   from부터 to앞까지 선택하여 SortedSet으로 반환
		   TreeSet은 인터페이스 SortedSet를 구현함
		   정렬 순서는 숫자, 대문자, 소문자 순서
		*/
		System.out.println(ss);

		SortedSet ss1 = set.subSet(from, to + "zzz"); //b부터 dzzz
		System.out.println(ss1);
	}
}