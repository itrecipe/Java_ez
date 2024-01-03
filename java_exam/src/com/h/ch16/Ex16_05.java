package com.h.ch16;

import java.io.*;
import java.net.*;

public class Ex16_05 {

	public static void main(String[] args) {
		
		URL url = null;
		InputStream in = null;
		FileOutputStream out = null;
		String address = "https://www.w3schools.com/bootstrap4/default.asp";
		
		int ch = 0;
		
		try {
			url = new URL(address);
			in = url.openStream();
			out = new FileOutputStream("javabasic_src.txt");
			
			while((ch = in.read()) != -1) {
				out.write(ch);
			}
			in.close();
			out.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
