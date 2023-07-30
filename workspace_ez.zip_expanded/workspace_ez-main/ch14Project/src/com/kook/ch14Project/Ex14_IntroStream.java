package com.kook.ch14Project;

import java.util.*;
import java.util.stream.*;

//���ܿ���(���翡 ����, �߰�����) ����-568p
public class Ex14_IntroStream { //IntroStream : ��Ʈ���� �Ұ��Ѵٴ� �ǹ�

	public static void main(String[] args) {
		//�迭�̳� Collection�� �����͵��� ���� ó���ϱ� ���� Stream�� ���
		String[] strArr = {"aaa", "ddd", "ccc"};
		List<String> strList = Arrays.asList(strArr);
		/* - Stream ��ü�� ��ȯ
		   - Collection���� stream���� ��ȯ���ִ� stream()�� ��ģ��.
		*/
		Stream<String> strStream1 = strList.stream();
		//Interface Stream<T>
		
		//�迭�� Stream���� ��ȯ�� Arrays�� static�޼����� stream(�迭)�� ����Ѵ�.
		Stream<String> strStream2 = Arrays.stream(strArr); //stream���� �ٲ��.
		
		//Stream���� �����ϴ� �޼��带 �̿�
		strStream1.sorted().forEach(System.out::println);
		strStream2.sorted().forEach(System.out::println);
	}

}