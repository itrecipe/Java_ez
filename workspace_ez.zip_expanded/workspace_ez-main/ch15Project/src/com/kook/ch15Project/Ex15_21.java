package com.kook.ch15Project;

import java.io.*;
import java.util.ArrayList;

//������ȭ�� ����ȭ�� ���ڿ��� ��ü�� ����
public class Ex15_21 {

	public static void main(String[] args) {
		
		try {
			String fileName = "UserInfo.ser";
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			ObjectInputStream in = new ObjectInputStream(bis);
			
			//��ü�� �����ÿ��� ����� ������ ��ġ���Ѿ� �Ѵ�.
			UserInfo u1 = (UserInfo)in.readObject();
			//readObject()�� ��ȯ�� Object�̹Ƿ� ����ȯ�� ����� �Ѵ�.
			UserInfo u2 = (UserInfo)in.readObject();
			ArrayList list = (ArrayList)in.readObject();
			/* - toString()�� �����Ϸ��� �ڵ����� �ٿ��ش�.
			   - ex) System.out.println(u1.toString()); //�̷��� �ڵ����� �Ǿ� �ִ�.
			*/
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			//List�� �⺻������ toString()�� �������̵� �ϰ� �ִ�.
			in.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}