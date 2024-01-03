package com.h.test;

class Solution1 {
	
	public int solution1(int n) {
		
		int answer = 0;
	
		for (int i = 1; i <= n; i++) {
			if(i%2==0) {
				answer += i;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Solution1 answer = new Solution1();
		answer.solution1(10);
		
		System.out.println(answer.solution1(10));
	}
}

/*
 ���� n�� �־��� ��, 
 n������ ¦���� ��� ���� ���� return �ϵ��� 
 solution �Լ��� �ۼ����ּ���.
	
	����� �� ����
	����� �� #1

	n�� 10�̹Ƿ� 2 + 4 + 6 + 8 + 10 = 30�� return �մϴ�.
	����� �� #2

	n�� 4�̹Ƿ� 2 + 4 = 6�� return �մϴ�.
*/	