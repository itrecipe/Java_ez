package com.h.test;

public class JavaTestClass {

	public static void main(String[] args) {
		Tv t = null;
		System.out.println(t);
		
		t = new Tv();
		
		Tv t1 = new Tv();
		System.out.println(t1);
		
		t.channel = 6;
		t1.channel = 7;
		
		t.channelDown();
		t1.channelDown();
		System.out.println("���� ä�� t : " + t.channel + " �̴�.");
		System.out.println("���� ä�� t1 : " + t1.channel + " �̴�.");
		
	}

}

class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}

}