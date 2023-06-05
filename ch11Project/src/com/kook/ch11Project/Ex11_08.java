package com.kook.ch11Project;
//국.변
import java.util.*;

public class Ex11_08 {

	public static void main(String[] args) {
		Integer[] arr = { 30, 50, 10, 40, 20 };
		//기본형을 자신의 wrapper클래스인 Integer로 변환은 오토박싱으로 자동처리됨
		
		Arrays.sort(arr);
		/* sort시에는 wrapper클래스인 Integer 클래스가 구현한 Comparable의 
		   CompareTo에 의해 정렬값에 의해 오름차순으로 정렬
		*/
		System.out.println(Arrays.toString(arr));
		
		//역정렬(내림차순)으로 정렬
		Arrays.sort(arr, Collections.reverseOrder());
		//Ex11_07 내용처럼 추가로 Descending클래스를 만들어 사용
		System.out.println(Arrays.toString(arr));
	}

}