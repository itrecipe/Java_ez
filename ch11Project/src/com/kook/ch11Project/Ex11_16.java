package com.kook.ch11Project;

import java.util.*;

public class Ex11_16 {

	public static void main(String[] args) {
		// HashMap
		HashMap map = new HashMap();
		//public class HashMap<K,V>
		
		map.put("myId","1234");
		/* HashMap에 map객체에 값을 집어 넣을때는 put()사용
		   public V put(K key, V value)
		   put메서드는 제네릭을 이용한 key와 value파라미터를 사용
		   반환은 V객체를 반환
		   K는 key의 데이터형인데 이름이므로 거의 String형이다.
		*/
		map.put("asdf","1111");
		map.put("asdf","1234");
		/* key는 중복이 안되므로 동일한 key값이 존재하면 기존의 key의 value(값)을 업데이트 한다. 
		   key가 다르면 value(값)은 중복 해도 된다.
		*/
		
		System.out.println(map); //HashMap도 toString()이 재정의(오버라이딩)됨
		//{myId=1234, asdf=1234}
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해라!");
			System.out.print("id :");
			String id = s.nextLine().trim(); 
			//trim()은 문자열 앞뒤 공백 제거, 입력한 값을 key로 사용할 예정
			System.out.print("password :");
			String password = s.nextLine().trim(); //입력한 값을 value(값)으로 사용
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력한 id는 존재하지 않으니 다시 입력해라!!");
				continue; //다음반복 절차로 이동해야하니 continue; 사용
			}
			
			if(!map.get(id).equals(password)) {
				//get(key)는 key에 해당하는 value를 반환
				System.out.println("비밀번호가 일치하지 않으니 다시 입력해라!!!");
				continue;
			}
			else {
				System.out.println("id와 비밀번호가 일치함!");
				break;
			}
			
		}
	}

}
