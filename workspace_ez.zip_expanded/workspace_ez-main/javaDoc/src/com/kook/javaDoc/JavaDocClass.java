package com.kook.javaDoc;

/**
 * 
 * @author Kook
 * Date : 2023-01-25
 *
 */

public class JavaDocClass {
	/**
	 * 
	 * @param args
	 * main method
	 */
	public static void main(String[] args) {
		myMethod();
	}
	
	/**
	 * 메서드 생성
	 * this method is made by kook
	 * test method
	 */
	static void myMethod() {
		System.out.println("javadoc test");
	}
}

/* javadoc 파일 생성 및 사용방법 프로젝트 우클릭 export클릭 javadoc클릭
   생성할 프로젝트 확인후에 설정할게 더 있으면 next 설정할게 없거나 자동으로 되어있으면 바로 finish
   버튼 눌러서 생성하면 된다. 
   
   (생성시 주의할점 pakege를 선택해야 만들어둔것들이(생성자,public,default형 메소드드들 등...)
   다 보이며, private은 안보이는것 같은데 따로 선택을 해서 만들어줘야 보인다는것 같다 
   해당 부분은 좀더 알아보고 숙지할것!)
   
   한글 깨짐이 전에는 있었지만 현재 사용중인 JDK1.5 ~ 1.7 버전은 업데이트가 잘 되어 있어 안깨지는것 같다
*/
