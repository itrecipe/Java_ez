package com.h.programmers_exam;

import java.util.Scanner;

//��ҹ��� �ٲ㼭 ���
public class Solution3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		String result = ""; //����� ���� ���ڿ��� �ʱ�ȭ. result ������ ��ҹ��ڸ� ������Ų ���ڿ��� �����Ѵ�.
		
		for(int i = 0; i < a.length(); i++) { //�Է� ���� ���ڿ��� �� ���ھ� �ݺ������� ó���ϱ� ���� �ݺ���
			
			char c = a.charAt(i); //���ڿ� a���� ���� �ε��� i�� �ش��ϴ� ���ڸ� �����ͼ� ���� c�� �����Ѵ�.
			
			if(Character.isLowerCase(c)) { //c�� �ҹ������� Ȯ���Ѵ�.
										   // Character.isLowerCase() �޼���� �־��� ���ڰ� �ҹ������� Ȯ���Ͽ� true �Ǵ� false�� ��ȯ�Ѵ�.
				
				result += Character.toUpperCase(c); //c�� �ҹ����� ��� �ش� ���ڸ� �빮�ڷ� ��ȯ�Ͽ� result�� ���ڿ��� �߰��Ѵ�.
				
			} else {
				
				result += Character.toLowerCase(c); //c�� �빮���� ��� �ش� ���ڿ��� �ҹ��ڷ� ��ȯ�Ͽ� result�� ���ڿ��� �߰��Ѵ�.
				
			}
		}
		System.out.println(result);
	}
}