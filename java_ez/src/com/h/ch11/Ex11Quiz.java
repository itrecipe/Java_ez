package com.h.ch11;

import java.util.*;

public class Ex11Quiz {

	public static void main(String[] args) {
		//1
		ArrayList<String> cars = new ArrayList<>();
		/* ArrayList<E>�? ?��?��?�� ?��?���? ?��?��?��?���?�? 참조?���??�� ?��?���? ?��?��?�� ?��?��?�� <?��?��?�� ?��?��?��?��>?�� ?��?��
		   ?��, 1.8버전�??��?�� ArrayList<String> cars = new ArrayList<>(); �? ?��?���??�� 
		   ?��?���??�� ?��?��?�� ArrayList cars?��?�� ???��?��?��미터?�� String?���?�? String값만 ?��?���??��
		*/
		
		//2
		cars.add("Volovo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia");
		
		//3
		System.out.println("3�? : " + cars); //Collection?? toString() ?��?��?��(?��버라?��?��)?��
		
		//4
		System.out.println("4�? : " + cars.get(0));
		//ArratList?�� ?��?��?���? 반환?��주는 메서?��?�� get(int index)
		
		//5
		cars.set(0, "Opel"); //�?경시 set(int index, �?경값)
		System.out.println("5�? : " + cars);
		//6
		cars.remove(0); //remove(int index)
		System.out.println("6�? : " + cars);
		//7
		cars.clear();
		System.out.println("7�? : " + cars);
		//8
		cars.add("Volovo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia");
		System.out.println("8�? : " + cars);
		System.out.println();
		//9
		for(int i=0; i < cars.size(); i++) { //Collection 구성?��?��?�� �??��?�� size()�? 구함
			//System.out.println(i);
			System.out.println("9�? : " + cars.get(i));
		}
		System.out.println();
		
		//10
		//enhanced for문�? 배열�? Collection?�� ?��?��
		for(String str : cars) {
			System.out.println("10�? : " + str);		
		}
		System.out.println();
		
		//11
		HashMap<String, String> capital = new HashMap<String, String>();
		
		//12
		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Thokyo");
		
		System.out.println("11, 12�? : " + capital);
		//Map?�� toString()�? ?��?��?��?��
		//{Japan=Thokyo, England=London, Germany=Berlin, Korea=Seoul}
		
		//13
		System.out.println("13�? : " + capital.get("England"));
		//get(key�?)?���? �? key?�� ?��?��?��?�� value�? 반환
		
		
		//14
		capital.remove("England");
		System.out.println("14�? : " + capital);
		
		//15
		capital.clear();
	    System.out.println("15�? : " + capital);
		
		//16
	    capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Thokyo");

		//17
	    //enhanced for�? key�? 구성?�� Set객체�? ?��?��?�� key�? 반복?��?�� ?��?��?��
	    for(String key : capital.keySet()) {
	    	//keySet()?? key�? 구성?�� Set�? 반환
			System.out.println("17�? : " + key + "capital value �? : " + capital.get(key));
		}
		System.out.println();
		
		//18
		Iterator<String> it = cars.iterator();
		
		//19
		while(it.hasNext()) {
			System.out.println("19�? : " + it.next());
		}
	}
}

/* 1.ArrayList객체 cars�? 만드?��?�� ?��?���??���? String?��?��?���? ?��?��
   2.cars 객체?�� Volovo,BMW,Ford,Kia�? 추�?
   3.cars객체�? ?��린트
   4.첫번�? ???��?�� ?��?���? 반환?��?�� 메서?���? ?��?��?��?�� 출력
   5.첫번�? ?��?���? Opel�? �?경하�? 출력
   6.첫번�? ?��?���? ?��거하�? 출력
   7.모든 ?��?���? ?��거하�? 출력
   8.cars?�� ?��?�� 2�? 추�?
   9.기본 for문으�? cars?�� �? ?��?���? 출력
   10.enhanced for문으�? cars?�� �? ?��?���? 출력
   11.HashMap객체 capital?�� 만드?��?�� ?��?���??�� ?��?�� key?�� String, 
      value?�� String?�� ?��?���? <String, String>?�� ?��?��
   12.England?�� London, Korea?�� Seoul, Germany?�� Berlin, Japan?? Tokyo�? capital?�� 추�?
      ?���? print(?��?��명을 key�? ?��?��)
   13.England?�� value�? ?��?��?�� 출력
   14.key�? England?�� ?��?�� ?��?��?�� print
   15.모든 ?��?�� ?��?��?���? print
   16.capital객체?�� ?��?�� 12�? 추�?
   17.for문으�? key set�? ?��?�� ?��?�� ?�� 값을 ?��?��?�� value�? print, keySet()?��?��
   18.cars객체?�� Iterator객체 it ?��?��
   19.it�? ?��?��?�� cars?�� ???��?�� �? 출력
*/
