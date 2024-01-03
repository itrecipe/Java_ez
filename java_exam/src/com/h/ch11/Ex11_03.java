package com.h.ch11;

import java.util.*;

public class Ex11_03 {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("사용방법 : ((2+3)*1)+3");
			//시작시 (로 시작하고 마지막에 )을 사용
			System.exit(0);
		}
		
		Stack st = new Stack();
		String express = args[0];
		
		System.out.println("입력한 값 : " + express);
		
		try {			
			for(int i=0; i < express.length(); i++) {
				char ch = express.charAt(i);
				if(ch == '(') {
					st.push(ch + ""); //Stack에 추가
				} 
				else if(ch == ')') {
					st.pop(); //Stack의 맨위에서 꺼냄(마지막 입력 된것 반환)
					//Object.pop()은 예외가 발생할 수 있음
					//예외는 Stack이 비어있을시 pop을 하면 예외
				}
			}
			if(st.isEmpty()) {
				System.out.println("괄호가 일치함!");
			}
			else {
				System.out.println("괄호가 일치하지 않음!");
			}
		}
		catch (EmptyStackException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("괄호 불일치!");
		}
	}

}
