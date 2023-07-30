package com.kook.ch14Project;
import java.util.*;
import java.util.stream.*;

//Student�� �����Ϳ�ҷ� ����ϴ� Stream��ü�� ����
public class Ex14_05 {

	public static void main(String[] args) {
		
		Stream<Student> studentStream = Stream.of(
				new Student("���ڹ�", 3, 300),
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 2, 100),
				new Student("���ڹ�", 2, 150),
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 3, 290),
				new Student("���ڹ�", 3, 180)
				);
		/* Comparator�� �޼��带 �̿��Ͽ� Ư������ ���Ͽ� �����Ҷ��� Comparable �������̽���
		   ������ Ŭ������ ���ؼ��� �Ķ���Ͱ� �ϳ��� comparing()�� ����Ѵ�.
		*/
		studentStream.sorted(Comparator.comparing(Student::getBan)
				.thenComparing(Comparator.naturalOrder()))
				.forEach(System.out::println);
		/* - Comparing()�� Ư������ �̿��� �ø�����
		   - Comparator.naturalOrder()�� Comparable���� ������ Student���� ������
		     compareTo()���� ������ �������� ���� ����� ����Ѵ�.
		*/
	}
}