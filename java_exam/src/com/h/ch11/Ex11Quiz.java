package com.h.ch11;

import java.util.*;

public class Ex11Quiz {

	public static void main(String[] args) {
		//1
		ArrayList<String> cars = new ArrayList<>();
		/* ArrayList<E>�� ���ǵ� ���׸� Ŭ�����̹Ƿ� ���������� ����� ������ ���� <����� ��������>�� ���
		   ��, 1.8�������ʹ� ArrayList<String> cars = new ArrayList<>(); �� ��밡�� 
		   ���׸��� ����� ArrayList cars���� �����Ķ���ʹ� String�̹Ƿ� String���� ��밡��
		*/
		
		//2
		cars.add("Volovo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia");
		
		//3
		System.out.println("3�� : " + cars); //Collection�� toString() ������(�������̵�)��
		
		//4
		System.out.println("4�� : " + cars.get(0));
		//ArratList�� �����͸� ��ȯ���ִ� �޼���� get(int index)
		
		//5
		cars.set(0, "Opel"); //����� set(int index, ���氪)
		System.out.println("5�� : " + cars);
		//6
		cars.remove(0); //remove(int index)
		System.out.println("6�� : " + cars);
		//7
		cars.clear();
		System.out.println("7�� : " + cars);
		//8
		cars.add("Volovo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Kia");
		System.out.println("8�� : " + cars);
		System.out.println();
		//9
		for(int i=0; i < cars.size(); i++) { //Collection ��������� ������ size()�� ����
			//System.out.println(i);
			System.out.println("9�� : " + cars.get(i));
		}
		System.out.println();
		
		//10
		//enhanced for���� �迭�� Collection�� ����
		for(String str : cars) {
			System.out.println("10�� : " + str);		
		}
		System.out.println();
		
		//11
		HashMap<String, String> capital = new HashMap<String, String>();
		
		//12
		capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Thokyo");
		
		System.out.println("11, 12�� : " + capital);
		//Map�� toString()�� ��������
		//{Japan=Thokyo, England=London, Germany=Berlin, Korea=Seoul}
		
		//13
		System.out.println("13�� : " + capital.get("England"));
		//get(key��)���� �� key�� �ش��ϴ� value�� ��ȯ
		
		
		//14
		capital.remove("England");
		System.out.println("14�� : " + capital);
		
		//15
		capital.clear();
	    System.out.println("15�� : " + capital);
		
		//16
	    capital.put("England", "London");
		capital.put("Korea", "Seoul");
		capital.put("Germany", "Berlin");
		capital.put("Japan", "Thokyo");

		//17
	    //enhanced for�� key�� ������ Set��ü�� �� key�� �ݺ��Ͽ� ��
	    for(String key : capital.keySet()) {
	    	//keySet()�� key�� ������ Set�� ��ȯ
			System.out.println("17�� : " + key + "capital value �� : " + capital.get(key));
		}
		System.out.println();
		
		//18
		Iterator<String> it = cars.iterator();
		
		//19
		while(it.hasNext()) {
			System.out.println("19�� : " + it.next());
		}
	}
}

/* 1.ArrayList��ü cars�� ����µ� ���׸����� StringŬ������ ���
   2.cars ��ü�� Volovo,BMW,Ford,Kia�� �߰�
   3.cars��ü�� ����Ʈ
   4.ù��° ����� ��Ҹ� ��ȯ�ϴ� �޼��带 �̿��Ͽ� ���
   5.ù��° ��Ҹ� Opel�� �����ϰ� ���
   6.ù��° ��Ҹ� �����ϰ� ���
   7.��� ��Ҹ� �����ϰ� ���
   8.cars�� �ٽ� 2�� �߰�
   9.�⺻ for������ cars�� �� ��Ҹ� ���
   10.enhanced for������ cars�� �� ��Ҹ� ���
   11.HashMap��ü capital�� ����µ� ���׸��� ��� key�� String, 
      value�� String�� ���׸� <String, String>�� ���
   12.England�� London, Korea�� Seoul, Germany�� Berlin, Japan�� Tokyo�� capital�� �߰�
      �ϰ� print(������� key�� ���)
   13.England�� value�� �� ���
   14.key�� England�� ��� ������ print
   15.��� ��� �����ϰ� print
   16.capital��ü�� �ٽ� 12�� �߰�
   17.for������ key set�� ��� �ش� Ű ���� �̿��� value�� print, keySet()���
   18.cars��ü�� Iterator��ü it ����
   19.it�� �̿��� cars�� ����� �� ���
*/
