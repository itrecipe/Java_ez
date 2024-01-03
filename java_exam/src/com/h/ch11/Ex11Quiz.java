package com.h.ch11;

import java.util.*;

public class Ex11Quiz {

	public static void main(String[] args) {
		//1
		ArrayList<String> cars = new ArrayList<>();
		/* ArrayList<E>로 정의된 제네릭 클래스이므로 참조형변수 선언과 생성자 사용시 <사용할 데이터형>을 사용
		   단, 1.8버전부터는 ArrayList<String> cars = new ArrayList<>(); 로 사용가능 
		   제네릭을 사용한 ArrayList cars에는 대입파라미터는 String이므로 String값만 사용가능
		*/
		
		//2
		cars.add("Volovo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia");
		
		//3
		System.out.println("3번 : " + cars); //Collection은 toString() 재정의(오버라이딩)됨
		
		//4
		System.out.println("4번 : " + cars.get(0));
		//ArratList의 데이터를 반환해주는 메서드는 get(int index)
		
		//5
		cars.set(0, "Opel"); //변경시 set(int index, 변경값)
		System.out.println("5번 : " + cars);
		//6
		cars.remove(0); //remove(int index)
		System.out.println("6번 : " + cars);
		//7
		cars.clear();
		System.out.println("7번 : " + cars);
		//8
		cars.add("Volovo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia");
		System.out.println("8번 : " + cars);
		System.out.println();
		//9
		for(int i=0; i < cars.size(); i++) { //Collection 구성요소의 갯수는 size()로 구함
			//System.out.println(i);
			System.out.println("9번 : " + cars.get(i));
		}
		System.out.println();
		
		//10
		//enhanced for문은 배열과 Collection에 적용
		for(String str : cars) {
			System.out.println("10번 : " + str);		
		}
		System.out.println();
		
		//11
		HashMap<String, String> capital = new HashMap<String, String>();
		
		//12
		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Thokyo");
		
		System.out.println("11, 12번 : " + capital);
		//Map도 toString()를 재정의함
		//{Japan=Thokyo, England=London, Germany=Berlin, Korea=Seoul}
		
		//13
		System.out.println("13번 : " + capital.get("England"));
		//get(key값)으로 그 key에 해당하는 value값 반환
		
		
		//14
		capital.remove("England");
		System.out.println("14번 : " + capital);
		
		//15
		capital.clear();
	    System.out.println("15번 : " + capital);
		
		//16
	    capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Thokyo");

		//17
	    //enhanced for문 key로 구성된 Set객체를 얻어서 key를 반복하여 얻어냄
	    for(String key : capital.keySet()) {
	    	//keySet()은 key로 구성된 Set를 반환
			System.out.println("17번 : " + key + "capital value 값 : " + capital.get(key));
		}
		System.out.println();
		
		//18
		Iterator<String> it = cars.iterator();
		
		//19
		while(it.hasNext()) {
			System.out.println("19번 : " + it.next());
		}
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
   12.England는 London, Korea는 Seoul, Germany는 Berlin, Japan은 Tokyo를 capital에 추가
      하고 print(나라명을 key로 사용)
   13.England의 value를 얻어서 출력
   14.key가 England인 요소 삭제후 print
   15.모든 요소 삭제하고 print
   16.capital객체에 다시 12번 추가
   17.for문으로 key set를 얻어 해당 키 값을 이용해 value를 print, keySet()사용
   18.cars객체의 Iterator객체 it 생성
   19.it를 이용해 cars에 저장된 값 출력
*/
