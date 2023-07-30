package com.kook.ch15Project;

import java.io.Serializable;

//직렬화할 클래스로 Serializable을 구현해야 직렬화가 가능하다.
public class UserInfo implements Serializable {
	String name;
	String password;
	int age;
	
	public UserInfo() {
		this("unknown", "1111", 0);
	}
	
	public UserInfo(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}
	
	@Override
	public String toString() { 
		return "(" + name + "," + password + "," + age + ")"; 
	}
}
