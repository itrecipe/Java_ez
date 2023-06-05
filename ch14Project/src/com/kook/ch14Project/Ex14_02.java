package com.kook.ch14Project;

import java.util.function.*;
import java.util.*;

public class Ex14_02 {

	public static void main(String[] args) {
		
		Supplier<Integer> s;
		/* - �Լ��� �������̽� Supplier<T>�� �Ķ���� ���� ��ȯ�� T������ �ϴ� �߻�޼���
		     T get()�� ���´�.
		   - �Լ��� �������̽� ��ü�� �߻�޼��带 �����ϴ� ���ٽ����� ����
		*/
		s = () -> (int)(Math.random() * 100) + 1; //99���� ���� ������ +1����
		
		Consumer<Integer> c;
		/* - �Լ��� �������̽� Consumer�� �Ķ���Ͱ� 1���̰� ���ϰ��� ���� �߻�޼���
		   - public abstract void accept(T t)�� ���� �ִ�.
		   - �Լ��� �������̽� ��ü�� �߻�޼��带 �����ϴ� ���ٽ����� ����
		*/
		c = i -> System.out.println(i + ", ");
		Predicate<Integer> p;
		/* - �Լ��� �������̽� Predicate<T>�� �Ķ���� �ϳ��� ������ boolean�� �ϴ�
		   - �߻�޼��� boolean test(T t)�� ���´�.
		*/
		p = i -> i % 2 == 0;
		
		Function<Integer, Integer> f;
		/* �Լ��� �������̽� Function�� �Ķ���Ͱ� 1���̰� ����Ÿ���� �ִ� �߻�޼���
		   R apply(T t)�� ���´�.
		*/
		f = i -> i / 10 * 10;
		
		List<Integer> list = new ArrayList<Integer>();
		makeRandomList(s, list);
		System.out.println(list);
		
		printEvenNum(p, c, list);
		
		List<Integer> newList = doSomething(f, list);
		
		System.out.println(newList);
		
	}
	
	//���׸� Ŭ������ �ƴ� Ŭ������ �޼��忡�� ���׸� ����� ���� ���׸� Ŭ������ ����
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i<10; i++) {
			//list��ü�� ���ٽ����� ������ get�޼��带 ȣ���Ͽ� ��ȯ�Ǵ� ���� add
			System.out.println(s.get());
			list.add(s.get());
		}
	}
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.println("[");
		for(T i : list) {
			if(p.test(i)) {
				c.accept(i);				
			}
		}
		System.out.println("]");
	}
	
	//�޼��带 ����ϴ� ���׸��� T�� ���׸� �޼����� T�� ���
	static <T> List<T> doSomething(Function<T, T> f, List<T> list){
		List<T> newList = new ArrayList<T>(list.size());
		for(T i : list) { 
			newList.add(f.apply(i));
		}
		return newList;
	}
}