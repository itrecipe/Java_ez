package com.kook.ch08Projcet;
//국.변
import java.io.File;

public class Ex08_10 {

	public static void main(String[] args) {
		
		try {
			File f = createFile(args[0]); //main메서드에서 호출
			System.out.println(f.getName() + "파일이 성공적으로 생성됨");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+" 다시 파일명 입력");
		}

	}
	
	static File createFile(String fileName) throws Exception {
		//자신 메소드를 호출한 main메소드로 예외처리 위임
		if(fileName==null || fileName.equals("")) {
			throw new Exception("파일명이 유효하지 않음");
			//예외 발생시 이 메서드 안에서 try~catch로 처리 안하고 호출한 메서드로 처리 위임
			//예외처리로 가므로 호출 메서드로 감
		}
		File f = new File(fileName);
		f.createNewFile(); //File객체로 실제 파일 만들기
		
		System.out.println("파일이 프로젝트 밑에 생성됨--refresh해야 보임");
		return f;
	}
}
