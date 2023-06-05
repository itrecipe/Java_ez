package com.kook.ch16Project;

import java.io.*;
import java.net.*;

public class TcpClient {

	public static void main(String[] args) {
		
		try {
			//String serverIp = "127.0.0.1"; //자기 pc주소
			String serverIp = "172.30.1.21"; //교사 pc
			System.out.println("서버 주소다. 서버 IP : " + serverIp);
			//소켓을 생성하여 ServerSocket에 연결을 요청한다.
			Socket socket = new Socket(serverIp, 7777);
			
			//소켓의 입력 스트림을 얻는다.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			//소켓으로 부터 받은 데이터를 출력
			System.out.println("서버로부터 받은 메시지 : " + dis.readUTF());
			System.out.println("연결을 종료한다.");
			dis.close();
			socket.close();
			System.out.println("연결 종료!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}