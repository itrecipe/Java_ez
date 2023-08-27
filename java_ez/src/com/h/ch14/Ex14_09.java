package com.h.ch14;

import java.util.*;
import java.util.stream.*;

//Stream�� reduce()����������
public class Ex14_09 {

	public static void main(String[] args) {
		
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		
		Stream.of(strArr).forEach(System.out::println);
		//�迭 strArr�� Stream��ü�� ���� ����Ѵ�.
		
		boolean noEmptyStr =
				Stream.of(strArr).noneMatch(s -> s.length() == 0);
		//noneMatch()�� ��� ��Ұ� ���ǿ� ���� ������ true
		System.out.println("noEmptyStr : " + noEmptyStr);
		
		Optional<String> sWord = Stream.of(strArr)
				.filter(s->s.charAt(0)=='s') //ù��° ��Ұ� s�ΰ��� ��󳻼�
				.findFirst(); //�� �� ù��°�ΰ��� ã����� �ǹ�
		
		//ù ���ڰ� s�� ���۵Ǵ°͸� ������ �� �� �� ù��° �͸� ��ȯ
		System.out.println("sWord = " + sWord.get());
		
		//���ڿ� Stream�� mapToInt()�� �⺻�� Stream�� IntStream���� ��ȯ�Ѵ�.
		IntStream intStream1 = 
				Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = 
				Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = 
				Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = 
				Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b) -> a + 1); //count() ���� ����
		/* - reduce(�ʱⰪ, BinaryOpperator��ü)�޼���� �ʱⰪ�� 
		   - BinaryOpperator��ü�� �ΰ��� �Ķ������ ù��° �Ķ���ͷ� ����Ѵ�.
		     �������� ���ϰ��� �ʱⰪ���� �Ͽ� �ݺ��� �Ѵ�.
		*/
		int sum = intStream2.reduce(0, (a,b) -> a + b); //sum() ���� ����
		
		OptionalInt max = intStream3.reduce(Integer::max);
		//�� ����� ���ڿ� �� ���� �� ���ڿ��� ���ڼ� 
		OptionalInt min = intStream4.reduce(Integer::min);
		//�� ����� ���ڿ� �� ���� ���� ���ڿ��� ���ڼ� 
		
		System.out.println("count = " + count);
		System.out.println("sum = "  + sum);
		System.out.println("max = " + max.getAsInt());
		//OptionalInt��ü ���� get()�� �ƴ� getAsInt()�� �������
		System.out.println("min = " + min.getAsInt());
				
	}
}
