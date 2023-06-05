package com.kook.ch15Project;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex15_03 {

	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; 
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source :  " + Arrays.toString(inSrc));
		
		
/*		// - 남은 개수만큼만 가져와서 write하려면 다음 처럼 처리한다.  
		try {
			while(input.available() > 0) {
				 // - available() 메서드는 입력 스트림에서 읽어올수 있는 데이터의 개수를 반환한다.
				 // - read하면 read된 원소는 제외한다.
				
				
				input.read(temp); //배열 temp크기 만큼 읽어와서 배열을 채우고, 데이터개수를 반환한다.
				//read는 기존 temp배열을 이용하여 덮어쓴다.
				output.write(temp); //배열 temp에 저장된 모든 원소를 출력 스트림에 작성한다.
				//write시 기존 출력 스트림에 추가한다.
				outSrc = output.toByteArray(); //toByteArray() 출력 스트림을 바이트 배열로 변환한다.
				printArrays(temp, outSrc);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
*/
		try {
			while(input.available() > 0) {
				// - available() 메서드는 입력 스트림에서 읽어올수 있는 데이터의 개수를 반환한다.
				// - read하면 read된 원소는 제외한다.
				
				int len = input.read(temp); //배열 temp크기 만큼 읽어와서 배열을 채우고, 데이터개수를 반환한다.
				//read는 기존 temp배열을 이용하여 덮어쓴다.
				output.write(temp, 0, len); //배열 temp에 저장된 모든 원소를 출력 스트림에 작성한다.
				//write시 기존 출력 스트림에 추가한다.
				outSrc = output.toByteArray(); //toByteArray() 출력 스트림을 바이트 배열로 변환한다.
				printArrays(temp, outSrc);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp          : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}
}