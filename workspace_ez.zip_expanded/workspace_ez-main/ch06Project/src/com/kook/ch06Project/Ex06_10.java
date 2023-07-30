package com.kook.ch06Project;
//국썜 변형 예제
public class Ex06_10 {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		//호출 시 오버로딩된 메서드의 파라미터에 맞추어 호출
		System.out.println(mm.add(3,3));
		System.out.println(mm.add(3,3L));
		System.out.println(mm.add(3L,3));
		System.out.println(mm.add(3L,3L));
		
		int[] a = {1,2,3};
		
		System.out.println("===========================");
		System.out.println("요소 개수 : " + mm.add(a));
	}
}

class MyMath3{
	int add(int a, int b) { //개수 2개 데이터형은 둘다 int
		return a + b;
	}

	long add(int a, long b) { //파라미터 개수 2개, b의 데이터형이 다름
		return a + b;
	}

	long add(long a, int b) { //파라미터 개수 2개, a의 데이터형이 다름
		return a + b;
	}
	long add(long a, long b) { //파라미터 개수 2개, 데이터형이 모두 long
		return a + b;
	}
	
	int add(int[] a) {
		for(int x : a) {
			System.out.println(x);
		}
			return a.length;
	}
}