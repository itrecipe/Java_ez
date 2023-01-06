package com.kook.ch07Project;

//1. StudentDTO를 만듬(studentDTO.java)
public class StudentDTO {
	//2. 멤버변수를 전부 접근제어자를 private로 한다.
	//3. 멤버변수는 name, no(학번), grade(학년), address, phone으로 한다.
	private String name;
	private int no;
	private String grade;
	private String address;
	private String phone;
	
	//4. 생성자는 기본형과 모든 멤버변수를 파라미터로 하는 생성자, name, no, grade만 파라미터로 하는 생성자를 만듬(3개)
	
	//(1)기본 생성자 생성
	public StudentDTO() { //기본 생성자 생성
		super();
	}
	
	//(2)모든 멤버변수를 사용하는 생성자
	public StudentDTO(String name, int no, String grade, String address, String phone) {
		super();
		this.name = name;
		this.no = no;
		this.grade = grade;
		this.address = address;
		this.phone = phone;
	}

	//(3)name,no,grade만 파라미터 값으로 넘겨받는 생성자
	public StudentDTO(String name, int no, String grade) {
		super();
		this.name = name;
		this.no = no;
		this.grade = grade;
	}
	
	//5. GETTER와 SETTER 메서드를 만듬
	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}

	public String getGrade() {
		return grade;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}