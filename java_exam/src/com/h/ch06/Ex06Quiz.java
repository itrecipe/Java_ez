package com.h.ch06;
//���� ����!
public class Ex06Quiz {
	//1. �ν��Ͻ� ������ ���ڿ� ���� string
	String string;
	
	//2. Ŭ������ ���� int�� ���� number
	static int number;
	
	//11. static��� ����� ��Ͼ��� ���๮�� static���
	static {
		System.out.println("static");
	}
	
	//12. �ν��Ͻ� ��� ����� ��Ͼ��� ���๮�� instance���
	//��ü�� �����Ҷ����� ���� ������ �����ڷ� �ʱ�ȭ
	{
		System.out.println("instance");
	}
	
	public static void main(String[] args) {
		
	//4. 3���� �޼��� ȣ��
		myMethod(); //Ŭ������ �޼��峻���� ����Ŭ������ Ŭ������ �޼��� ȣ��ô�
		//Ŭ������.�޼���()�� �ƴ� �޼�������� ȣ��
		
		//6. 5���� �޼��带 ȣ���ϴµ� ���ڸ� kook���� �ؼ� ȣ��
		myMethod("kook");
		//8. �ν��Ͻ��޼��� instanceMethod�� ȣ���ϴµ� ���ڷ� "ȫ�浿"�� ���
		//���� Ŭ�����̳� static�޼���ȿ��� �ν��Ͻ� �޼��� ȣ��� �ڱ� Ŭ���� ��ü�� �����
		//��ü.�ν��Ͻ��޼���(���ڰ�); �̷������� ȣ��
		Ex06Quiz hgd = new Ex06Quiz();
		hgd.instanceMethod("ȫ�浿");
		
		//9. �ν��Ͻ����� string�� abcde�� �ʱ�ȭ�ϰ� ���
			//�ڱ�Ŭ������ �ν��Ͻ� ������ Ŭ�����޼���ȿ����� �̸����� ������ �ȵǰ�
			//��ü�� ����� ����
			hgd.string = "abcde";
			System.out.println(hgd.string);
		
	//10. Ŭ���� ���� number�� 30���� �ʱ�ȭ �ϰ� ���
		//Ŭ���� �޼���ȿ��� �ڱ�Ŭ������ Ŭ���� ��������� ��ü.���������ε� ���� ����	
		number = 30;
		System.out.println(number);
	}
	
	/* 3. Ŭ������ �޼��� myMethod�� ����Ÿ���� ���� �Ķ���͵� ������ ���๮��
	     System.out.println("I just got executed!"); */
	static void myMethod() {
		System.out.println("I just got executed!");
	}
	
	/* 5. 3���� myMethod�� �����ε��� �޼���� ����µ� �Ķ���͸� String name���� �ϰ�
	      ���๮�� name�� ��� */
	static void myMethod(String name) {
		System.out.println(name);
	}
	
	/* 7. �ν��Ͻ� �޼����� �̸� instanceMethod�̰� ����Ÿ���� ���ڿ��̸�
		 �Ķ���ʹ� ���ڿ��� �ϳ��� �Ǿ� �ְ� �Ķ���ͷ� ���� ���� ��� �ϰ� ���ϰ��� khs�� ���� */
	String instanceMethod(String name) {
		System.out.println(name);
		return "khs";
	}
}
