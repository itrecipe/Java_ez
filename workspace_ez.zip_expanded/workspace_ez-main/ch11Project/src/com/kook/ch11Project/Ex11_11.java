package com.kook.ch11Project;
//국.변
import java.util.*;

public class Ex11_11 {

	public static void main(String[] args) {
		// HashSet의 클래스의 객체를 add시 객체의 특정 멤버변수의 중복된 값을 피하기 위한 방법
		HashSet set = new HashSet();
		
		boolean res = set.add("abc");
		boolean res1 = set.add("abc");
		//요소가 abc로 값이 같으므로 중복되어 밑에 추가한 같은 add()메서드는 값 출력 실패

		System.out.println("res : " + res);
		System.out.println("res1 : " + res1);
		
		/* 여러개 멤버변수를 갖는 클래스의 객체를 add시 그 객체의 특정 멤버변수를 기준으로
		   중복 체크를 하기 위해선Object의 equals와 hashCode메서드를 재정의 하여 비교한다.
		   add시 equals와 hashCode메서드를 자바에서 호출하여 체크, Person객체를 add함
		   new로 생성하는 객체는 주소가 다른 객체이다.
		   equals와 HashCode를 재정의하지 않고 Object를 사용하면 무조건 멤버변수
		   값이 같더라도 저장된다.
		   멤버변수값으로 비교하려면 equals와 hashCode를 Person클래스에서 재정의
		*/
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
	
		System.out.println(set);
	}

}

class Person {
	String name;
	int age;
	
	//생성자를 생성
	Person() {
		super(); //기본생성자에서는 자동추가되니까 생략가능하나 그냥 써주었다. 알고있도록하자
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ":" + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}
		
		Person p = (Person)obj;
		
		return name.equals(p.name) && age==p.age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	/* Objects는 java.util에 있는 Object를 편리하게 처리하는 클래스
	   hash(Object ...values)는 values를 이용하여 hashCode를 만듬
	*/
		
	}
	
}