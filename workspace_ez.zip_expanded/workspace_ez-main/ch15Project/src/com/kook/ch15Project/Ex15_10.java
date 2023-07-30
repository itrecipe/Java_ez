package com.kook.ch15Project;

import java.io.*;

/* - StringReader, StringWriter�� ���ڱ���̸� �޸𸮸� �̿��Ѵ�.
   - CharArrayReader�� CharArrayWriteró�� �����ϸ� ���� ���� Ȱ��ȴ�.
 */

public class Ex15_10 {

	public static void main(String[] args) {
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData);
		//StringReader��ü�� ������ ���ڿ� ��ü�� �̿��Ͽ� �����Ѵ�.
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try {
			while((data = input.read()) != -1) {
				output.write(data);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("input data : " + inputData);
		System.out.println("output data : " + output.toString());
		/* - StringWriter�� StringBuffer�� �����Ͽ� Ȱ���Ѵ�.
		   - StringWriter��ü.toString()�� ���ۿ� ����� ������ �޸𸮿� ����Ѵ�.
		*/

	}

}
