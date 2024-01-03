package com.h.ch16;

import java.io.*;
import java.net.*;

public class Ex16_04 {

	public static void main(String[] args) {
		
		URL url = null;
		BufferedReader input = null;
		String address = "https://www.w3schools.com/bootstrap4/default.asp";
		String line = "";
		
		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));
			/* - URL클래스의 openStream()은 URL의 자원에 연결되는 InputStream객체를 반환한다.
			   - openStream()은 url.openStream()으로 HttpURLConnection객체를 만들어
			     url.openConnection().getInputStream()으로 inputStream객체를 얻는다.
			*/
			
			while((line = input.readLine()) != null) {
				System.out.println(line);
			}
			input.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
