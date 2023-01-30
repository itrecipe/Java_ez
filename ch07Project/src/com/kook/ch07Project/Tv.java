package com.kook.ch07Project;

public class Tv {
	boolean power; //전원상태 on/off, flase
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
