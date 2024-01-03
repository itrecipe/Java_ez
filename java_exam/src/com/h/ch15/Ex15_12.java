package com.h.ch15;

import java.io.*;

/* - stream����� ���ڱ������ ��ȯó��
   - ����� Scanner ����� ����Ѵ�.
*/

public class Ex15_12 {

	public static void main(String[] args) {
		String line = "";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			//InputStreamReader�� ��� Reader
			//System.in������ ǥ�� �Է� ��Ʈ��(Ű���� �Է�)���� InputStream��ü��.
			BufferedReader br = new BufferedReader(isr);
			System.out.println("������� OS�� ���ڵ� : " + isr.getEncoding());
			
			do {
				System.out.println("������ �Է��ض�. ��ġ���� q�� �Է��϶�.>");
				line = br.readLine();
				System.out.println("�Է��� ���� : " + line);
				
			} while(!line.equalsIgnoreCase("q")); 
			
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
