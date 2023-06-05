package com.kook.ch06Project;

public class Ex06_04 {
	
	//국쌤 변형 예제-원본과살짝다름
	public static void main(String[] args) {
		//MyMath클래스의 add,subtract,multiply,divide 메서드를 호출하여 사용
		//메서드는 전부 인스턴스 메서드이므로 객체를 생성해서 사용
		MyMath mm = new MyMath();
		long result1 = mm.add(15L , 20L); //메서드 호출, 메서드의 파라미터가 long형으로 int형으로 자동 형변환함
		long result2 = mm.subtract(5L , 3L); 
		long result3 = mm.multiuply(5L , 3L);
		double result4 = mm.divide(5L , 3L); //파라미터 double형이므로 자동으로 float형으로 자동 형변환
		//반환받은 값은 변수에 저장하여 활용함.
		
		//인스턴스 멤버변수 name값 변경
		mm.name = "kook";
		// 클래스형 멤버변수 price값 변경
		MyMath.price = 100;
		
		//클래스형 메서드 호출
		MyMath.smeth();
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("name : " + mm.name);
		System.out.println("price : " + MyMath.price);
		
	}
}

class MyMath{
	String name; //인스턴스형 멤버변수
	static int price; //클래스(static)형 멤버변수
	
	long add(long a, long b) {
		/*헤더(선언부) long add(nong a, long b)
		 long은 반환데이텨형(리턴타입) add는 메서드명, ()파라미터부, 
		 로컬변수 선언식으로 파라미터변수 
		 파라미터 변수 a,b는 블록안에서 로컬 변수로 사용됨. 
		 a,b를 변경하면 해당코드 안에서만 변경 , 전달된 호출부의 인자값은 변경 안됨.
		 */
		long result = a + b;
		return result;
	}
	
	long subtract(long a, long b) {
		long result = a - b;
		return result;
	};
	
	long multiuply(long a, long b) {
		long result = a * b;
		return result;
	};
	
	double divide(double a, double b) {
		double result = a / b;
		return result;
	}
	
	static void smeth() {
		System.out.println("smeth");
	}
}
