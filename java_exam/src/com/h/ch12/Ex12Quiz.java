package com.h.ch12;

import java.util.*;

public class Ex12Quiz {

	//1
	enum Level {
		LOW,MEDIUM,HIGH
	}
	
	public static void main(String[] args) {
	//2.
	Level myVar = Level.MEDIUM;
	
	//3
	System.out.println("3번 : " + myVar);
	
	System.out.println();
	
	//4
	switch(myVar) {
		case LOW : //case문에서는 상수명만 사용가능
			System.out.println("4번 : LOW 출력");
			break;
		case MEDIUM :
			System.out.println("4번 : MEDIUM 출력");
			break;
		case HIGH :
			System.out.println("4번 : HIGH 출력");
			break;
		default : 
			break;
	}
	
	System.out.println();
	
	//5
	Level[] myArr = Level.values();
	
	for(Level l : myArr) {
		System.out.println("enhanced for 5번 : ");
		System.out.printf("%s=%d%n", l.name(), l.ordinal());
	}
	
	System.out.println();
	
	//6
	ArrayList<String> cars = new ArrayList<>();
	cars.add("QM6");
	cars.add("트라제XG");
	System.out.println("6번 : " + cars);
	
	System.out.println();
	
	//7
	LinkedList<String> cars1 =  new LinkedList<>();
	cars1.add("스포티지");
	cars1.add("xc90");
	cars1.add(0, "sonata");
	cars1.add(3, "santafe");
	System.out.println("7번 : " + cars1);

	System.out.println();

/* 7번은 이렇게도 풀 수 있다. (다른 코드)
	LinkedList<String> cars1 = new LinkedList<String>();
	cars1.add("스포티지");
	cars1.add("xc90");
	cars1.add("sonata");
	cars1.add("santafe");

	System.out.println("   "+cars1.getFirst());
	System.out.println("   "+cars1.getLast());
*/
	
	//8
	HashMap<String, Integer> people = new HashMap<String, Integer>();
	people.put("Q-Ran", 2020); //Integer객체는 기본형 int를 사용하면 자동 박싱이 되어 Integer가 됨
	people.put("H", 29);
	System.out.println("8번 : " + people);
	
	System.out.println();
	
	//9
	for(String key : people.keySet()) {
		System.out.println("9번 : " + key + " (key값) : " + people.get(key));
	}
	
	System.out.println();
	
	//10
	HashSet<Integer> numbers = new HashSet<>();
	numbers.add(4);
	numbers.add(7);
	
	//내코드
	for(int i=1; i <= 10; i++) {
	
	if(numbers.contains(i)) {
		System.out.println("10-1번 i값 있을시 : " + i);			
	}		
	else {
		System.out.println("10-2번 i값 없을시 : " + i);
	}
}
	System.out.println();
	
	//(다른 코드) 10번 이렇게도 풀 수 있음
	for(int j = 1; j <= 10; j++) {
		if(numbers.contains(j))  {
			System.out.println("10번(다른코드) : 갖고 있는 수: "+ j);
		}
		else {
			System.out.println("10번(다른코드) : 안 갖고 있는 수 : " + j);
		}
	}
	
	System.out.println();
	
	//11
	Iterator<String> it = cars.iterator();
	
	while(it.hasNext()) {
		System.out.println("11번 : " + it.next());
	}
	
	System.out.println();
	
	//(다른 코드)11번 이렇게도 풀 수 있다.
	Iterator it1 = cars.iterator();
	while (it1.hasNext()) {
		String str = (String) it1.next();
		System.out.println("11번 : " + str);
	}
	
	}
	
   }

/* 1. 열거형 Level을 만들고 구성 상수는 LOW,MEDIUM,HIGH로 한다.
   2. main메서드 안에서 Level객체 myVar을 만들고 값은 MEDIUM을 대입한다.
   3. myVar객체를 프린트 한다.
   4. myVar객체를 파라미터로 하는 swithc문을 만든다. 각 case별 LOW,MEDIUM,HIGH 출력
   5. enhanced for문을 이용해 enum Level의 각 상수값을 출력 해본다.
   6. 대입파라미터가 String인 ArrayList객체 cars를 만든다음 2개 값을 추가 해보자
   7. 대입파라미터가 String인 LinkedList객체 cars1을 만든 다음 2개 값을 추가 해본다.
   	  cars1의 첫번째 요소로 sonata를 추가한뒤 마지막 요소로 santafe를 추가한다.
   	  cars1의 첫번째와 마지막 요소를 구해본다. 
   8. 대입파라미터(지네릭사용)가 String과 Integer인 HashMap객체 people을 
      만들고 2개값을 추가해본다.(이름,나이)
   9. enhanced for문을 이용해 key Set를 구한 다음 key로 값을 구해서 출력 해본다.
   10.대입파라미터(지네릭) Integer인 HashSet객체 numbers를 만들고 2개 값을 추가한다.(4와 7)
      for문을 반복값 i로 1부터 10까지 반복하면서 numbers가 i값을 갖고 있으면 갖고 있음 + i를 출력하고,
      없으면 안갖고 있음 + i를 출력
   11. 6번 cars객체를 이용한 Iterator객체 it를 만들되, 대입타입변수를 이용하여 만든다.
   	   it를 이용해 cars의 요소들을 출력 해보자 
*/