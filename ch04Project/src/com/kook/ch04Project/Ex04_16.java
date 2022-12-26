package com.kook.ch04Project;

public class Ex04_16 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break; 
				//자신이 속한 반복문을 나옴(break문은 for,while,do while,switch문 에서 사용가능)
			++i;
			sum += i;
		}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);

	}
}
