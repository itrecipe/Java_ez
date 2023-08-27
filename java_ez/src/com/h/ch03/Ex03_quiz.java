package com.h.ch03;

public class Ex03_quiz {

	public static void main(String[] args) {
		//1~10�� ������ ���� ���� Ǭ�͵�
		
		//3,5 : int x,y�� �����ϰ� �ʱⰪ�� 10,5 ���� �ʱ�ȭ �Ѵ�
		int x = 10 , y = 5;
		
		//1. 10 * 5 ��� ���
		System.out.println("10 * 5 = " + x * y);
		
		//2. 10 / 5 ��� ���
		System.out.println("10 / 5 = " + x / y);
		
		//4. x���� 1 �������� ���(���� ������ ���)
		x = ++x;
		System.out.println("x + 1 ���� �� : " + x);
		
		x = 10;
		y = 5;
		
		//6. x�� y�� ������ ���Ͽ� ��� ���
		System.out.println("x�� y�� ������ �� : " + (x==y));
	
		//7. x�� y�� �ٸ��� ���Ͽ� ��� ���
		System.out.println("x�� y�� �ٸ��� �� : " + (x!=y));
		
		//8. ���ڿ� str1�� �����ϰ� �ʱⰪ abcde
		String str1 = "abcde";
		String xyz = "xyz";
			
		//9. str1�� null���� ���ϰ� ��� ���
		System.out.println("str1�� null���� �� : " + (str1==null)); 
		//���ڿ� �񱳽� == ��밡��
	
		//10. str1�� xyz���� ���ϰ� ���
		System.out.println("str1�� xyz���� �� : " + (str1==xyz));
		//���ڿ� ���ͷ�(��) �񱳽� == ��밡��
		
		//���� ���� ��������
		System.out.println("str1 �� ��� : " + str1.equals("xyz")); //���� �ٶ� equals�� ����ϴ°��� ����
		
		String str2 = new String("abcde"); //str1�� str2�� ���� ������ �ּҰ� �ٸ�
		//���������� String�� ���� ������ �ּҰ� �����
		System.out.println("str1�� str2�� ������ �� : " + (str1 == str2)); //������ �񱳽� ==�� �ּ� �񱳷� false
		System.out.println("str1�� str2�� ������ equals�޼���� �� : " + str1.equals(str2)); //���� ���ϹǷ� true
		
		String str3 = "abcde";
		System.out.println("str1�� str3�� ������ �� : "+ (str1 == str3));
		//���ͷ��� ���� String��ü�� ���� ������ �ּҰ� ����
		//��ҹ��� �����ϰ� ���� �񱳴� equalsIgnoreCase(str)
	}
}

/*
1. 10 * 5 ��� ��� 
2. 10 / 5 ��� ���
3. int x�� �����ϰ� �ʱⰪ�� 10���� �Ѵ�.
4. x���� 1 �������� ���(���� ������ ���)
5. int y�� �����ϰ� �ʱⰪ�� 5�� �Ѵ�.
6. x�� y�� ������ ���Ͽ� ��� ���
7. x�� y�� �ٸ��� ���Ͽ� ��� ���
8. ���ڿ� str1�� �����ϰ� �ʱⰪ abcde
9. str1�� null���� ���ϰ� ��� ���
10. str1�� xyz���� ���ϰ� ���
*/