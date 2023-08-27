package com.h.ch15;

import java.io.*;

//표준 입출력 대상 변경
public class Ex15_14 {

	public static void main(String[] args) {
		
		PrintStream ps = null; //보조 스트림
		FileOutputStream fos = null; //기반 스트림, 출력 대상을 파일로 지정
		
		try {
			fos = new FileOutputStream("test1514.txt");
			//파일이 없으면 자동으로 생성한다.
			ps = new PrintStream(fos); 
			//보조 스트림은 기반 스트림과 꼭 같이 만들어야 한다. (자기 자신으로만은 사용불가)
			System.setOut(ps); //표준 출력을 out을 콘솔이 아닌 파일로 변경한다.
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello by System.out");
		/* - out표준 출력을 setOut으로 파일 "test1514.txt"로 변경하였으므로,
		     콘솔창이 아닌 파일에 내용이 작성된다.
		*/
		System.err.println("Hello by System.err");
		//err객체도 출력 대상을 변경하려면 setErr(PrintStream)메서드로 변경해야 한다.
	}
}