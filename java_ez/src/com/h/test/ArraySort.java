package com.h.test;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		int array[] = {5, 4, 3, 2, 1}; //1���� �迭 ����
		
		Arrays.sort(array);
		
		for(int i : array) {
			System.out.println("��� : " + i);
		}
		System.out.println("�ý��� ����");
	}

 }
