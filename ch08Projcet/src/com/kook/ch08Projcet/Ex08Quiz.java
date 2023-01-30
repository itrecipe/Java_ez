package com.kook.ch08Projcet;

public class Ex08Quiz {

	public static void main(String[] args) {
		//3번
		try {

			//1번
			int[] myNumber = {1, 2, 3, 4, 5};
			
			//2번
			System.out.println(myNumber[10]); //RuntimeException발생(unchecked)
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외 : " + e.getMessage());
		}
		
		finally {
			System.out.println("try~catch문 종료");
		}
		
		checkAge(17);
	}
	//5번
	static void checkAge(int age) {
		if(age < 18) {
			try {				
				ArithmeticException ae = new ArithmeticException("예외발생 ae");
				throw ae;
			
			} catch (ArithmeticException e) { //확실히 알고있는 예외는 여기서 처리함
				e.printStackTrace();
				System.out.println("ae예외 : " + e.getMessage());
			}
			catch (Exception e) { //애매 모호한 모든 예외처리는 여기서 처리함
				e.printStackTrace();
				System.out.println("ae예외 : " + e.getMessage());
			}
		}
		else {
			//6번
			System.out.println("18세 이상이므로 충분!");
		}
	}
}

/* 1.int배열 myNumber를 요소값 1,2,3,4,5를 갖도록 리터럴로 생성
   2.myNumber의 색인번호 10번 요소 출력
   3.예외가 발생시 예외처리를 하는데 printStackTrace();와 예외내용(예외내용반한 메서드 사용)을 출력
   4.예외발생시나 미발생시에 실행블록을 만들고 내용은 try~catch문 종료로 출력
   5.main메서드안에서 이름으로 바로 호출하는 메서드 checkAge는 리턴타입은 void,파라미터는 int age로
   하며 구현 내용은 age가 18 미만이면 ArithmeticException예외를 예외내용 "예외발생"으로 하여 생성하여
   예외를 발생시키고 예외 처리를 해줌, 예외처리 내용은 3번 처럼 해줌
   6.age가 18이상이면 "18세 이상이므로 충분" 출력
*/