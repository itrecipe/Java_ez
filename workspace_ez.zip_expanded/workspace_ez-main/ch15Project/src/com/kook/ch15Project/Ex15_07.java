package com.kook.ch15Project;
//국.변
import java.io.*;
import java.util.*;

public class Ex15_07 {

	public static void main(String[] args) {
		//Stream이므로 byte배열 사용
		byte[] arr1 = {0, 1, 2};
		byte[] arr2 = {3, 4, 5};
		byte[] arr3 = {6, 7, 8};
		byte[] outSrc = null;
		
		//Vector는 List계열 컬렉션
		Vector v = new Vector();

		//ByteArrayInputStream은 메모리에 바이트 배열을 사용하는 Stream
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
		SequenceInputStream input = new SequenceInputStream(v.elements());
		/* - SequenceInputStream은 보조 스트림으로 여러개의 스트림을 연결하여 하나처럼 처리한다.
		   - Vector의 elements() 메서드는 Enumeration 객체를 반환하고 Enumeration객체의 원소는
		     ByteArrayInputStream 객체로 구성된다.
		 */
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		try { 
			while((data = input.read()) != -1) {
				output.write(data); //메모리에 써준다.
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		outSrc = output.toByteArray(); //바이트 배열로 변경
		//배열을 문자열 형식으로 변환하는 메서드는 Arrays의 static메서드인 toString()을 사용
		System.out.println("Input Source1 : " + Arrays.toString(arr1));
		System.out.println("Input Source2 : " + Arrays.toString(arr2));
		System.out.println("Input Source3 : " + Arrays.toString(arr3));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
		
		//2개의 기반 스트림 객체(File)를 파라미터로 하는 SequenceInputStream객체를 생성하여 사용
		try {
			FileInputStream file1 = new FileInputStream("file001.txt");
			FileInputStream file2 = new FileInputStream("123.txt");
			
			SequenceInputStream input1 = new SequenceInputStream(file1, file2);
			//두개의 FileInputStream객체를 이용해 SequenceInputStream을 만든다.
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}