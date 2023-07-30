package com.kook.ch15Project;

import java.io.*;

public class Ex15_15 {

	public static void main(String[] args) throws Exception {

		File f = new File("D:\\test\\Ex15_14.java");
		//���� ��ü ������ �Ķ���Ϳ� ��ΰ� ���Ե� ���ϸ��� �ۼ��ؾ� �Ѵ�.
		String fileName = f.getName();
		//������ ��θ� ������ ���ϸ� ��ȯ
		int pos = fileName.lastIndexOf(".");
		//������ Ȯ���� ���� .�� ���ι�ȣ
		
		System.out.println("��θ� ������ ���ϸ� : " + f.getName());
		System.out.println("Ȯ���ڸ� ������ ���ϸ� : " + fileName.substring(0, pos));
		System.out.println("Ȯ���� : " + fileName.substring(pos + 1));
		
		System.out.println("��θ� ������ ���ϸ� : " + f.getPath());
		System.out.println("������ ������ : " + f.getAbsolutePath());
		System.out.println("������ ���԰�� : " + f.getCanonicalPath());
		System.out.println("������ ���� ���丮 : " + f.getParent()); 
		//���丮(����)
		System.out.println();
		
		System.out.println("File.PathSeparator : " + File.pathSeparator);
		System.out.println("File.PathSeparatorChar : " + File.pathSeparatorChar);
		System.out.println("File separator : " + File.separator);
		System.out.println("File separatorChar : " + File.separatorChar);
		System.out.println();
		System.out.println("user.dir : " + System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path : " + System.getProperty("sun.boot.class.path"));	
	}
}