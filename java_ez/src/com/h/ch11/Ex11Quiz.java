package com.h.ch11;

import java.util.*;

public class Ex11Quiz {

	public static void main(String[] args) {
		//1
		ArrayList<String> cars = new ArrayList<>();
		/* ArrayList<E>ë¡? ? •?˜?œ ? œ?„¤ë¦? ?´?˜?Š¤?´ë¯?ë¡? ì°¸ì¡°?˜•ë³??ˆ˜ ?„ ?–¸ê³? ?ƒ?„±? ?‚¬?š©?‹œ <?‚¬?š©?•  ?°?´?„°?˜•>?„ ?‚¬?š©
		   ?‹¨, 1.8ë²„ì „ë¶??„°?Š” ArrayList<String> cars = new ArrayList<>(); ë¡? ?‚¬?š©ê°??Š¥ 
		   ? œ?„¤ë¦??„ ?‚¬?š©?•œ ArrayList cars?—?Š” ???…?ŒŒ?¼ë¯¸í„°?Š” String?´ë¯?ë¡? Stringê°’ë§Œ ?‚¬?š©ê°??Š¥
		*/
		
		//2
		cars.add("Volovo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia");
		
		//3
		System.out.println("3ë²? : " + cars); //Collection?? toString() ?¬? •?˜(?˜¤ë²„ë¼?´?”©)?¨
		
		//4
		System.out.println("4ë²? : " + cars.get(0));
		//ArratList?˜ ?°?´?„°ë¥? ë°˜í™˜?•´ì£¼ëŠ” ë©”ì„œ?“œ?Š” get(int index)
		
		//5
		cars.set(0, "Opel"); //ë³?ê²½ì‹œ set(int index, ë³?ê²½ê°’)
		System.out.println("5ë²? : " + cars);
		//6
		cars.remove(0); //remove(int index)
		System.out.println("6ë²? : " + cars);
		//7
		cars.clear();
		System.out.println("7ë²? : " + cars);
		//8
		cars.add("Volovo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia");
		System.out.println("8ë²? : " + cars);
		System.out.println();
		//9
		for(int i=0; i < cars.size(); i++) { //Collection êµ¬ì„±?š”?†Œ?˜ ê°??ˆ˜?Š” size()ë¡? êµ¬í•¨
			//System.out.println(i);
			System.out.println("9ë²? : " + cars.get(i));
		}
		System.out.println();
		
		//10
		//enhanced forë¬¸ì? ë°°ì—´ê³? Collection?— ? ?š©
		for(String str : cars) {
			System.out.println("10ë²? : " + str);		
		}
		System.out.println();
		
		//11
		HashMap<String, String> capital = new HashMap<String, String>();
		
		//12
		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Thokyo");
		
		System.out.println("11, 12ë²? : " + capital);
		//Map?„ toString()ë¥? ?¬? •?˜?•¨
		//{Japan=Thokyo, England=London, Germany=Berlin, Korea=Seoul}
		
		//13
		System.out.println("13ë²? : " + capital.get("England"));
		//get(keyê°?)?œ¼ë¡? ê·? key?— ?•´?‹¹?•˜?Š” valueê°? ë°˜í™˜
		
		
		//14
		capital.remove("England");
		System.out.println("14ë²? : " + capital);
		
		//15
		capital.clear();
	    System.out.println("15ë²? : " + capital);
		
		//16
	    capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Thokyo");

		//17
	    //enhanced forë¬? keyë¡? êµ¬ì„±?œ Setê°ì²´ë¥? ?–»?–´?„œ keyë¥? ë°˜ë³µ?•˜?—¬ ?–»?–´?ƒ„
	    for(String key : capital.keySet()) {
	    	//keySet()?? keyë¡? êµ¬ì„±?œ Setë¥? ë°˜í™˜
			System.out.println("17ë²? : " + key + "capital value ê°? : " + capital.get(key));
		}
		System.out.println();
		
		//18
		Iterator<String> it = cars.iterator();
		
		//19
		while(it.hasNext()) {
			System.out.println("19ë²? : " + it.next());
		}
	}
}

/* 1.ArrayListê°ì²´ carsë¥? ë§Œë“œ?Š”?° ? œ?„¤ë¦??œ¼ë¡? String?´?˜?Š¤ë¥? ?‚¬?š©
   2.cars ê°ì²´?— Volovo,BMW,Ford,Kiaë¥? ì¶”ê?
   3.carsê°ì²´ë¥? ?”„ë¦°íŠ¸
   4.ì²«ë²ˆì§? ???¥?œ ?š”?†Œë¥? ë°˜í™˜?•˜?Š” ë©”ì„œ?“œë¥? ?´?š©?•˜?—¬ ì¶œë ¥
   5.ì²«ë²ˆì§? ?š”?†Œë¥? Opelë¡? ë³?ê²½í•˜ê³? ì¶œë ¥
   6.ì²«ë²ˆì§? ?š”?†Œë¥? ? œê±°í•˜ê³? ì¶œë ¥
   7.ëª¨ë“  ?š”?†Œë¥? ? œê±°í•˜ê³? ì¶œë ¥
   8.cars?— ?‹¤?‹œ 2ë²? ì¶”ê?
   9.ê¸°ë³¸ forë¬¸ìœ¼ë¡? cars?˜ ê°? ?š”?†Œë¥? ì¶œë ¥
   10.enhanced forë¬¸ìœ¼ë¡? cars?˜ ê°? ?š”?†Œë¥? ì¶œë ¥
   11.HashMapê°ì²´ capital?„ ë§Œë“œ?Š”?° ? œ?„¤ë¦??„ ?‚¬?š© key?„ String, 
      value?„ String?¸ ? œ?„¤ë¦? <String, String>?„ ?‚¬?š©
   12.England?Š” London, Korea?Š” Seoul, Germany?Š” Berlin, Japan?? Tokyoë¥? capital?— ì¶”ê?
      ?•˜ê³? print(?‚˜?¼ëª…ì„ keyë¡? ?‚¬?š©)
   13.England?˜ valueë¥? ?–»?–´?„œ ì¶œë ¥
   14.keyê°? England?¸ ?š”?†Œ ?‚­? œ?›„ print
   15.ëª¨ë“  ?š”?†Œ ?‚­? œ?•˜ê³? print
   16.capitalê°ì²´?— ?‹¤?‹œ 12ë²? ì¶”ê?
   17.forë¬¸ìœ¼ë¡? key setë¥? ?–»?–´ ?•´?‹¹ ?‚¤ ê°’ì„ ?´?š©?•´ valueë¥? print, keySet()?‚¬?š©
   18.carsê°ì²´?˜ Iteratorê°ì²´ it ?ƒ?„±
   19.itë¥? ?´?š©?•´ cars?— ???¥?œ ê°? ì¶œë ¥
*/
