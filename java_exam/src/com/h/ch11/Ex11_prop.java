package com.h.ch11;

import java.io.*;
import java.util.*;
//교재에 없는 내용-국쌤예제
public class Ex11_prop {

	public static void main(String[] args) {
		/* Propertise사용, (프로그램의 설정 파일로 사용)
		   HashTable을 이용하므로 Map처럼 사용
		   (단, key와 value가 String, String)
		*/
		Properties prop = new Properties();
		
		//setProperty(String key, String value)
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "Korean");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		//보통 Properties는 외부 파일에 저장
		
		try {
			//일반 텍스트형식 문서
			prop.store(new FileOutputStream("output.properties"), "Properties Exam"); 
			/*-store(저장할 파일 지정, 주석)
			   public void store(OutputStream out, String comments)
               throws IOException
			  -FileOutputStream은 자바의 입출력 처리관련 클래스로 파일에 내용을 작성할시 사용
			  -OutputStream outsms 출력 객체, comments는 프로퍼티파일에 작성할 주석
		    */
			
			//작성될 문서의 종류가 xml문서다
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Exam");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}