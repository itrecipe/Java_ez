package com.h.ch06;
//���� ���� ����(��������¦�ٸ�)
public class Ex06_11 { //main�޼��带 ���� �ִ� ���� Ŭ�����̹Ƿ� ���������ڰ� public

	public static void main(String[] args) {
		//MainClass�� main�޼���� �ַ� �ڱ� ������Ʈ�� �ٸ� Ŭ������ ��ü�� �����ϰ�
		//�� ��ü�� �޼������ ȣ���Ͽ� ������Ʈ ���� ó��
		Data0611_1 d1 = new Data0611_1();
		d1.value = 10; //��ü ������ ��ü�� ��������� �ʱ�ȭ
		
		Data0611_2 d2 = new Data0611_2(10);
		//2���� ������ �� �Ķ���Ͱ� 1���� �����ڸ� ���
		
		Data0611_2 d3 = new Data0611_2();
		// 2���� ������ �� �Ķ���Ͱ� ���� ������ ���
		d3.value = 50;
	}
}

//���� Ŭ���� 1���� �ش� Ŭ������ java������ �Ѱ����� �ϳ� �ٸ� Ŭ������ java ���Ͽ� �����ص� ����
class Data0611_1{
	int value; //Ŭ������ ���, �ν��Ͻ� ����
	//�����ڰ� ���������� �����Ƿ� �ڹٰ� �����Ͻ� �⺻ �����ڸ� �߰� ����
}

class Data0611_2 {
	int value;
	
	//���������� �����ڸ� ����� �ָ� �ڹ� �����Ϸ��� �ڵ� �������ִ� �⺻ �����ڴ� �����
	//�ٸ� �����ڰ� ������ �⺻ �����ڵ� ���������� �ۼ��� �ִ� ���� �ǰ�
	
	Data0611_2(){
		super(); //super�� �Ƚ��൵ ��������� �������ִ°��� �ǰ��Ѵٰ� ��
	}
	
	Data0611_2(int x){
		super(); //����Ŭ������ �����ڸ� ȣ��(�ڵ� ȣ��� �ۼ� �����൵ �ڹ� �����Ϸ��� ����)
		value = x; //��ü ������ ������� �ʱ�ȭ;
	}
}