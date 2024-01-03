package com.h.ch14;
//���翣 ���� ���� ���� �߰����� ���� -p.580

import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.plaf.synth.SynthStyleFactory;

//Stream�� �߰�����޼���
public class Ex14_MiddStreamOP {

	public static void main(String[] args) {
		
		IntStream intStream = IntStream.rangeClosed(1, 10);
		//10�� �����ϴ� ������ int�� Stream��ü ���� 1,2,3,4,5,6,7,8,9,10���� �����Ϳ��
		intStream.skip(3).limit(5).forEach(System.out::println);
		/* - skip�� �տ��� 3���� �����ϴ� �߰� �������Ͽ� IntStream�� ��ȯ�Ѵ�.(3���� ������ ��Ʈ��) 
		   - limit�� 3���� ������ ��Ʈ������ 5���� ������ ���ο� stream�� �����.
		   - forEach�� ������������ limit�� ������ stream�� �����Ϳ�Ҹ� �ݺ� ���
		*/
		System.out.println();
		IntStream intStream01 = IntStream.of(1,2,2,3,3,3,4,5,5,6);
		intStream01.distinct().forEach(System.out::println);
		/* - distinct()�� �߰��������� stream��ü �����Ϳ���� �ߺ����� 1���� ó���Ͽ�
		     Stream���� ��ȯ
		*/
		System.out.println();
		IntStream intStream02 = IntStream.range(1, 10);
		intStream02.filter(i -> i%2==0).forEach(System.out::println);
		/* - filter(Predicate�� �Ķ����)�� �Ķ���Ͱ��� false�̸� ������ ��Ҹ� �����Ѵ�.
		   - filter�޼��嵵 stream�� ���������� ���� �ݺ� ó��
		   - Stream<T> filter<Prodicate<? super T> predicate)
		   - ���ǿ� ���� �ʴ� ��Ҹ� �����Ѵ�.
		   - filter()�� �Ķ���Ͱ� Predicate���̹Ƿ� �Ķ���� 1���� �޾� ���ϰ�,
		   	 ���������� true�ΰ͸� ��ȯ�Ѵ�.
		*/
		intStream02 = IntStream.rangeClosed(1, 10);

		System.out.println();
		// ���������� ���� stream��ü�� �ٽ� ����� �� ����.(�ٽ� ��� �Ϸ��� �ٽ� ���� �����ؾ���)
		intStream02.filter(i -> i%2!=0).filter(i->i%3!=0)
		.forEach(System.out::println);
		
		//sorted()�߰�ó�� �޼���
		System.out.println();
		Stream<String> strStream = Stream.of("dd", "aaa", "CC", "cc","b");
		strStream.sorted().forEach(System.out::println);
		/*
		  - sorted()�� Comparable�� ����ϴ� �⺻�� ����
		  - (������ ����, �빮�ڰ� �ҹ��ں��� ����)
		*/
		
		System.out.println();
		//�տ��� strStream�� forEach������������ �Ҹ������Ƿ� �ٽ� ����
		strStream = Stream.of("dd", "aaa", "CC", "cc", "b");
		strStream.sorted(String.CASE_INSENSITIVE_ORDER)
		.forEach(System.out::println);
		/*
		  - ���Ľ� Comaprable�� �⺻ ������ �ƴ϶�,
		    ���� ������ �ַ��� sorted(Comparator c)���·� �ٲ۴�.
		  - String.CASE_INSENSITIVE_ORDER�� ��ҹ��ڸ� �����ϰ� �����ϴ� ����(�ҹ��ڷ� ��ȯó��)
		  - Comparator<String> CASE_INSENSITIVE_ORDER
		*/
		
		
	}
}
