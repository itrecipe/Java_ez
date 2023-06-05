package com.kook.ch15Project;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

//read()�� write()�޼��� ����
public class Ex15_02 {

	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; //�о�� ����Ʈ �迭
		byte[] outSrc = null; //����� ����Ʈ �迭
		byte[] temp = new byte[10]; //�ӽ� �迭
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		input.read(temp, 0, temp.length);
		/* - int read(byte[] b, int off, int len)
		   - len���� byte���� �о� �迭 b�� ���ι�ȣ off�������� ����
		   - ��ȯ�� �о�� ����(read�ε� �о�ͼ� �迭�� ä���.)
		*/
		output.write(temp, 5, 5);
		/* - public void write(byte[] b, int off, int len)
		   - �־��� �迭 b���� ���ι�ȣ off���� len���� �о� ��½�Ʈ���� write�Ѵ�.
		   - temp�迭�� ���ι�ȣ 5������ 5���� �о�ͼ� ��Ʈ���� �ۼ��Ѵ�.
		*/
		//��½�Ʈ���� �迭�� ��ȯ
		outSrc = output.toByteArray();
		
		System.out.println("Input Source : " + Arrays.toString(inSrc));
		System.out.println("temp : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));

	}
}