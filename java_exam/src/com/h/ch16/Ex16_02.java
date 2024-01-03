package com.h.ch16;

import java.net.*;

public class Ex16_02 {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://www.javachobo.com:80/sample/" +
				 			"hello.html?referer=javachobo#index1");
		//URL��ü ������ URL(String �ڿ� ���);
		System.out.println("url.getAuthority() : " + url.getAuthority());
		//host��� ��Ʈ��ȣ
		System.out.println("url.getDefaultPort() : " + url.getDefaultPort());
		//�⺻ ��Ʈ ��ȣ
		System.out.println("url.getPort() : " + url.getPort());
		//���� ��Ʈ��ȣ
		System.out.println("url.getFile() : " + url.getFile());
		//host�� ��Ʈ��ȣ�� ������ ��ο� �ڿ���, �׸��� ������(�ε����� ����)
		System.out.println("url.getHost() : " + url.getHost());
		//DNS(host��)
		System.out.println("url.getPath() : " + url.getPath());
		//host�� port�� ������ �ڿ������ ���(������ ����)
		System.out.println("url.getProtocol() : " + url.getProtocol());
		//�������ݸ� http
		System.out.println("url.getQuery() : " + url.getQuery());
		//?�ڿ� ��������
		System.out.println("url.getRef() : " + url.getRef());
		//#���� �ε�����
		System.out.println("url.getUserInfo() : " + url.getUserInfo());
		//����� ����
		System.out.println("url.toExternalForm() : " + url.toExternalForm());
		//URL��ü�� ���ڿ��� ��ȯ
		System.out.println("url.toURI() : " + url.toURI());
		/* - URL��ü�� URI��ü�� ��ȯ
		   - Uniform Resource Identifier
		   - URI�� URL���� �������� URL�� �������ݵ��� �־�� �ϴµ� URI�� �׳� ���и� �ϴ� �����̴�.
		*/
	}
}