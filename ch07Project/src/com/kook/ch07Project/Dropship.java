package com.kook.ch07Project;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	
	void load() {
		//나중에 작성
		//빈 구현부도 완성된 메서드로 간주
	}
	
	void unload() {
		System.out.println("화물을 내린다");
	}
}
