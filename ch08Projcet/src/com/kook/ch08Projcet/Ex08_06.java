package com.kook.ch08Projcet;

public class Ex08_06 {

	public static void main(String[] args) {
		
		try {
			//예외를 발생시키려면 예외 객체를 생성해야함,고의로 발생시킬 예외 객체 생성
			Exception e = new Exception("고의 발생 예외");
			//예외 객체 생성시 메시지를 넣어서 객체 생성
			throw e; //예외 객체를 catch블록으로 던짐,예외 종류에 따라 catch블록 선택
		}
		catch(Exception e) {
			System.out.println("예외메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("try~catch밖");
	}

}
