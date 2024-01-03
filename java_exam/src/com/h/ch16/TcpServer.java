package com.h.ch16;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class TcpServer {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null; //���ÿ��� �⺻���� �� ��� �Ѵ�.
		
		try {
			serverSocket = new ServerSocket(7777);
			/* - port ��ȣ 7777�� ����ϴ� ���� ���� ����
			   - Ŭ���̾�Ʈ���� ���� ������ �ش� ��Ʈ�� ������ ��û�Ѵ�.
			*/
			System.out.println(getTime() + "������ �غ� �Ǿ���.");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		while(true) { //Ŭ���̾�Ʈ ������ ��� ��� �ϸ鼭 ��ٸ���.
			try {
				System.out.println(getTime() + "���� ��û�� ��ٸ���.");
				//���� ������ Ŭ���̾�Ʈ�� ���� ��û�� �ö����� ������ ���߰� ��� ��ٸ���.(accept �޼��忡��)
				Socket socket = serverSocket.accept();
				/* - accept()�� ������ û�� �ϴٰ� ������ ���� ����� ���� ��ü�� ����(���� ��û�ñ����� ���(������))
				   - �ش� ������ Ŭ���̾�Ʈ ���ϰ� ����� ���ο� ����
				*/
				System.out.println(getTime() + socket.getInetAddress()
				+ "�� ���� ���� ��û�� ���Դ�.");
				//������ ��� ��Ʈ���� ��´�.
				OutputStream out = socket.getOutputStream();
				//������ ������� �ϴ� ��� ��Ʈ��
				DataOutputStream dos = new DataOutputStream(out);
				//��½� ����� �۽ŵȴ�
				dos.writeUTF("[Notice] Test Message1 from Server");
				System.out.println(getTime() + "�����͸� �����ߴ�.");
				dos.close();
				socket.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		} //while
	} //main
	
	static String getTime() { //���� �ð� ���
		SimpleDateFormat f = new SimpleDateFormat("[hh:mm:ss]");
		return f.format(new Date());
	} //static method
}