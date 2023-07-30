package com.kook.ch15Project;

import java.io.*;

public class Ex15_15 {

	public static void main(String[] args) throws Exception {

		File f = new File("D:\\test\\Ex15_14.java");
		//파일 객체 생성시 파라미터에 경로가 포함된 파일명을 작성해야 한다.
		String fileName = f.getName();
		//파일의 경로르 제외한 파일명만 반환
		int pos = fileName.lastIndexOf(".");
		//파일의 확장자 앞의 .의 색인번호
		
		System.out.println("경로를 제외한 파일명 : " + f.getName());
		System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, pos));
		System.out.println("확장자 : " + fileName.substring(pos + 1));
		
		System.out.println("경로를 포함한 파일명 : " + f.getPath());
		System.out.println("파일의 절대경로 : " + f.getAbsolutePath());
		System.out.println("파일의 정규경로 : " + f.getCanonicalPath());
		System.out.println("파일이 속한 디렉토리 : " + f.getParent()); 
		//디렉토리(폴더)
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