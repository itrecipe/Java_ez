package com.kook.ch11Project;

import java.util.*;

public class Ex11_18 {

	public static void main(String[] args) {
		//key로 사용할 예정
		//중복되지 않은 key는 value를 1로 중복되면 value를 1증가
		String[] data = {"A","K","A","K","D","A","K","K","K","Z","D"};
		HashMap map = new HashMap();
		
		for(int i=0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				//containsKey(key)는 (포함되는 key가 있는지), key존재여부 파악(있으면 true)
				int value = (int)map.get(data[i]); //get(key)는 key에 속한 value반환
				map.put(data[i], value + 1);
				//map은 기존의 key가 있으면 그 값만 바꾼다.
			}
			else { 
				map.put(data[i], 1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		//map.entrySet()로 Set로 변환하고 Set의 iterator()로 it를 만들었다.
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			String key = (String)entry.getKey();
			
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	} //main
	
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i < bar.length; i++)
			bar[i] = ch;			
		
		return new String(bar);
		
	}
}