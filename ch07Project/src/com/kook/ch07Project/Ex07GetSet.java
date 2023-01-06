package com.kook.ch07Project;
//국쌤 예제 - 교재에 없는 내용
public class Ex07GetSet {

	public static void main(String[] args) {
		//TimeDTO를 이용하기
		TimeDTO dto = new TimeDTO(12,35,40);
		//int hour = dto.hour; TimeDTO의 멤버변수들은 모두 접근제어자가 private이므로 접근이 불가
		//접근은 접근제어자가 public인 메서드를 통해 접근해야함.
		//멤버변수값은 get메서드로 얻고 설정, (변경)은 set메서드로 해줌.
		System.out.println("hour : " + dto.getHour());
		System.out.println("minute : " + dto.getMinute());
		System.out.println("second : " + dto.getSecond());
	
		//값을 변경시 해당 멤버변수의 set메서드를 사용
		dto.setHour(10);
		dto.setMinute(32);
		dto.setSecond(44);

		System.out.println("hour : " + dto.getHour());
		System.out.println("minute : " + dto.getMinute());
		System.out.println("second : " + dto.getSecond());
	}
}
