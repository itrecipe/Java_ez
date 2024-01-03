package com.h.ch15;

import java.io.*;

public class Ex15_09 {

	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader(args[0]);
		FileWriter fw = new FileWriter(args[1]);
		
		int data = 0;
		while((data = fr.read()) != -1) {
			fw.write(data); //출력 FileWriter객체에 써준다(즉, 출력 파일에 작성한다는 의미)
		}
		
		fr.close();
		fw.close();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}