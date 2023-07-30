package com.kook.ch14Project;

//Stream의 데이터 요소를 사용할 Comparable 구현한 클래스로 setter/getter클래스 구현
public class Student implements Comparable<Student> {
	private String name;
	private int ban;
	private int totalScore;
	
	//Comparable인터페스의 추상메서드 구현
	@Override
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore; //내림차순 기본 정렬
	}
	
	//Object에 있는 toString()을 재정의
	@Override
	public String toString() {
		//Object의 toString()은 객체의 주소를 반환
		return String.format("[%s,%d,%d]", name, ban, totalScore);
	}

	public Student() {
		super();
		
	}

	public Student(String name, int ban, int totalScore) {
		super();
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}

	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
}