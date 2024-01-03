package com.h.ch14;
//���ܿ���(�߰�����, ���翡 ���� ����)

import java.util.*;
import java.util.stream.*;

public class Ex14_StreamMaking {

	public static void main(String[] args) {
		/* - Collection�������̽����� stream()�޼��尡 �����ϹǷ� Collection�� ���� 
		     Ŭ������ List, Set���� ������ stream() �޼��带 ������.
		   - Stream<E> stream(); , stream()�޼���� Stream��ü�� ��ȯ
		*/
		
		// List�� �ۼ��� ��ü�� stream��ü�� ��ȯ
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();
		/* - ��Ʈ�� ��ü�� �̿��� ��Ʈ���� �޼��带 ����
		   - forEach�� list�� ���� stream�� �����͸� ���� �ݺ��� ���ؼ� ���ٽ����� ó��
		*/
		intStream.forEach(System.out::println);
		
		/* - ���� ���ڸ� ����Ͽ� Stream�����
		   - Stream�� static�޼��� of���
		*/
		Stream<String> strStream1 = Stream.of("a", "b", "c", "d");
		//strStream2�� ����(�Ķ����)�� �迭�� ���� �־���
		Stream<String> strStream2 = Stream.of(new String[]{"a", "b", "c"});
		//strStream3�� static�޼��� arrays�� stream�޼��带 ����Ѵ�.
		Stream<String> strStream3 = Arrays.stream(new String[]{"a", "b", "c"});
		
		Stream<String> strStream4 = 
				Arrays.stream(new String[]{"a", "b", "c"},0,3);
		//0�� ���ι�ȣ 0�̸�, end���ι�ȣ�� 3~1���� ����
		
		//�⺻�� Stream�����
		IntStream intStream1 = IntStream.of(1, 2, 3);
		IntStream intStream2 = IntStream.of(new int[]{1, 2, 3});
		IntStream intStream3 = Arrays.stream(new int[]{1, 2, 3});
		IntStream intStream4 = 
				Arrays.stream(new int[]{1, 2, 3},0,3);
		
		intStream4.forEach(System.out::println); //����غ���
		
		//RandomŬ������ �̿��� ������ �⺻�� ��Ʈ�� �����
		IntStream intStream5 = new Random().ints();
		/* - ints() ���Ѱ��� ������ ���� IntStream�� ����
		   - RandomŬ������ java.util
		*/
		intStream5.limit(5).forEach(System.out::println);
		
		DoubleStream doubleStream1 = new Random().doubles(5);
		doubleStream1.limit(5).forEach(System.out::println);
		
		IntStream intStream6 = IntStream.range(1, 5);
		//1, 2, 3, 4�� ���� ���� IntStream��ȯ
		intStream6.forEach(System.out::println);
		
		IntStream intStream7 = IntStream.rangeClosed(1, 5);
		//1, 2, 3, 4, 5�� ���� ���� IntStream��ȯ
		intStream7.forEach(System.out::println);

		IntStream intStream8 = new Random().ints(1, 5);
		//Random�� ints()�� ����ϴ°͵� �����ϴ�. (�̶��� 5�� �������� �ʴ� ���� stream�� �����Ѵ�.)
		intStream8.limit(4).forEach(System.out::println);
		
		//iterate()�� generate()�� static�̸� ���ѹݺ��� Stream��ü ����
		Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2);
		//���� Stream�� �����, seed���� �̿��ϰ� ���ϰ��� �������� seed�� �ȴ�. 
		evenStream.limit(10).forEach(System.out::println);
	
		Stream<Double> geStream = Stream.generate(Math::random);
		geStream.limit(5).forEach(System.out::println);
		
		//����ִ� Stream��ü�� ����� ����ϴ� ���� null�� ����ϴ°ͺ��� �ǰ��Ѵ�.
		Stream emptyStream = Stream.empty();
		long count = emptyStream.count();
		System.out.println("count : " + count);
		
	
	}
}