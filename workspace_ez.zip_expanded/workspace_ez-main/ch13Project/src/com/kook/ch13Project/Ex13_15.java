package com.kook.ch13Project;

import java.util.*;

public class Ex13_15 {

	public static void main(String[] args) throws Exception {
		Table table = new Table();
		new Thread(new Cook(table), "COOK").start(); //"COOK"은 스레드명, Runnable객체를 한줄로 작성하여 생성
		new Thread(new Customer(table, "donut"),"CUST1").start(); //작성시 배열에 있는 것을 써야한다. ex)"donut"
		new Thread(new Customer(table, "burger"),"CUST2").start(); //작성시 배열에 있는 것을 써야한다. ex)"burger"
		
		Thread.sleep(2000);
		System.exit(0);
	}

}
class Customer implements Runnable {
	private Table table;
	private String food;
	
	Customer(Table table, String food) {
		super();
		this.table = table;
		this.food = food;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
		}
	}
}

class Cook implements Runnable {
	private Table table;
	
	Cook(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum());
			//색인번호를 임의로 생성
			table.add(table.dishNames[idx]); //요리사가 공급하는 요리를 테이블에 추가
			try {
				Thread.sleep(10);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}	
}

class Table { //Cook과 Customer이 공동으로 사용하는 자원용 클래스
	String[] dishNames = { "donut", "donut", "burger" }; //제공되는 요리
	final int MAX_FOOD = 6; //테이블의 제공되는 최대 요리개수
	private ArrayList<String> dishes = new ArrayList<String>(); //테이블에 제공되는 요리를 저장
	
	public synchronized void add(String dish) { //동기화 메서드로 1개의 스레드만 사용가능
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName(); //현재 메서드를 사용하는 스레드 확인
			System.out.println(name + " is waiting"); //테이블당 최대 요리개수 초과이므로 대기하기 위해 정지
			try {
				wait(); //Cook스레드를 대기 시킨다, wait(), notify등은 Object것이므로 여기서는 Table의 메서드
				//wait()는 현재 동기화 스레드를 사용하는 thread를 Table객체의 waiting pool로 보낸다.
				Thread.sleep(500); //sleep(500)은 0.5초 대기하라는 의미
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		dishes.add(dish); //해당 add는 ArrayList의 add이다.
		notify(); //기다리고 있는 Customer스레드를 깨우기 위함
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public void remove(String dishName) { //dishName은 먹은 요리
		synchronized (this) { //동기화를 현재 Table객체에 적용
			String name = Thread.currentThread().getName(); //현재 메서드를 사용하는 스레드를 확인
			
			while(dishes.size()==0) {
				System.out.println(name + " is waiting"); //Customer스레드 대기
				try {
					wait(); //Customer스레드를 기다리게 한다.
					Thread.sleep(500);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			//테이블에 요리가 있는 경우
			while(true) {
				for(int i=0; i < dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i); //ArrayList의 remove(색인번호)로 해당 요소의 값을 제거
						notify(); //wait하고 있는 Cook을 깨우기 위함
						return;
				}
			}
			//테이블에서 먹어서 제거하고 난후에는 요리 공급시까지 wait
			try {
				System.out.println(name + " is wating");
				wait(); //원하는 음식이 없는 Customer쓰레드를 기다리게 한다.
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e.getCause());
			}
		} //while(true)
	} //while(synchronized)
} //remove
	public int dishNum() {
		return dishNames.length;
	}
}