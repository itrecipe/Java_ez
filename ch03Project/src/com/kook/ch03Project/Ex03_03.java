package com.kook.ch03Project;

public class Ex03_03 {

	public static void main(String[] args) {
		int i=5 , j=5;
		
		System.out.println(i++); //후위 증가 연산자 : 선처리 후 증가 
		System.out.println(++j); //전위 증가 연산자 : 후처리 선 증가
		
		System.out.println("i = " + i + " , j = " + j); 
		//여기서 i값이 1이 증가된 이유는 선처리 후 증가가 되었기 때문, 즉 처리가 끝난 후 증가 된 것이다.

		i = 5;
		j = 5;
		
		System.out.println(i--); //후위 감소 연산자 : 선처리 후 감소 
		System.out.println(--j); //전위 감소 연산자 : 후처리 선 감소
		
		System.out.println("i = " + i + " , j = " + j);
		
	}
}
