package com.kook.ch11Project;

import java.util.*;

public class Ex11_12 {

	public static void main(String[] args) {
		HashSet setA = new HashSet(); 
		HashSet setB = new HashSet(); 
		HashSet setHab = new HashSet(); //합집합 
		HashSet setKyo = new HashSet(); //교집합
		HashSet setCha = new HashSet(); //차집합

		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
	
		System.out.println("A : " + setA);

		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
	
		System.out.println("B : " + setB);
		
		/* Iterator(인터페이스) : 어떠한 컬렉션 객체에 접근하기 위한 인터페이스
		   set의 요소를 하나씩 비교하기 위해 Iterator(인터페이스)객체 생성
		*/
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next(); //next()는 Object를 반환
			if(setA.contains(tmp)) { 
				/* contains() : setA에 공통된 것이 있는지 없는지 확인,
				   값이 포함되는것이 있는지 체크해주는 메서드
				*/
				setKyo.add(tmp);
			}
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) {
				setCha.add(tmp);
			}
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next()); //setA의 요소를 setHab에 추가
		}
		
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next()); //setB의 요소를 setHab에 추가
		}
		
		/* 사용 가능한 특수문자는 한글 "ㄷ"을 입력하고 ㄷ에 블록처리가 된 상태에서 
		   한자키를 눌러 아래쪽으로 내리면서 찾아보면 있다. ∩(교집합), ∪(합집합)
		*/
		System.out.println("A ∩ B = " + setKyo);
		System.out.println("A ∪ B = " + setHab);
		System.out.println("A - B = " + setCha);
	}
}