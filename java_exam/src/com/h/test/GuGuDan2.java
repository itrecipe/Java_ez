package com.h.test;

public class GuGuDan2 {

	public static void main(String[] args) {
		
		//���� n�� �Է� �޾Ƽ� �������� ����϶�
		
		/*
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		*/
		
		System.out.println("������ ���!");

		for(int i=2; i<10; i++) {
			System.out.println();
			for(int j=1; j<10; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
		System.out.println("");
		System.out.println("�ý����� ���� �մϴ�.");
	}
}