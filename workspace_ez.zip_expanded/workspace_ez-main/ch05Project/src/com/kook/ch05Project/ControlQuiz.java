package com.kook.ch05Project;

public class ControlQuiz {

	public static void main(String[] args) {
		//국쌤-연습문제

		//1. int변수 x 선언 후 초기값 : 50
		int x = 50;
		
		//2. int변수 y 선언 후 초기값 : 50
		int y = 50;
		
		/* 3. 조건문 if를 사용하여 x,y를 동등비교, 크다 비교와 기타(아닌것)로 
		 * 비교(if~else , if ~ else) 각 문의 블록 내용은 "1","2","3" 출력*/
			
		if (x == y) {
			System.out.println("1");
		} else if(x > y) {
			System.out.println("2");		
		} else {
			System.out.println("3");
		}
		
		/*
		 * 4. int 변수 time은 20 조건연산자(삼항연산자)를 이용해 time이 
		 * 18보다 적으면 Good day를, 아니면 Good Evening를 선택하여 
		 * result변수에 저장 , result 출력
		 */
		
		int time = 20;
		String result = (time < 18) ? "Good day" : "Good evening" ;
		System.out.println("result 값 출력 : " + result);
		
		/*
		 * 5. int day = 4; day를 조건식으로 하는 switch문을 만들고 case 문은 1과 2를 만들고 
		 * 각각의 case일시 출력은 case값을 출력하고 switch문 종료 기타는 기타라 출력
		 */
		
		int day = 4;
		switch(day) {
			case 1:
				System.out.println(1);
			case 2:
				System.out.println(2);
				break;
			default:
				System.out.println("기타");
		}
		/*
		 * 6. int i = 1; i가 6보다 적을시만 반복하는 while문을 만듬(반복시 출력은 i값 출력) 
		 * 무한 루프 돌지 않도록 i값 조작하여 반복 처리
		 */
		
		int i = 1; //i를 저장하려면 증감식을 써야함.
		
		while(i < 6) { 
			System.out.println(i);
			i++;
			
		}
		
		// 7. i 변수를 다시 1로 변경 6번을 do while문으로 변경
		
		do {
			System.out.println(i);
			i++;
		}while(i < 6);
		
		
		// 8. 기본 for문으로 yes를 5번 출력 하시오.
		for(int j = 0; j < 5; j++) { //앞의 i와
			System.out.println("YES");
		}
		
		/*
		 * 9."Volvo", "BMW", "Ford"를 요소로 갖는 배열 cars를 만듬 
		 * enhanced for문을 이용하여 cars의 원소를 출력
		 */
		
		
		String[] cars = {"Volvo", "BMW", "Ford"};
		for(String str:cars) { //새로운 for문
			System.out.println(str);
			
		}
		
		//10.반복 변수 i는 0부터 시작하여 1씩 증가하며 10회 반복 하다가 i가 5가 되면 for문 중단
		
		for(i = 0; i < 20; i++) { //int i가 아니고 i인 이유는 미리 선언된 i를 사용
			if(i == 5) {
				break; //break가 있는 for문을 종료
			}
			System.out.println(i);
		}
		for(i = 0; i < 10; i++) {
			if(i == 4) {
				continue; //현재 for문의 다음 반복을 실행(다음 문장을 실행하지 않음)
			}
			System.out.println(i);
		 }
	   }
	}
/*
1. int변수 x 선언 후 초기값 : 50
2. int변수 y 선언 후 초기값 : 50
3. 조건문 if를 사용하여 x,y를 동등비교, 크다 비교와 기타로 비교(if~else , if ~ else)
	각 문의 블록 내용은 "1","2","3" 출력
4. int 변수 time은 20 조건연산자(삼항연산자)를 이용해 time이 18보다 적으면 Good day를,
아니면 Good Evening를 선택하여 result변수에 저장 , result 출력
5. int day = 4;
	day를 조건식으로 하는 switch문을 만들고
	case 문은 1과 2를 만들고 각각의 case일시 출력은 case값을 출력하고 switch문 종료
	기타는 기타라 출력
6. int i = 1;
	i가 6보다 적을시만 반복하는 while문을 만듬(반복시 출력은 i값 출력)
	무한 루프 돌지 않도록 i값 조작하여 반복 처리
7. i변수를 다시 1로 변경 6번을 do while문으로 변경
8. 기본 for문으로 yes를 5번 출력 하시오.
9."Volvo", "BMW", "Ford"를 요소로 갖는 배열 cars를 만듬
	enhanced for문을 이용하여 cars의 원소를 출력
10.반복 변수 i는 0부터 시작하여 1씩 증가하며 10회 반복 하다가 i가 5가 되면 for문 중단
*/