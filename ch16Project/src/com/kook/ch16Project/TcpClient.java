package com.kook.ch16Project;

import java.io.*;
import java.net.*;

public class TcpClient {

	public static void main(String[] args) {
		
		try {
			//String serverIp = "127.0.0.1"; //�ڱ� pc�ּ�
			String serverIp = "172.30.1.21"; //���� pc
			System.out.println("���� �ּҴ�. ���� IP : " + serverIp);
			//������ �����Ͽ� ServerSocket�� ������ ��û�Ѵ�.
			Socket socket = new Socket(serverIp, 7777);
			
			//������ �Է� ��Ʈ���� ��´�.
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			//�������� ���� ���� �����͸� ���
			System.out.println("�����κ��� ���� �޽��� : " + dis.readUTF());
			System.out.println("������ �����Ѵ�.");
			dis.close();
			socket.close();
			System.out.println("���� ����!");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}