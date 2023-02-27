package com.kook.ch15Project;

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
		
		
	}
}
