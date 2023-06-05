package com.kook.ch13Project;
//국.변
public class Ex13_11 {

	public static void main(String[] args) {
		//Thread.yield()와 스레드객체.join()
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		
		//th1과 th2스레드는 자신 스레드의 run()를 수행(Runnable을 거쳐서 실행됨)
		th1.start();
		th2.start();
		long startTime = System.currentTimeMillis();
		try {
			/* - join()도 예외처리를 해줘야한다.(join을 걸어주면 예외가 발생하기 때문)
			   - main스레드는 중단되며 th1을 수행하여 종료된후 main스레드가 다시 동작한다.
			*/  
			th1.join(); //main스레드가 join호출
			th2.join(); //main스레드가 join호출
			//join()가 모두 완료되면 다시 main스레드 동작
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("소요시간 : " + (System.currentTimeMillis() - startTime));
	}
}

class ThreadEx11_1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("-")); //시간을 좀더 오래걸리게 하기위해 출력문에 new String() 사용
		}
		System.out.println("th1 종료");
	}
}
class ThreadEx11_2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("|")); //시간을 좀더 오래걸리게 하기위해 출력문에 new String() 사용
		}
		System.out.println("th2 종료");
	}	
}