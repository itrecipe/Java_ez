package com.kook.ch07Project;

public class Ex07Quiz1 {

		public static void main(String[] args) {
			/*6. main 메서드에서 StudentDTO객체를 sdto로 하여 만드는데 객체 생성시 StudentDTO의 모든 멤버 변수를 사용하는
		     생성자를 사용하여 만듬(값은 알아서 집어넣기) */
			StudentDTO sdto = new StudentDTO("카리나", 13, "2학년", "강서구","010-1234-4321");
			
			//7. StudentDTO의 각 멤버변수를 출력
			System.out.println("name : " + sdto.getName());
			System.out.println("no : " + sdto.getNo());
			System.out.println("grade : " + sdto.getGrade());
			System.out.println("adress : " + sdto.getAddress());
			System.out.println("phone : " + sdto.getPhone());
			
			//8. StudentDTO의 각 멤버변수를 변경해보시오(알아서 변경)
			sdto.setName("윈터");
			sdto.setNo(10);
			sdto.setGrade("1학년");
			sdto.setAddress("양천구");
			sdto.setPhone("010-1234-5678");
			
			//9. 변경 후 멤버변수를 출력
			System.out.println("name : " + sdto.getName());
			System.out.println("no : " + sdto.getNo());
			System.out.println("grade : " + sdto.getGrade());
			System.out.println("adress : " + sdto.getAddress());
			System.out.println("grade : " + sdto.getPhone());
		}
	}

	//1. StudentDTO를 만듬(studentDTO.java)
	//2. 멤버변수를 전부 접근제어자를 private로 한다.
	//3. 멤버변수는 name, no(학번), grade(학년), address, phone으로 한다.
	//4. 생성자는 기본형과 모든 멤버변수를 파라미터로 하는 생성자, name, no, grade만 파라미터로 하는 생성자를 만듬(3개)
	//5. GETTER와 SETTER 메서드를 만듬
	/*6. main 메서드에서 StudentDTO객체를 sdto로 하여 만드는데 객체 생성시 StudentDTO의 모든 멤버 변수를 사용하는
	     생성자를 사용하여 만듬(값은 알아서 집어넣기) */
	//7. StudentDTO의 각 멤버변수를 출력
	//8. StudentDTO의 각 멤버변수를 변경해보시오(알아서 변경)
	//9. 변경 후 멤버변수를 출력