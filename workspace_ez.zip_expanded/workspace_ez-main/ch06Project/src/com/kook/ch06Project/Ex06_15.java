package com.kook.ch06Project;
import java.util.Arrays;

//국쌤 변형 예제(원본과 상이)
public class Ex06_15 {
	static int[] arr = new int[10];
	//클래스가 로딩될시 static멤버변수는 생성
	//클래스 로딩시 arr배열에 값을 줌
	static {
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		System.out.println("static 블록 : " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		System.out.println("main메서드 안");
		for(int x : arr) {
			System.out.print(x + ",");
		}
		System.out.println();
	}
}
