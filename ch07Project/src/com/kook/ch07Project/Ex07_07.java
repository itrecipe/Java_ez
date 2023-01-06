package com.kook.ch07Project;
//국쌤 변형 예제(원본과 상이)
//귝쌤 예제 - instanceof(교재에 없는 내용 추가)
public class Ex07_07 {

	public static void main(String[] args) {
		//다형성
		Car car = null;
		FireEngine fe = new FireEngine(); //객체생성
		FireEngine fe2;
		
		fe.water();
		car = fe; //다형성에 의해 부모 클래스의 객체에는 자손클래스 객체를 대입할 수 있음, 단 멤버(메서드,변수)는 부모것만 사용가능
		//car.water(); 자식의 멤버메서드이므로 사용불가
		
		fe2 = (FireEngine)car;
		//조상 객체를 자식 객체로 형변환하여 대입하면 자손객체의 멤버들을 사용가능
		fe2.water();
		
		//직접 만든 car객체
		Car car1 = new Car(); //Car 객체를 직접 만들어 사용
		
		//FireEngine fe3;
		
		//직접만든 조상 객체도 자손으로 형변환하면 자손의 메서드 사용불가
		//fe3 = (FireEngine)car1;
		//fe3.water();
		
		/*instanceof는 자동 형변환이 되는 다형성일시는 true이나,
		  부모를 자식형 참조변수에 대입할시 강제 현변환되므로 false가 나옴
		  instanceof 앞의 피연산자는 정의된 참조형변수이고 뒤 피연산자는 참조형 변수의 적용 가능한 클래스
		  앞의 피연산자가 조상이면 true
		 */
		if(fe instanceof FireEngine) {
			System.out.println("fe는 FireEngine형입니다.");
		}
		if(fe instanceof Car) {
			//상속한 클래스로 형변환이 가능(자식은 부모로 자동 형변환)
			System.out.println("fe는 Car형으로 형변환 가능합니다.");
		}
		if(fe instanceof Object) {
			//상속한 클래스로 형변환이 가능(자식은 부모로 자동 형변환)
			System.out.println("fe는 Obeject형으로 형변환 가능합니다.");
		}
		if(car1 instanceof FireEngine) {
			//car1은 Car객체이므로 false, 다형성으로 대입안했으므로 false
			System.out.println("car1은 FireEngine형으로 형변환 가능합니다.");
		}
		//상위객체를 하위객체로 변환하려면 바로하면 안되고 하위 객체를 대입한 상위객체를 만든 후 그 객체를 하위객체로 반환
		Object obj = new FireEngine();
		FireEngine fo = (FireEngine) obj;
		fo.water();
	}
}

class Car { //접근제어자 default
	String color; //접근제어자 default
	int door;
	
	void drive() { //접근제어자 default
		System.out.println("drive, Brrrr");
	}
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car { //Car 클래스를 상속
	//Car에 있는 멤버(멤버변수와 멤버메스드를 상속 --단 생성자와 초기화 블록은 상속 x, private멤버도 상속 x)
	void water() {
		System.out.println("water!!!");
	}
}