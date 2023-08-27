package com.h.ch13;

//동기화를 사용한 처리
public class Ex13_13 {

	public static void main(String[] args) {
		Runnable r = new Runnable13();
		//thread2개가 run메서드를 실행
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);

		th1.start();
		th2.start();
	}
}

class Runnable13 implements Runnable {
	Account2 acc = new Account2();
	
	@Override
	public void run() {
		while(acc.getBalence() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100;
			//출금 금액을 100, 200, 300을 발생시킨다.
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalence()); //출금후 잔액
		}
	}	
}

class Account2 { //계좌 처리 클래스로서 공통으로 사용하는 자원 객체로 사용한다.(th1과 th2가 공동으로 사용하는 자원(임계영역이라는 의미))
	//모든 자바 클래스의 객체는 lock을 하나만 가진다.
	private int balance = 1000; //잔액
	
	public int getBalence() {
		return balance;
	}
	/* - 동기화를 처리 하지 않는 메서드로 th1과 th2가 동시에 처리할 수 있다.
	   - 잔액 처리가 안된 상태에서 다른 스레드가 사용
	   - 동기화가 되면 해당 메서드를 가진 객체에서 스레드중 하나에게만 lock을 제공한다.
	   - 메서드가 종료되면 lock을 반환(반납)한다.
	*/
	public synchronized void withdraw(int money) { //출금처리 money는 출금 금액, 동기화 처리
		if(balance >= money) {
			try {
				Thread.sleep(1000);
				balance -= money;
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}