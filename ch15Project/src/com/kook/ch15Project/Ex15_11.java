package com.kook.ch15Project;

import java.io.BufferedReader;
import java.io.FileReader;

//Buffer를 이용하는 보조스트림 BufferedReader, BufferWriter
public class Ex15_11 {

	public static void main(String[] args) {
		//보조 Reader, Writer는 기반스트림을 사용하여 처리한다.
		try {
			FileReader fr = new FileReader("Ex15_10.java");
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			for(int i=1;(line = br.readLine()) != null; i++) {
				/* - readLine()메서드는 BufferedReader의 메서드로 1줄씩 읽어온다.
				   - System.out.println("======================");
				   - line에 ;이 있으면 출력한다.
				*/
				if(line.indexOf(";") != -1) {
				  System.out.println(i + ":" + line);	
			}
		}
		
		fr.close();
		br.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
