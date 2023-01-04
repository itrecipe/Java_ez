package com.kook.ch07Project;

public class StudentDTO {
	private String name;
	private int no;
	private int grade;
	private String address;
	private int phone;
	
	public StudentDTO() { //기본 생성자 생성
		super();
	}
	
	//모든 멤버변수를 사용하는 생성자
	public StudentDTO(String name, int no, int grade) {
		super();
		this.name = name;
		this.no = no;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}

	public int getGrade() {
		return grade;
	}

	public String getAddress() {
		return address;
	}

	public int getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
}
