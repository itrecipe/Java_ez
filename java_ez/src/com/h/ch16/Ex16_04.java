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
			/* - URLŬ������ openStream()�� URL�� �ڿ��� ����Ǵ� InputStream��ü�� ��ȯ�Ѵ�.
			   - openStream()�� url.openStream()���� HttpURLConnection��ü�� �����
			     url.openConnection().getInputStream()���� inputStream��ü�� ��´�.
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
