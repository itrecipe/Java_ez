package com.kook.ch15Project;

import java.io.*;
import java.util.*;

public class Ex15_20 {

	public static void main(String[] args) {
		
		try {
			String fileName = "UserInfo.ser"; //����ȭ ���� �ۼ��� ����
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("JavaMan", "1234", 30);
			UserInfo u2 = new UserInfo("JavaWoman", "4321", 26);
			
			ArrayList<UserInfo> list = new ArrayList<>();
			//ArrayList�� Serializable �������̽��� ������ Ŭ����
			list.add(u1);
			list.add(u2);
			
			/* - ��ü�� ����ȭ �Ѵ�.
			   - (ObjectOutputStream�� writeObject(��ü)�� ��� ��� ���Ͽ� ���
			*/
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			
			out.close();
			System.out.println("����ȭ�� �� ������");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
