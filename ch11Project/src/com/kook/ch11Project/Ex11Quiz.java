package com.kook.ch11Project;

import java.util.*;

public class Ex11Quiz {

	public static void main(String[] args) {
		//1
		ArrayList<String> cars = new ArrayList<>();
		//2
		cars.add("Volovo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia");
		//3
		System.out.println("3 : " + cars);
		//4
		System.out.println("4 : " + cars.get(0));
		//5
		cars.set(0, "Opel");
		System.out.println("5 : " + cars);
		//6
		cars.remove(0); 
		System.out.println("6 : " + cars);
		//7
		cars.clear();
		System.out.println("7 : " + cars);
		//8
		//cars.
	}
}

/* 1.ArrayList객체 cars를 만드는데 제네릭으로 String클래스를 사용
   2.cars 객체에 Volovo,BMW,Ford,Kia를 추가
   3.cars객체를 프린트
   4.첫번째 저장된 요소를 반환하는 메서드를 이용하여 출력
   5.첫번째 요소를 Opel로 변경하고 출력
   6.첫번째 요소를 제거하고 출력
   7.모든 요소를 제거하고 출력
   8.cars에 다시 2번 추가
   9.기본 for문으로 cars의 각 요소를 출력
   10.enhanced for문으로 cars의 각 요소를 출력
   11.HashMap객체 capital을 만드는데 제네릭을 사용 key도 String, 
      value도 String인 제네릭 <String, String>을 사용
   12.England는 London, Korea는 Seoul, Germany, Berlin, Japan은 Tokyo를 capital에 추가
      하고 print(나라명을 key로 사용)
   13.England의 value를 얻어서 출력
   14.key가 England인 요소 삭제후 print
   15.모든 요소 삭제하고 print
   16.capital객체에 다시 12번 추가
   17.for문으로 key set를 얻어 해당 키 값을 이용해 value를 print, keySet()사용
   18.cars객체의 Iterator객체 it 생성
   19.it를 이용해 cars에 저장된 값 출력
   
*/