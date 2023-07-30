package com.kook.ch05Project;

public class Ex05_09 {

	public static void main(String[] args) {
		//국쌤 변형 예제(원본과살짝다름)
		int[][] score = {
				//4행 * 3열 배열 int[4][3]
				//선언과 동시에 리터럴로 초기화
				{100, 100, 100},
				{20, 30, 20},
				{30, 40, 50},
				{45, 55, 67}
		};
		
		//과목별 총점
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("=============================");

		for(int i=0; i < score.length; i++) {
			int sum = 0; //번호별 총점
			float avg = 0.0F; //번호별 평균
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1); //번호 값 출력(3칸으로 잡음) %n이 없어서 줄 안바꿈
			
			for(int j=0; j < score[i].length; j++) { //각 열의 배열값
				sum += score[i][j];	//각 행의 3과목 점수 총합
				System.out.printf("%5d", score[i][j]);
			}
			
			avg = sum/(float)score[i].length; //평균계산
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("=============================");
		System.out.printf("총점 : %3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}

}
