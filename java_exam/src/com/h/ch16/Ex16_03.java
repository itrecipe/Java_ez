package com.h.ch16;

import java.net.*;

public class Ex16_03 {

	public static void main(String[] args) {
		String address = "http://www.codechobo.com/sample/hello.html";
		
		try {
			URL url = new URL(address);
			URLConnection conn = url.openConnection();
			/* - �������α׷��� URL��ü���� ��� ��ũ�� ó���ϴ� �ֻ��� �߻� Ŭ����
			   - http�� ���� ��� ��ũ Ŭ������ HttpURLConnection�̴�.
			*/
			System.out.println("conn.toString() : " + conn);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
