package com.kook.ch11Project;
//국.변
import java.util.*;

public class Ex11_04 {
	static Queue q = new LinkedList(); //클래스형 멤버변수(메서드들에서 모두 사용가능)
	//Queue는 인터페이스이므로 직접 객체를 생성 못하므로 자기를 구현한 클래스로 생성
	static final int MAX_SIZE = 5; //최근 5개
		
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있다.");
		
		while(true) {
			System.out.print(">>");
			
			//키보드로 콘솔창에서 입력 받기
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				//trim()은 문자열 앞뒤 공백 제거
				if("".equals(input)) {
					continue;
				}
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}
				else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줌");
					System.out.println(" q 또는 Q - 프로그램 종료");
					System.out.println(" history - 최근에 입력한 명령어를"
										+ MAX_SIZE + "개 보여줍니다.");
				}
				//23.1.17부터 이어서 다시할 예정
				//history입력시 처리
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}