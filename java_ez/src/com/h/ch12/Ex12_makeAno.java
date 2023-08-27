package com.h.ch12;
//국쌤예제(교재에 없는 내용-추가설명)
@TestInfo(
	count=3, testedBy="kim",testTools= {"JUnit", "AutoTester"}, testType=TestType.FIRST,
	testDate=@DateTime(yymmdd="160101", hhmmss="235959") 
)
public class Ex12_makeAno {

	public static void main(String[] args) {
		
		System.out.println("어노테이션 활용");
	}
}

//어노테이션 만들기
@interface TestInfo { //@interface로 어노테이션은 정의
	//추상메서드 형식으로 어노테이션에서 사용할 요소를 만든다(단, 파라미터는 없는 메서드 형식)
	int count();
	String testedBy();
	String[] testTools();
	TestType testType(); //enum을 사용할때 사용, enum TestType{FIRST,SECOND}
	DateTime testDate(); //TestDate는 다른 어노테이션
}

enum TestType {
	FIRST, SECOND
}

@interface DateTime {
	//인터페이스 구성요소는 추상메서드 형식
	String yymmdd(); //추상메서드형식
	String hhmmss();
}