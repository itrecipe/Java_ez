package com.h.ch14;

import java.util.function.*;

//Predicate��ü�� �����Ͽ� ����ϴ� �޼���
public class Ex14_03 {

	public static void main(String[] args) {
		
		Predicate<Integer> p = i -> i < 100; //i < 100�̸� true
		Predicate<Integer> q = i -> i < 100; //i < 200�̸� true
		Predicate<Integer> r = i -> i%2 == 0; //i�� ¦���� true
		
		Predicate<Integer> notP = p.negate(); //i >= 100 , !����
		Predicate<Integer> all = notP.and(q.or(r));
		/* - q��ü�� r��ü�� ||�����ѵ� notP��ü�� &&���� ����
		   - (i >= 100) && (i < 200 || i%2==0)
		   - ������ ����� test()�� ����.
		*/
		System.out.println("all.test() : " + all.test(150));
		
		String str1 = "abc";
		String str2 = "abc";
		
		/* - str1�� str2�� ������ ���� ����� ��ȯ
		   - ������� ������ Predaicate��ü�� ����� 
		   - Predicate�����佺�� static�޼����� isEqual(���Ұ�ü)���
		*/
		Predicate<String> p2 = Predicate.isEqual(str1);
		//���ڿ� str1�� �ٸ� ���ڿ��� ����񱳸� ���� ����� ��ü p2����
		boolean result = p2.test(str2); //p2��ü�� ���� str1�� str2�� �����
		
		System.out.println("result : " + result);
	}
}