package com.h.ch15;

import java.io.*;

//ǥ�� ����� ��� ����
public class Ex15_14 {

	public static void main(String[] args) {
		
		PrintStream ps = null; //���� ��Ʈ��
		FileOutputStream fos = null; //��� ��Ʈ��, ��� ����� ���Ϸ� ����
		
		try {
			fos = new FileOutputStream("test1514.txt");
			//������ ������ �ڵ����� �����Ѵ�.
			ps = new PrintStream(fos); 
			//���� ��Ʈ���� ��� ��Ʈ���� �� ���� ������ �Ѵ�. (�ڱ� �ڽ����θ��� ���Ұ�)
			System.setOut(ps); //ǥ�� ����� out�� �ܼ��� �ƴ� ���Ϸ� �����Ѵ�.
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello by System.out");
		/* - outǥ�� ����� setOut���� ���� "test1514.txt"�� �����Ͽ����Ƿ�,
		     �ܼ�â�� �ƴ� ���Ͽ� ������ �ۼ��ȴ�.
		*/
		System.err.println("Hello by System.err");
		//err��ü�� ��� ����� �����Ϸ��� setErr(PrintStream)�޼���� �����ؾ� �Ѵ�.
	}
}