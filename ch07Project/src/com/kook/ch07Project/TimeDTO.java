package com.kook.ch07Project;
//국쌤 예제 - 교재에 없는 내용

//캡슐화를 위한 클래스
public class TimeDTO {
	//캡슐화를 위해선 다른 클래스에서 멤버변수로 바로 접근이 불가능한 private을 사용
	//멤버변수 접근은 getter와 setter메서드를 통해서 함
	//private 접근제어자는 자기클래스내에서만 접근가능
	private int hour;
	private int minute;
	private int second;

	//이클립스 제공 getter, setter, 생성자를 만들어주기 활용
	/* 대상 클래스에 커서를 대고 우클릭 -> source선택 -> 
	   1.generate constructor using superclass(슈퍼클래스(기본) 생성자 생성기능)
	   2.generate constructor using fields(모든멤버변수생성자 생성하는기능) 
	   3.gennerate getters and setters (getter & setter 생성기능)
	*/
	
	//기본 생성자
	public TimeDTO() {
		super();
	}

	//모든 멤버변수를 사용하는 생성자
	public TimeDTO(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//각 멤버변수에 대한 get메서드와 set메서드
	//get메서드는 멤버변수 반환
	//set메서드는 멤버변수 변경
	//이름은 get멤버변수명, set멤버변수명 (멤버변수의 첫자를 대문자(카멜케이스)로 사용)
	//get메서드는 리턴값이 해당 멤버변수값을 반환(리턴형을 멤버변수의 데이터 형)
	//set메서드는 return데이터형은 void, 파라미터는 설정할 멤버변수를 사용
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}
}
