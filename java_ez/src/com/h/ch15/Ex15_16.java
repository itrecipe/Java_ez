package com.h.ch15;

import java.io.*;

public class Ex15_16 {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("���ڷ� directory ��θ� �����");
			System.exit(0); //���α׷� ����
		}
		
		File f = new File(args[0]);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ���丮!");
			System.exit(0);
		}
		
		File[] files = f.listFiles();
		/* - File[] listFiles()�� file��ü�� ���ϵ��� �迭�� ��ȯ
		   - directory�ؿ� �ִ� �����̳� directory ����Ʈ�� �迭�� ��ȯ
		*/
		for(int i=0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(
					files[i].isDirectory() ? "[" + fileName + "]" : fileName);
		}

	}

}