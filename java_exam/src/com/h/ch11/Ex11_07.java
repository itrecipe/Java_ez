package com.h.ch11;

import java.util.*;

public class Ex11_07 {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger", "02"};
		
		Arrays.sort(strArr);
		//문자열 배열을 정렬하므로 String클래스가 구현한 Comparable
		//인터페이스의 compareTo()메서드를 따라서 정렬
		System.out.println("strArr=" + Arrays.toString(strArr)); //정렬
		/* String은 오름차순으로 정렬(코드번호를 기준으로 번호가 작은것에서 큰것으로 정렬)
		   대문자가 소문자 보다 빠르며 숫자가 대문자 보다 빠르다.
		*/
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		//CASE_INSENSITIVE_ORDER는 Comparator객체값으로 추가적인 정렬 기준(대소문자 안가림, 소문자변환)
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());
		//Descending에서 역정렬로 정의 했으므로 역정렬
		
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr,Collections.reverseOrder());
		//역정렬시 Collections.reverseOrder()메서드 사용
		System.out.println("strArr=" + Arrays.toString(strArr));
		
	}
}

class Descending implements Comparator {
	//추가적인 정렬 기준 제공 클래스
	//Comparator인터페이스가 가진 추상메서드를 구현
	@Override
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			//Comparable을 구현한 객체여야 비교 가능
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			
			//o1과 o2는 String이고 String은 Comparable의 comparaTo가 있다.
			//c1.compareTo(c2)는 오름차순 정렬
			return c1.compareTo(o2) * -1; // -1을 곱해주면 역정렬(내림차순) 수행
		}
		return -1;
	}
}