package com.h.ch15;

import java.io.*;

/* - stream기반을 문자기반으로 변환처리
   - 현재는 Scanner 방식을 사용한다.
*/

public class Ex15_12 {

	public static void main(String[] args) {
		String line = "";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			//InputStreamReader는 기반 Reader
			//System.in변수는 표준 입력 스트림(키보드 입력)으로 InputStream객체다.
			BufferedReader br = new BufferedReader(isr);
			System.out.println("사용중인 OS의 인코딩 : " + isr.getEncoding());
			
			do {
				System.out.println("문장을 입력해라. 마치려면 q를 입력하라.>");
				line = br.readLine();
				System.out.println("입력한 문장 : " + line);
				
			} while(!line.equalsIgnoreCase("q")); 
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
