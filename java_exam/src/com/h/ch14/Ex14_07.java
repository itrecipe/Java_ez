package com.h.ch14;

import java.util.*;
import java.util.stream.*;

/* - flatMap()�޼��� ���
   - Stream�� �����Ϳ�Ұ� �迭��� String[]ó�� �迭 ����϶� ������ 
     ���ڿ� ������ ��ҷ� ��ȯ�Ѵ�.
*/
public class Ex14_07 {
	public static void main(String[] args) {
	Stream<String[]> strArrStrm = Stream.of(
			new String[] {"abc", "def", "jkl"},
			new String[] {"ABC", "GHI", "JKL"}
			);
	/* - Stream�� ������ ������Ұ� String[] �̴�.
	   - �̶��� map()�޼��� ��� flatMap()�� ����ؾ� Stream<String>�� �ȴ�.
	   - map�� ����ϸ� Stream<Stream<String>>�� �ȴ�. 
	*/
	
	Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
	//Stream<Stream<String> strStrmStrm = strArrStrm.map(Arrays::stream);
	
	strStrm.map(String::toLowerCase) //�ҹ��ڷ� ��ȯ
	.distinct() //�ߺ� ����
	.sorted() //����(��������)
	.forEach(System.out::println); //�������� �ݺ�ó��
	
	String[] lineArr = {
		"Believe or not It is true",	
		"Do or do not is no try"
	};
	System.out.println("+++++++++++++");
	//lineArr�迭�� Stream���� ��ȯ
	Stream<String> lineStream = Arrays.stream(lineArr);
	lineStream.flatMap(line -> Stream.of(line.split(" +")))
	/* - �迭�� ���ڿ��� �޾Ƽ� �����ڸ� �̿��� �迭�� ��ȯ�Ѵ�.
	   - �����ڰ� " +"�ε� +�� ���ԽĿ��� ����ϴ� �ϳ� �̻��� ���ڸ� ��Ÿ����.
	   - ��, ������ �ϳ� �̻��̴�.
	   - �迭�� 1��� 2���� String[]�� ��ȯ
	*/
	.map(String::toLowerCase)
	.distinct()
	.sorted()
	.forEach(System.out::println);
	
	}
}