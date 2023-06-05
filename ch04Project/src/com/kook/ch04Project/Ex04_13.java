package com.kook.ch04Project;

public class Ex04_13 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(sum <= 100) {	//sum이 100보다 커지면 반복 중단
			System.out.printf("%d - %d%n", i, sum);
			sum += i++;
		}
	}
}