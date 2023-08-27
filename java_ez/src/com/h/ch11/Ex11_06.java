package com.h.ch11;
//국.변
import java.util.*;

public class Ex11_06 {

	public static void main(String[] args) {
		//Arrays클래스의 메서드(static)
		int[] arr = {1,2,3,4,5}; //1차원 배열
		int[][] arr2D = {{11,12,13},{21,22,23}}; //2차원 배열
		
		System.out.println("arr = " + Arrays.toString(arr));
		//Arrays.toString()의 파라미터로는 기본형 배열, 참조형 배열 모두 사용가능
		System.out.println("Object의 toString() :" + arr.toString());
		//오버라이딩이 안되서 [I@5e91993f <- 번지로 출력됨
		System.out.println("arr2D = " + Arrays.toString(arr2D));
		//2차원 배열을 toString()사용하면 주소값을 출력
		System.out.println("arr2D = " + Arrays.deepToString(arr2D));
		//2차원 이상의 문자열 변환은 Arrays.deepToString(2차원이상 배열명)
		
		/* copyOf(처음, 두번째)는 1번째 파라미터의 배열을 2번째 파라미터로 지정한 크기로 복사하여 
		   복사된 배열을 반환
		*/
		int[] arr2 = Arrays.copyOf(arr, arr.length); //arr전체를 복사하여 arr2에 복사
		int[] arr3 = Arrays.copyOf(arr, 3); //arr에서 앞에서 3개를 복사해 arr3에 복사
		int[] arr4 = Arrays.copyOf(arr, 7); 
		//arr이 뒤에 복사할 숫자보다 작으면 나머지는 기본값으로 채움
		
		//배열 원소의 범위를 지정할시 copyOfRange(대상배열, 시작색인번호, 종료색인번호)
		int[] arr5 = Arrays.copyOfRange(arr4, 2, 4);
		//2는 시작색인번호 4는 종료색인번호 실제 카피 범위는 2번부터 4-1번까지 수행
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); //대상배열 범위 이상은 기본값으로 채움
		
		System.out.println();
		System.out.println("arr2=" + Arrays.toString(arr2));
		System.out.println("arr3=" + Arrays.toString(arr3));
		System.out.println("arr4=" + Arrays.toString(arr4));
		System.out.println("arr5=" + Arrays.toString(arr5));
		System.out.println("arr6=" + Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); //arr7배열을 모두 9로 채움
		System.out.println("arr7=" + Arrays.toString(arr7));
		
		//setAll(배열명, 람다식 or 함수형인터페이스구현 객체)은 모든 원소를 채움
		Arrays.setAll(arr7, (i) -> (int)(Math.random() * 6) + 1);
		System.out.println("arr7=" + Arrays.toString(arr7));
	
		for(int x : arr7) {
			char[] graph = new char[x];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph) + x);
		}
		
		String[][] str2D = new String[][] {{"aaa"}, {"bbb"}, {"AAA"}, {"BBB"}};
		String[][] str2D2 = new String[][] {{"aaa"}, {"bbb"}, {"AAA"}, {"BBB"}};
		//2차원배열 값 비교는 deepEquals로 한다
		System.out.println(Arrays.equals(str2D, str2D2)); //1차원배열 equals사용 false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); //2차원배열 비교 true
		
		char[] chArr = { 'A', 'D', 'C', 'B', 'E' };
		System.out.println("chArr=" + Arrays.toString(chArr));
		//toString(모든기본형배열, 참조형 배열)
		//binarySearch(chArr, 'B')는 chArr배열에서 2진 검색법으로 B를 찾아 색인번호 반환
		//정렬후에 사용해야만 함
		System.out.println("정렬전 index of B =" + Arrays.binarySearch(chArr, 'B'));
		
		Arrays.sort(chArr); //sort는 오름차순 정렬(문자열은 숫자, 대문자, 소문자 -> 이런 방식으로 정렬됨)

		System.out.println("정렬후 chArr=" + Arrays.toString(chArr));
		
		System.out.println("정렬후 index of B =" + Arrays.binarySearch(chArr, 'B'));
	}
}