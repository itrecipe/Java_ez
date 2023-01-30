package com.kook.ch08Projcet;
//국.변
public class Ex08_13 {

	public static void main(String[] args) {
		try {
			install();
		}
		catch (InstallException e) {
			//원인예외 SpaceException2가 등록된 InstallException예외 처리
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (Exception e) { //아닌것들은 죄다 Exception 최상위로 넘어옴
			e.printStackTrace();
		}

	}
	
	static void install() throws InstallException {
		//InstallException예외 발생시 자신을 호출한 main메서드로 처리 위임
		try {
			startInstall();
		}
		catch (SpaceException2 e) {
			InstallException ie = new InstallException("설치 중 예외 발생");
			ie.initCause(e); //원인이되는것을 발생한 예외에다 등록함
			//SpaceException2 객체 e가 원인이 되어 InstallException예외 ie를 발생
			//다른 예외에 의해 발행한 ie에 원인 예외 e를 등록
			throw ie;
		}
	}
	
	static void startInstall() throws SpaceException2 {
		throw new SpaceException2("설치할 공간 부족");
		
	}
}

class SpaceException2 extends Exception {
	SpaceException2(String msg) {
		super(msg); //상위클래스인 Exception(super)의 생성자중 예외내용을 등록하는 생성자를 사용
	}
}
class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}