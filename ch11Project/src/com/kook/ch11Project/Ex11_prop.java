package com.kook.ch11Project;

import java.util.*;
//교재에 없는 내용-국쌤예제
public class Ex11_prop {

	public static void main(String[] args) {
		/* Propertise사용
		   HashTable을 이용하므로 Map처럼 사용
		   단 key와 value가 String, String
		*/
		Properties prop = new Properties();
		
		//setProperty(String key, String value)
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "Korean");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		//보통 Properties는 외부 파일에 저장

	}

}
