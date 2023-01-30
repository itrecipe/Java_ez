package com.kook.ch09Project;

import static java.lang.Math.*; //Math클래스의 모든 멤버를 Math.없이 사용
import static java.lang.System.*; //System의 모든 멤버도 System.없이 사용

public class Ex09_13 {

	public static void main(String[] args) {
		double val = 90.7552;
		out.println("round(" + val + ") = " + round(val));
		/* System과 Math모두 생략하고 멤버 사용
		   long round는(double d)으로 처리- 소수점 첫자리에서 반올림 long형 정수
		*/
		
		val *= 100; //val = val * 100;
		out.println("round(" + val + ") = " + round(val));
		//소수점 3째 자리에서 반올림
		out.println("round(" + val + ")/100 = " + round(val) / 100);
		out.println("round(" + val + ")/100.0 = " + round(val) / 100.0);
		//long을 double로 나누면 double
		out.println(); //그냥 한줄 띄워주는 용도
		out.printf("ceil(%3.1f) = %3.1f%n", 1.1, ceil(1.1));
		//double java.lang.Math.ceil(double a)은 double을 받아서 무조건 올림한 double형 반환
		out.println("floor()메서드는 무조건 내림" + floor(1.5));
		//double java.lang.Math.floor(double a)는 double형은 받아 무조건 내림한 double형 반환
		out.println("rint()메서드는 가장 가까운 더블형 값을 반환하나, 정중앙의 값인 .5는" 
		            + "짝수값을 반환" + rint(1.5));
		
		//음수처리
		out.println("움수의 처리는 가까운 음수로 반올림 -1.6 : " + round(-1.6));
		out.println("움수의 처리는 가까운 음수로 반올림 : " + round(-1.3));
		out.println("움수의 처리는 중앙 큰수로 반올림 -1.5 : " + round(-1.5));
		out.println("움수의 처리는 큰값으로 무조건 올림 : " + ceil(-1.5));
		out.println("움수의 처리는 작은수로 무조건 내림 : " + floor(-1.5));
		
	}
}
