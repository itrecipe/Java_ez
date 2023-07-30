package com.kook.ch15Project;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex15_03 {

	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; 
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source :  " + Arrays.toString(inSrc));
		
		
/*		// - ���� ������ŭ�� �����ͼ� write�Ϸ��� ���� ó�� ó���Ѵ�.  
		try {
			while(input.available() > 0) {
				 // - available() �޼���� �Է� ��Ʈ������ �о�ü� �ִ� �������� ������ ��ȯ�Ѵ�.
				 // - read�ϸ� read�� ���Ҵ� �����Ѵ�.
				
				
				input.read(temp); //�迭 tempũ�� ��ŭ �о�ͼ� �迭�� ä���, �����Ͱ����� ��ȯ�Ѵ�.
				//read�� ���� temp�迭�� �̿��Ͽ� �����.
				output.write(temp); //�迭 temp�� ����� ��� ���Ҹ� ��� ��Ʈ���� �ۼ��Ѵ�.
				//write�� ���� ��� ��Ʈ���� �߰��Ѵ�.
				outSrc = output.toByteArray(); //toByteArray() ��� ��Ʈ���� ����Ʈ �迭�� ��ȯ�Ѵ�.
				printArrays(temp, outSrc);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
*/
		try {
			while(input.available() > 0) {
				// - available() �޼���� �Է� ��Ʈ������ �о�ü� �ִ� �������� ������ ��ȯ�Ѵ�.
				// - read�ϸ� read�� ���Ҵ� �����Ѵ�.
				
				int len = input.read(temp); //�迭 tempũ�� ��ŭ �о�ͼ� �迭�� ä���, �����Ͱ����� ��ȯ�Ѵ�.
				//read�� ���� temp�迭�� �̿��Ͽ� �����.
				output.write(temp, 0, len); //�迭 temp�� ����� ��� ���Ҹ� ��� ��Ʈ���� �ۼ��Ѵ�.
				//write�� ���� ��� ��Ʈ���� �߰��Ѵ�.
				outSrc = output.toByteArray(); //toByteArray() ��� ��Ʈ���� ����Ʈ �迭�� ��ȯ�Ѵ�.
				printArrays(temp, outSrc);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp          : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}
}