package com.h.ch03;

public class Ex03_09 {

	public static void main(String[] args) {
		int a = 1_000_000; //100만 , JDK 1.7부터는 큰 수를 읽기 쉽도록 _(언더바) 사용
		int b = 2_000_000; //200만

		long c = a * b;	//a * b = 2,000,000,000,000
		
		System.out.println(c); //결과는 오버플로우 된 값 : -1454759936 출력됨.
		//원인은 int * int -> int인데 2,000,000,000,000가 int형(약 21억 정도) 범위를 벗어남.

		long c1 = (long) a* b ; //long * long -> long
		System.out.println(c1);
	}
}