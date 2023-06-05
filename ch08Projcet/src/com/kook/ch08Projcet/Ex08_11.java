package com.kook.ch08Projcet;
//국.변
public class Ex08_11 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}
		catch (SpaceException se) {
			//개발자가 만든 SpaceException 사용
			System.out.println("에러 메시지 : " + se.getMessage());
		}
		catch (MemoryException me) {
			//개발자가 만든 MemoryException 사용
			System.out.println("에러 메시지 : " + me.getMessage());
		}
		finally {
			//예외가 있던 없던 무조건 처리
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		//이 메서드 실행시 무조건 SpaceException, MemoryException 예외처리
		if(!enoughSpace()) {
			throw new SpaceException("설치공간 부족");
		}
		if(!enoughMemory()) {
			throw new SpaceException("메모리 부족");
		}
	}
	
	static boolean enoughSpace() {
		return true;
	}
	static boolean enoughMemory() {
		return false;
	}
	
	static void copyFiles() {
		System.out.println("파일 카피");
	}
	
	static void deleteTempFiles() {
		System.out.println("delete 임시 파일");
	}
}

class SpaceException extends Exception {
	//예외처리 클래스 - Exception(최상위 예외)을 상속한 개발자가 만드는 예외처리 클래스
	//생성자에서 상속한 JDK의 생성자를 활용
	SpaceException(String msg) {
		// 예외관련 메시지를 예외 객체에 추가해주기는 super(Exception을 활용)
		super(msg);
	}
}

class MemoryException extends Exception {
	//예외처리 클래스 - Exception(최상위 예외)을 상속한 개발자가 만드는 예외처리 클래스
	MemoryException(String msg) {
		super(msg);
	}
}