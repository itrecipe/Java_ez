package com.kook.ch14Project;

import java.util.*;

public class Ex14_04 {

	public static void main(String[] args) {
		//Collection �����ӿ�ũ�� ���� �Լ��� �������̽� ��� �޼��� ����
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		/* - list�� ��� ��Ҹ� ����ϴ� �޼���� ArrayList�� �ִ� forEach���
		   - void forEach(Consumer<E> action)
		   - forEach�� �Ķ���ʹ� Consumer �Լ��� �������̽� ��ü ���
		*/
		list.forEach(i -> System.out.print(i + ","));
		/* - forEach�� �Ķ���ͷ� ���ٽ��� �ٷ� ���, forEach�� �ڵ����� ���Ұ��� �ݺ�ó�� �Ѵ�.
		   - i�� list��ü�� ���Ұ��� ��Ÿ����.
		*/
		System.out.println();
		
		/* - boolean removeIf(Predicate<E> filter)�� �Լ��� �������̽�, (boolean�� ��ȯ)
		   - Predicate ��ü�� �Ķ���ͷ� ���
		   - �÷��� list�� ��� ��Ҹ� �ݺ��ؼ� ó��
		*/
		list.removeIf(x -> x%2==0 || x%3==0);
		//list�� ��Ұ� 2�� 3�� ����̸�, true�϶� �ش� ��Ҹ� �����Ѵ�.
		System.out.println(list);
		
		list.replaceAll(i -> i * 10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<>();
		//Map<K, V>
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		/* - Map�� void forEach(BiConsumer<K, V> action)
		   - ��, �Ķ���͸� 2���� �ް� ó���� ��ȯ���� ó���Ѵ�, �޼���� void accept(K, V)
		*/
		map.forEach((k, v)-> System.out.print("{" + k + "," + v + "}"));
		/* - map�� forEach���� BiConsumer�� �����ϴ� ���ٽ��� ���
		   - map�� ��ҵ��� �ݺ��Ͽ� ó���Ѵ�.
		*/
		System.out.println();
	}
	
}