package com.h.ch11;

import java.util.*;

public class Ex11_02 {

	public static void main(String[] args) {
		
		Stack st = new Stack(); //Stack은 Vector(List계열)을 상속한 클래스
		Queue q = new LinkedList();
		/* Queue는 인터페이스이므로 이를 구현한 LinkedList로 만듬
		   LIFO로 맨마지막 추가된것이 제일 먼저 반환됨
		*/
		st.push("0"); //push()는 Stack에 값을 추가
		st.push("1");
		st.push("2");
		//public E push(E item) 객체형 E를 파라미터로 사용, 객체형 E를 반환
		
		//Queue는 FIFO로 추가된 순서대로 반환
		q.offer("0"); //offer메서드로 추가
		q.offer("1");
		q.offer("2");
		//boolean offer(E e)는 객체형 E를 파라미터로 사용하여 추가하고 반환은 boolean
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			//empty()메서드는 Stack에 저장된 원소가 없으면 true
			System.out.println(st.pop()); //(입력 순서 반대 - 제일 마지막 원소를 반환)
		}
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); //FIFO로 반환(입력 순서)
		}

	}

}
