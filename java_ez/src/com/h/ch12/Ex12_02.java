package com.h.ch12;
//국.변
import java.util.*;

public class Ex12_02 {

	public static void main(String[] args) {
		//LIST객체의 데이터 요소는 Student객체이다.
		ArrayList<Student> list = new ArrayList<Student>();
		/* ArrayList의 멤버(변수,메서드) 중 지네릭을 사용하느 모든 것은 Student를 지네릭으로 사용
		   대표적인 메서드 public boolean add(E e)도 지네릭 E를 사용하므로 여기선 Student를 사용
		*/
		list.add(new Student("자바왕",1,1));
		list.add(new Student("자바짱",1,2));
		list.add(new Student("홍길동",2,1));
		//list.add("kook"); -> Student객체가 아닌 문자열을 사용하면 에러
		
		Iterator<Student> it = list.iterator();
		//Iterator도 제네릭 인터페이스이므로 이를 생성하는 list객체의 제네릭 파라미터를 사용하여 선언한다.
		//Interface Iterator<E>
		while(it.hasNext()) {
			Student s = it.next(); //Student객체 s는 제네릭을 사용한다면 형변환이 필요없다
			//E next()
			System.out.println(s.name);
		}
		
		HashMap<String, Student> map = new HashMap<String, Student>();
		/* public class HashMap<K, V>
		   K는 String, V는 Student
		   public V put(K key, V value) 바노한은 앞의 값을 반환한다.
		   참조변수 선언과 객체 생성시 사용한 타입 파라미터로 메서드의 파라미터가 바뀐다,
		*/
		Student s0 = map.put("stu1", new Student("자바0", 1, 1));
		Student s1 = map.put("stu1", new Student("자바1", 1, 1));
		Student s2 = map.put("stu1", new Student("자바2", 1, 1));
	}
}

class Student {
	//멤버변수가 인스턴스형, 접근제어자는 default로 동일한 패키지에선 어디서나 접근가능하다.
	String name = "";
	int ban; //초기값 0
	int no; //초기값 0
	
	Student() {
		super();
	}
	
	Student(String name, int ban, int no) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}