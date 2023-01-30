package com.kook.ch11Project;
//국.변
//주석옆에 v표시가 있으면 중요한것들(기억해둘것들)
import java.util.*;

public class Ex11_04 {
	static Queue q = new LinkedList(); //클래스형 멤버변수(메서드들에서 모두 사용가능) v
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
				//equals() 문자열 비교 메서드, 대소문자 구분
				if("".equals(input)) {
					continue;
				}
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}
				else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줌!");
					System.out.println(" q 또는 Q - 프로그램 종료!");
					System.out.println(" history - 최근에 입력한 명령어를"
										+ MAX_SIZE + "개 보여줍니다.");
				}
				//history입력시 처리
				//equalsIgnoreCase() 문자열 비교 메서드, 대소문자 구분 x
				else if(input.equalsIgnoreCase("history")) { 
					int i = 0; //i는 요소 개수
					save(input);
					LinkedList tmp = (LinkedList)q; //v
					/* Queue는 LinkedList가 구현을 함, 인터페이스 참조변수를
					   자기를 구현한 하위클래스 객체로 변환하려면 형변환이 필요함
					   LinkedList에 있는 요소들에 접근을 하려면 ListIterator객체가 필요함
					   ListIterator 객체는 LinkedList의 listIterator()메서드를 이용
					*/
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println(++i + "." + it.next());
						//남아있는 것중에서 처음 것을 반환
					}
				}
				else {
					save(input);
					System.out.println(input);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	static void save(String input) {
		//Queue q에 저장
		if(!("".equals(input))) {			
			q.offer(input); //Queue에 저장할때 offer()메서드 사용q
		}
		
		if(q.size() > MAX_SIZE) {
			q.remove(); //v
			/* Queue는 (FIFO)-First in First out(맨처음 입력이 맨처음 출력)
			   첫번째로 저장한 요소 삭제
			*/
		}
	}
}