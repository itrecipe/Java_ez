package com.kook.ch06Project;

public class ArrayQuiz {

	public static void main(String[] args) {
		//1. 초기값 "Volvo", "BMW", "Ford"를 갖는 배열 cars를 만듬
		String[] cars = {"Volvo", "BMW", "Ford"};
		//2. cars배열의 2번째 값 출력
		String rs = cars[1];
		System.out.println("Result 값 : " + rs);
	
		//3. cars의 요소 Volvo를 Opel로 변경한 뒤 변경된 요소값 출력
		
		//4. cars배열의 원소개수 출력
		System.out.println("cars배열의 원소개수 : " + cars.length);
		
		//5. cars배열의 요소를 for문으로 출력(기본 for문, enhanced for문)
		for(int i=0; i < cars.length; i++) {
			System.out.println("cars 배열의 요소 출력 : " + cars[i]);
		}
		
		//초기값 { {1, 2, 3, 4}, {5, 6, 7} }를 갖는 myNumbers배열 만들기
		int[][] myNumbers = {{1, 2, 3, 4},{5, 6, 7}};
			System.out.println("myNumbers 배열 값 출력 : " + myNumbers);
		
	}
}

/*
1. 초기값 "Volvo", "BMW", "Ford"를 갖는 배열 cars를 만듬
2. cars배열의 2번째 값 출력
3. cars의 요소 Volvo를 Opel로 변경한 뒤 변경된 요소값 출력
4. cars배열의 원소개수 출력
5. cars배열의 요소를 for문으로 출력(기본 for문, enhanced for문)
6. 초기값 { {1, 2, 3, 4}, {5, 6, 7} }를 갖는 myNumbers배열 만들기
7. myNumbers배열의 요소값을 for문을 이용해 출력
8. cars 배열을 정렬
9. car 배열을 문자열로 변환하여 출력
10. Car클래스를 내부에다 만듬
 	--멤버변수 : color,brand
11. main메서드 안에 Car객체를 요소로 하는 배열 Car1을 요소의 개수 5개로 만듬(리터럴 사용 x)
	각 요소에 Car객체를 만들어 넣어줌
 
*/
