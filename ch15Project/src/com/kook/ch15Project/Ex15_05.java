package com.kook.ch15Project;

import java.io.*;

//FileInputStream, FileOutputStream
public class Ex15_05 {

	public static void main(String[] args) throws IOException{
		FileInputStream fis = new FileInputStream(args[0]);
		/* - FileInputStream(String name) throws FileNotFoundException
		   - file이 없으면 예외 발생
		*/
		
		FileOutputStream fos = new FileOutputStream(args[1]);
		//FileInputStream은 파일 생성시 파일이 없으면 새로 만든다.
		
		int data = 0;
		
		while((data = fis.read()) != -1) {
			char c = (char)data; //0~255사이의 값이므로 char범위에 들어간다.
			System.out.println(c);
			fos.write(data); //FileOutputStream 출력 대상 파일에 write
		}
		fis.close();
		fos.close();
	}

}
