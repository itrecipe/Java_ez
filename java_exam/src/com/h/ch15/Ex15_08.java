package com.h.ch15;

import java.io.*;

//FileReader�� FileWriter
public class Ex15_08 {

	public static void main(String[] args) {
		
		try {
			String fileName = "ex1508.txt";
			//byte���
			FileInputStream fis = new FileInputStream(fileName);
			
			//text���
			FileReader fr = new FileReader(fileName);
			
			int data = 0;
			//FileInputStream ��ü�� �̿��� ���� ������ �о� ȭ�鿡 ����Ѵ�
			while((data = fis.read()) != -1) {
				System.out.print((char)data);
			}
			fis.close();
			System.out.println();
			System.out.println("===============================");
			
			//FileReader�� �̿��� ���� ������ �о� ȭ�鿡 ����Ѵ�.
			while((data = fr.read()) != -1) {
				//char�� ����ó��(2����Ʈ ����) -- �ѱ� ó�� ����
				System.out.print((char)data);
			}
			System.out.println();
			fr.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
