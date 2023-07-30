package com.kook.ch06Project;

import java.util.Arrays;

public class ArrayQuiz {

	//주석은 숫자로 시작하는 문제 빼고 적은 코드는 국쌤 정답
	public static void main(String[] args) {
		//1. 초기값 "Volvo", "BMW", "Ford"를 갖는 배열 cars를 만듬
		String[] cars = {"Volvo", "BMW", "Ford"};
		// String[] cars = new String[]{"Volvo","BMW","Ford"};	
		
		//2. cars배열의 2번째 값 출력
		String rs = cars[1];
		System.out.println("Result 값 : " + rs);
	
		//3. cars의 요소 Volvo를 Opel로 변경한 뒤 변경된 요소값 출력
			cars[0] = "Opel";
				System.out.println("cars의 요소 Volvo를 Opel로 변경 : " + cars[0]);
				
		//4. cars배열의 원소개수 출력
		System.out.println("cars배열의 원소개수 : " + cars.length);
		
		//5. cars배열의 요소를 for문으로 출력(기본 for문, enhanced for문)
			//기본 for
		for(int i=0; i < cars.length; i++) {
			System.out.println("cars 배열의 요소 출력 (기본 for) : " + cars[i]);
		
			//enhanced for문
			//주로 배열이나 collection객체(데이터집합처리)에서 사용
			String[] cars1 = {"Volvo", "BMW", "Ford"};
			for(String str:cars1) { //새로운 for문
				System.out.println("enhanced for문 : " + str);
				
			}
		}
		
		//6.초기값 { {1, 2, 3, 4}, {5, 6, 7} }를 갖는 myNumbers배열 만들기
		int[][] myNumbers = {{1, 2, 3, 4},{5, 6, 7}};
		/* 배열첨자[]개수가 차원을 나타냄
		2차원 배열은 첫번쨰가 형의 개수, 두번째가 열의 개수 
		행의 개수는 2개이고 열은 가변 
		myNumbers[0][0] ~ myNumbers[0][3]
		myNumbers[1][0] ~ myNumbers[1][2]
		int[][] myNumbers = new int[2][];
		myNumbers[0] = new int[4];
		myNumbers[0] = new int[3];
			 
		*/
		
		//System.out.println("myNumbers 배열 값 출력 : " + Arrays.deepToString(myNumbers));
			
			//7. myNumbers배열의 요소값을 for문을 이용해 출력
			
			for(int i=0; i<myNumbers.length;i++) {
				for(int j=0;j<myNumbers[i].length;j++) {
	            System.out.println(myNumbers[i][j]);
	         }
	      }

			for(int k=0; k < myNumbers.length; k++) {
				System.out.println("myNumbers 배열의 요소값 : " + Arrays.deepToString(myNumbers));
			}
			
			//8. cars 배열을 정렬
			Arrays.sort(cars);
			//Arrays는 배열처리를 편리하게 하도록 해주는 static메서드 가짐
			System.out.println("cars 배열 정렬 : " + Arrays.toString(cars));
			
			//9. car 배열을 문자열로 변환하여 출력
			//배열을 문자열로 변환 toString(배열) [값, 값, 값]
			// 2차원배열 처리시 사용 -> Arrays.deepToString();
			
			/* 11. main메서드 안에 Car객체를 요소로 하는 배열 Car1을 요소의 개수 5개로 만듬(리터럴 사용 x)
			각 요소에 Car객체를 만들어 넣어줌 */
			Car[] car1 = new Car[5];
			//car1 배열의 구성 요소가 Car클래스의 값(Car객체)
			car1[0] = new Car();
			car1[1] = new Car();
			car1[2] = new Car();
			car1[3] = new Car();
			car1[4] = new Car();
	}

 }
	//10. Car클래스를 내부에다 만듬 --멤버변수 : color,brand

class Car{
	//멤버변수 (인스턴스형)
	String color;
	String brand;
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
