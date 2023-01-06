package com.kook.ch07Project;

public class Tv {
	boolean power; //기본값은 flase
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
