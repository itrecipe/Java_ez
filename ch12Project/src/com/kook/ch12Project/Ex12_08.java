package com.kook.ch12Project;

import java.lang.annotation.*;
@Deprecated
@SuppressWarnings("1111") //value요소 하나이므로 value를 생략 값이 1111, 유효하지 않은 애너테이션은 무시된다.
/*
@Target(value={TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
@Retention(value=SOURCE)
 */
@TestInfo1(testedBy="kim", testDate=@DateTime1(yymmdd="160101", hhmmss="235959"))
//나머지 요소 count, testTools, testType은 default값을 적용하므로 작성 안함
public class Ex12_08 { //@Derprecated를 사용해서 deprecated(삭선)표시가 됨

	public static void main(String[] args) {
		//Class Class<T>
		Class<Ex12_08> cls = Ex12_08.class; //어느 클래스의 객체는 자바파일을 컴파일한 클래스파일이 된다.
		
		TestInfo1 anno = cls.getAnnotation(TestInfo1.class);
		System.out.println("anno.testedBy() : " + anno.testedBy());
		/* - 어노테이션을 사용하는 클래스에 포함된 어노테이션 객체는 getAnnotation(TestInfo1.class)으로 얻는다.
	       - 어노테이션에 설정된 요소들의 값을 알아내기는 어노테이션 객체.어노테이션의 요소(메서드 형식)
	    */
		System.out.println("anno.testDate().yymmdd() : " + anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss() : " + anno.testDate().hhmmss());
		
		for(String str : anno.testTools())
			System.out.println("testTools : " + str);
		
		System.out.println(); //자바는 JUnit 사용
		
		/* getAnnotations()는 클래스파일에 사용하는 모든 어노테이션을 배열로 반환
		   유효하지 않은 SuppressWarnings는 제외하고 반환 (즉, 문법이 틀리다는 의미이다.)
		*/
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr)
			System.out.println(a);
	}
}

@Retention(RetentionPolicy.RUNTIME) //실행시 사용가능하도록 지정(RetentionPolicy : CLASS, SOURCE 포함하고 있음)
@interface TestInfo1 {
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit"; //배열인데 값이 하나이므로 { } 생략
	TestType1 testType() default TestType1.FIRST; //enum을 사용할때 사용, enum TestType{FIRST,SECOND}
	DateTime1 testDate(); //TestDate는 다른 어노테이션
}

@Retention(RetentionPolicy.RUNTIME) //실행시 사용가능하도록 지정
@interface DateTime1 {
	String yymmdd();
	String hhmmss();
}

enum TestType1 {
	FIRST, FINAL
}