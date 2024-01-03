package com.h.ch10;

import java.time.*;
import java.time.format.DateTimeFormatter;

//���翡 ���� ���� - ���� �߰����� ����
public class Ex10Time {

	public static void main(String[] args) {
		//�ڹ� 1.8���� �߰��� time��Ű���� Ŭ������
		LocalDate myobj = LocalDate.now(); //���� ��¥(��,��,��)�� ��Ÿ���� ��ü
		System.out.println(myobj); //2023-01-16
		//LocalDateŬ������ Object���� ����� toString()�� ������(�������̵�)��
		//ex)System.out.println(myobj.toString());
		
		LocalTime myobj1 = LocalTime.now(); //���� �ð��� ��Ÿ���� ��ü
		System.out.println(myobj1); //09:37:45.630369100(10����� 1�ʱ��� ǥ��)
		//LocalTimeŬ������ Object���� ����� toString()�� ������ ��
		//ex)System.out.println(myobj1.toString());
		
		LocalDateTime myobj2 = LocalDateTime.now(); //��¥ + �ð� ǥ�� ��ü
		System.out.println(myobj2.toString());
		//2023-01-16T09:43:59.025973800 ��¥�� �ð����̿� T�� ÷����
		
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before formattiong : " + myDateObj);
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		//����ȭ ��ü�� �̿��Ͽ� ��¥�ð� ��ü�� ��ȯ
		//SimpleDateFormat���� �޸� ��¥��ü.format(����ȯ��ü)
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After formatting : " + formattedDate);
	}

}
