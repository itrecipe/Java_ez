package com.kook.ch15Project;
//��.��
import java.io.*;
import java.util.*;

public class Ex15_07 {

	public static void main(String[] args) {
		//Stream�̹Ƿ� byte�迭 ���
		byte[] arr1 = {0, 1, 2};
		byte[] arr2 = {3, 4, 5};
		byte[] arr3 = {6, 7, 8};
		byte[] outSrc = null;
		
		//Vector�� List�迭 �÷���
		Vector v = new Vector();

		//ByteArrayInputStream�� �޸𸮿� ����Ʈ �迭�� ����ϴ� Stream
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
		SequenceInputStream input = new SequenceInputStream(v.elements());
		/* - SequenceInputStream�� ���� ��Ʈ������ �������� ��Ʈ���� �����Ͽ� �ϳ�ó�� ó���Ѵ�.
		   - Vector�� elements() �޼���� Enumeration ��ü�� ��ȯ�ϰ� Enumeration��ü�� ���Ҵ�
		     ByteArrayInputStream ��ü�� �����ȴ�.
		 */
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		try { 
			while((data = input.read()) != -1) {
				output.write(data); //�޸𸮿� ���ش�.
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		outSrc = output.toByteArray(); //����Ʈ �迭�� ����
		//�迭�� ���ڿ� �������� ��ȯ�ϴ� �޼���� Arrays�� static�޼����� toString()�� ���
		System.out.println("Input Source1 : " + Arrays.toString(arr1));
		System.out.println("Input Source2 : " + Arrays.toString(arr2));
		System.out.println("Input Source3 : " + Arrays.toString(arr3));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
		//2���� ��� ��Ʈ�� ��ü(File)�� �Ķ���ͷ� �ϴ� SequenceInputStream��ü�� �����Ͽ� ���
		try {
			FileInputStream file1 = new FileInputStream("file001.txt");
			FileInputStream file2 = new FileInputStream("123.txt");
			
			SequenceInputStream input1 = new SequenceInputStream(file1, file2);
			//�ΰ��� FileInputStream��ü�� �̿��� SequenceInputStream�� �����.
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}