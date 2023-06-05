package com.kook.ch15Project;

import java.io.*;

public class Ex15_06 {

	public static void main(String[] args) {
		try {
		FileOutputStream fos = new FileOutputStream("123.txt"); //기반스트림
		//파일이 없으면 예외가 발생하며 try ~ catch를 사용한다.
		BufferedOutputStream bos = new BufferedOutputStream(fos, 5); //보조스트림
		/* - BufferedOutputStream(outputStream의 기반 객체, 바이트 크기)
		   - 보조스트림은 생성시 기반 스트림 객체를 이용하여 객체를 만든다. 
		   - 만일 버퍼크기가 없으면 기본인 8192바이트를 갖는다.
		*/
			for(int i='0'; i<='9'; i++) {
			 /* - 보조스트림을 이용할시 read, write메서드는 보조스트림의 메서드를 사용한다.
			    - 실제로는 기반스트림의 read, write가 처리한다.
			 */
				bos.write(i);
			}
			//fos.close(); //버퍼에 일부는 남는다.
			bos.close();
			/* - 보조스트림 객체를 close()하면 자동으로 기반스트림인 fos.close()도 수행하며,
			     flush()도 자동을 실행되어 버퍼를 비워준다.			
			*/
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로젝트폴더 밑에 123.txt가 생겼는지 프로젝트를 refresh해서 확인 해보자");

	}

}
