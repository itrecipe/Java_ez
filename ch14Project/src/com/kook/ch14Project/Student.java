package com.kook.ch14Project;

//Stream�� ������ ��Ҹ� ����� Comparable ������ Ŭ������ setter/getterŬ���� ����
public class Student implements Comparable<Student> {
	private String name;
	private int ban;
	private int totalScore;
	
	//Comparable�����佺�� �߻�޼��� ����
	@Override
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore; //�������� �⺻ ����
	}
	
	//Object�� �ִ� toString()�� ������
	@Override
	public String toString() {
		//Object�� toString()�� ��ü�� �ּҸ� ��ȯ
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