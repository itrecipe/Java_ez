package com.h.ch09;

public class Ex09_12 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		/* 생성자 중 문자열을 파라미터로 갖는 생성자(문자열 + 16개문자 수용 char배열 만들어 처리)
		   new StirngBuffer()는 초기화 문자열 없이 크기가 16인 char배열 만들어 처리
		   new StirngBuffer(int length)는 초기화 문자열은 없이 char배열 크기만 지정
		*/
		
		StringBuffer sb2 = sb.append(23);
		/* append는 파라미터로 모든 데이터형을 사용할 수 있는 오버로딩된 메서드이고
		   리턴은 자기 자신 객체 sb2와 sb는 주소가 같은 객체
		   append는 chaining방식(메서드를 계속 연결하여 사용가능)
		*/
		sb.append('4').append(56); //sb의 값이 변경되면 주소 값은 sb2의 값도 동일하게 변경됨
		
		StringBuffer sb3 = sb.append(56);
		sb3.append(9.0); //sb,sb2,sb3의 값이 모두 변경됨
		
		System.out.println("sb = " + sb);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb3 = " + sb3);
		
		System.out.println("sb = " + sb.deleteCharAt(10)); 
		//sb(변수명).deleteCharAt(10) : 색인번호 10번에 있는 문자 하나를 삭제하고 sb자신을 반환 
		System.out.println("sb = " + sb.delete(3,6));
		//색인번호 3번부터 6-1번까지 문자를 제거한 자신을 반환
		System.out.println("sb = " + sb.insert(3,"abc"));
		//색인번호 3번앞에 abc 삽입
		System.out.println("sb = " + sb.replace(6, sb.length(), "END"));
		//색인번호 6번부터 크기-1(마지막 색인번호)까지를 END로 교체
		
		System.out.println("capacity = " + sb.capacity()); //버퍼의크기
		System.out.println("length = " + sb.length()); //문자개수
		
		boolean b = Boolean.parseBoolean("Valid");
		/* boolean값의 문자열 true,false boolean으로 변환
		   나머지는 모두 false
		*/
		
		System.out.println(b);

		boolean b1 = Boolean.getBoolean("isValid");
		System.out.println(b1);
	}

}
