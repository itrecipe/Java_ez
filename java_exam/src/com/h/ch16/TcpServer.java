package com.h.ch16;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class TcpServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null; //로컬에선 기본값을 꼭 줘야 한다.
		
		try {
			serverSocket = new ServerSocket(7777);
			/* - port 번호 7777을 사용하는 서버 소켓 생성
			   - 클라이언트에서 서버 소켓의 해당 포트로 연결을 요청한다.
			*/
			System.out.println(getTime() + "서버가 준비 되었다.");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		while(true) { //클라이언트 접속을 계속 대기 하면서 기다린다.
			try {
				System.out.println(getTime() + "연결 요청을 기다린다.");
				//서버 소켓은 클라이언트의 연결 요청이 올때까지 실행을 멈추고 계속 기다린다.(accept 메서드에서)
				Socket socket = serverSocket.accept();
				/* - accept()는 연결을 청취 하다가 연결이 오면 통신할 소켓 객체를 생성(연결 요청시까지는 블록(대기상태))
				   - 해당 소켓은 클라이언트 소켓과 통신할 새로운 소켓
				*/
				System.out.println(getTime() + socket.getInetAddress()
				+ "로 부터 연결 요청이 들어왔다.");
				//소켓의 출력 스트림을 얻는다.
				OutputStream out = socket.getOutputStream();
				//소켓을 대상으로 하는 출력 스트림
				DataOutputStream dos = new DataOutputStream(out);
				//출력시 통신이 송신된다
				dos.writeUTF("[Notice] Test Message1 from Server");
				System.out.println(getTime() + "데이터를 전송했다.");
				dos.close();
				socket.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		} //while
	} //main
	
	static String getTime() { //현재 시간 찍기
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	} //static method
}