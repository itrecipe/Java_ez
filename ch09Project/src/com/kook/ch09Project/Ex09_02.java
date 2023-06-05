package com.kook.ch09Project;
//국.변
public class Ex09_02 {

	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L); //long형이라 숫자뒤 L(롱형이라는뜻)을 붙여줌
		Person p2 = new Person(8011081111222L);
		//참조변수값(주소값)은 다름, 저장된 값은 동일함
		
		//equals()메서드는 Person클래스에서 Object의 것을 재정의한 메서드
		if(p1.equals(p1)) {
			System.out.println("p1과 p2는 같은 사람이다.");
		} else { 
			System.out.println("p1과 p2는 다른 사람이다.");
			
		}
		p1.test("kook");
		p1.test1("kook1");
		
	}
}

/*extends Object : 생략됨, 사용해도 상관은없지만 굳이 작성할 필요는 없다*/
class Person {
	long id;
	//생성자
	Person() {
		super();
	}
	
	Person(long id) {
		this.id = id;
	}
	
	//상속한 Object의 equals()메서드를 재정의
	@Override
	public boolean equals(Object obj) { //헤더는 Object의 헤더를 그대로 사용
		if(obj instanceof Person) {
			//Person클래스로 만든 객체일시에만 비교, 다른 클래스로 만든 객체일 경우 무조건 false
			return id == ((Person)obj).id;
			/* obj는 상위 클래스인 Object의 객체이므로 하위클래스인 Person의 멤버를 사용하려면
			하위클래스로 형변환을 해줘야함 */
		}
		return false;
	}
	//교재에 없는 내용
	public void test(Object obj) {
		String str = (String) obj; //하위클래스인 문자열을 받아 상위클래스 ojb를 문자열로 반환
		//obj객체는 하위클래스의 모든 메서드나 멤버변수를 사용
		System.out.println("str은 : " + str);
		//실제 받은 obj는 String이고 String에는 toString()이 생략되어 있어 정상적으로 값 출력됨.
		System.out.println("obj " + obj);
	}
	public void test1(String str) {
		Object obj = str; //하위 클래스를 사용하면 Object의 멤버만 사용가능
		//파라미터가 아닌것을 상위 클래스에 대입하면 실제 대입된 객체의 멤버 사용
		System.out.println("obj 값 : " + str);
	}
}