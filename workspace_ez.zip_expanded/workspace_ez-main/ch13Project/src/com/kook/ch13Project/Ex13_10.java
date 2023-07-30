package com.kook.ch13Project;
//국.변(여기있는 예제는 있다는 정도만 알것, 교재 저자와 국썜이 비사용을 권고하는 예제)
public class Ex13_10 {
	
	@SuppressWarnings("removal") //"removal"이라는 경고를 띄우지 말라는 의미
	public static void main(String[] args) {
		// deprecated된 suspend(),resume(),stop()메서드
		RunImplEx10 r = new RunImplEx10();
		Thread th1 = new Thread(r, "*");
		/* - Thread(Runnable target, String name)
		   - Runnable객체 r과 스레드명 name을 사용한 생성자
		*/
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000); //메인스레드 정지
			th1.suspend(); //th1스레드 정지
			Thread.sleep(2000);
			th2.suspend();//th2스레드 정지
			Thread.sleep(3000);
			th1.resume(); //다시 runnable(다시시작)
			Thread.sleep(3000);
			th1.stop(); //스레드 종료
			th2.stop(); //스레드 종료
			Thread.sleep(2000);
			th3.stop();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

class RunImplEx10 implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName()); //currentThread() : 현재스레드가 무엇인지 구함 
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}