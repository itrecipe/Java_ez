package com.h.ch11;

import java.util.*;

public class Ex11Quiz {

	public static void main(String[] args) {
		//1
		ArrayList<String> cars = new ArrayList<>();
		/* ArrayList<E>λ‘? ? ?? ? ?€λ¦? ?΄??€?΄λ―?λ‘? μ°Έμ‘°?λ³?? ? ?Έκ³? ??±? ?¬?©? <?¬?©?  ?°?΄?°?>? ?¬?©
		   ?¨, 1.8λ²μ λΆ??°? ArrayList<String> cars = new ArrayList<>(); λ‘? ?¬?©κ°??₯ 
		   ? ?€λ¦?? ?¬?©? ArrayList cars?? ?????Όλ―Έν°? String?΄λ―?λ‘? Stringκ°λ§ ?¬?©κ°??₯
		*/
		
		//2
		cars.add("Volovo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia");
		
		//3
		System.out.println("3λ²? : " + cars); //Collection?? toString() ?¬? ?(?€λ²λΌ?΄?©)?¨
		
		//4
		System.out.println("4λ²? : " + cars.get(0));
		//ArratList? ?°?΄?°λ₯? λ°ν?΄μ£Όλ λ©μ?? get(int index)
		
		//5
		cars.set(0, "Opel"); //λ³?κ²½μ set(int index, λ³?κ²½κ°)
		System.out.println("5λ²? : " + cars);
		//6
		cars.remove(0); //remove(int index)
		System.out.println("6λ²? : " + cars);
		//7
		cars.clear();
		System.out.println("7λ²? : " + cars);
		//8
		cars.add("Volovo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia");
		System.out.println("8λ²? : " + cars);
		System.out.println();
		//9
		for(int i=0; i < cars.size(); i++) { //Collection κ΅¬μ±??? κ°??? size()λ‘? κ΅¬ν¨
			//System.out.println(i);
			System.out.println("9λ²? : " + cars.get(i));
		}
		System.out.println();
		
		//10
		//enhanced forλ¬Έμ? λ°°μ΄κ³? Collection? ? ?©
		for(String str : cars) {
			System.out.println("10λ²? : " + str);		
		}
		System.out.println();
		
		//11
		HashMap<String, String> capital = new HashMap<String, String>();
		
		//12
		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Thokyo");
		
		System.out.println("11, 12λ²? : " + capital);
		//Map? toString()λ₯? ?¬? ??¨
		//{Japan=Thokyo, England=London, Germany=Berlin, Korea=Seoul}
		
		//13
		System.out.println("13λ²? : " + capital.get("England"));
		//get(keyκ°?)?Όλ‘? κ·? key? ?΄?Ή?? valueκ°? λ°ν
		
		
		//14
		capital.remove("England");
		System.out.println("14λ²? : " + capital);
		
		//15
		capital.clear();
	    System.out.println("15λ²? : " + capital);
		
		//16
	    capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Thokyo");

		//17
	    //enhanced forλ¬? keyλ‘? κ΅¬μ±? Setκ°μ²΄λ₯? ?»?΄? keyλ₯? λ°λ³΅??¬ ?»?΄?
	    for(String key : capital.keySet()) {
	    	//keySet()?? keyλ‘? κ΅¬μ±? Setλ₯? λ°ν
			System.out.println("17λ²? : " + key + "capital value κ°? : " + capital.get(key));
		}
		System.out.println();
		
		//18
		Iterator<String> it = cars.iterator();
		
		//19
		while(it.hasNext()) {
			System.out.println("19λ²? : " + it.next());
		}
	}
}

/* 1.ArrayListκ°μ²΄ carsλ₯? λ§λ??° ? ?€λ¦??Όλ‘? String?΄??€λ₯? ?¬?©
   2.cars κ°μ²΄? Volovo,BMW,Ford,Kiaλ₯? μΆκ?
   3.carsκ°μ²΄λ₯? ?λ¦°νΈ
   4.μ²«λ²μ§? ???₯? ??λ₯? λ°ν?? λ©μ?λ₯? ?΄?©??¬ μΆλ ₯
   5.μ²«λ²μ§? ??λ₯? Opelλ‘? λ³?κ²½νκ³? μΆλ ₯
   6.μ²«λ²μ§? ??λ₯? ? κ±°νκ³? μΆλ ₯
   7.λͺ¨λ  ??λ₯? ? κ±°νκ³? μΆλ ₯
   8.cars? ?€? 2λ²? μΆκ?
   9.κΈ°λ³Έ forλ¬ΈμΌλ‘? cars? κ°? ??λ₯? μΆλ ₯
   10.enhanced forλ¬ΈμΌλ‘? cars? κ°? ??λ₯? μΆλ ₯
   11.HashMapκ°μ²΄ capital? λ§λ??° ? ?€λ¦?? ?¬?© key? String, 
      value? String?Έ ? ?€λ¦? <String, String>? ?¬?©
   12.England? London, Korea? Seoul, Germany? Berlin, Japan?? Tokyoλ₯? capital? μΆκ?
      ?κ³? print(??Όλͺμ keyλ‘? ?¬?©)
   13.England? valueλ₯? ?»?΄? μΆλ ₯
   14.keyκ°? England?Έ ?? ?­? ? print
   15.λͺ¨λ  ?? ?­? ?κ³? print
   16.capitalκ°μ²΄? ?€? 12λ²? μΆκ?
   17.forλ¬ΈμΌλ‘? key setλ₯? ?»?΄ ?΄?Ή ?€ κ°μ ?΄?©?΄ valueλ₯? print, keySet()?¬?©
   18.carsκ°μ²΄? Iteratorκ°μ²΄ it ??±
   19.itλ₯? ?΄?©?΄ cars? ???₯? κ°? μΆλ ₯
*/
