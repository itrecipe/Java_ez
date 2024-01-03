package com.h.ch13;
//데몬스레드는 보조스레드를 처리할때 사용, 가장 대표적인 것은 자동저장 기능이 있다.

//main클래스인 Ex13_07을 스레드 클래스로 정의
public class Ex13_07 implements Runnable { //Runnable을 구현한 스레드 클래스
	static boolean autoSave = false; 
	/*여기서 static으로 작성한 이유는 메인메서드가 static이기 때문에
	  static -> static으로 바로 호출하여 사용하려면 이렇게 해줘야한다.
	  호출시, 멤버메소드명과 동일하게 호출하면 된다.
	 */
	
	@Override //보조 스레드용 run()로서 메인스레드가 종료되면 자동으로 종료된다.
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			if(autoSave) {
				autoSave();
			}
		}
	}
	
	public void autoSave() {
		System.out.println("작업 파일 autoSave");
	}
	
	public static void main(String[] args) {
		//main메서드는 JVM에서 main스레드로 만들어 준다.(기본제공)
		Runnable r = new Ex13_07();
		Thread t = new Thread(r); //Runnable객체를 사용하려면 객체 r을 넣어주면됨
		//한줄작성법 : Thread t = new Thread(new new Ex13_07());
		t.setDaemon(true); //스레드 t를 보조 스레드인 daemon스레드로 사용 (true로 해줘야함)
		t.start(); //그 다음에 start() 작성
		//여기서 보조 스레드의 일반 스레드는 main스레드		
		//아래 부분은 main스레드가 실행
		for(int i=1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
			
			if(i == 5) {
				autoSave = true;
			}
			System.out.println("프로그램 종료!");
		}

	}

}
