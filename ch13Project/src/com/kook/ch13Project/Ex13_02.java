package com.kook.ch13Project;

public class Ex13_02 {

	public static void main(String[] args) {
		//main스레드 하나만 사용하여 작업 (단, 싱글스레드일때)
		long startTime = System.currentTimeMillis();
		//currentTimeMillis()는 밀리세컨드로 된 posix타입
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
			/* "-"을 사용하지 않고 문자열 new String("-")으로 하면 시간이 조금 더 걸리게 된다.
			   (즉, new연산자를 사용하지 말라는 이야기, 여기서는 일부러 시간이 걸리게하기 위해 사용됨)
			*/
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime-startTime));
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
			//"-"을 사용하지 않고 문자열 new String("|")으로 하면 시간이 조금 더 걸리게 된다.
		}
		endTime = System.currentTimeMillis();
		System.out.println("소요시간2 : " + (endTime-startTime));
		
	}

}
