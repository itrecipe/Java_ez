package com.kook.ch15Project;

import java.io.*;
import java.util.ArrayList;

//역직렬화는 직렬화된 문자열을 객체로 변경
public class Ex15_21 {

	public static void main(String[] args) {
		
		try {
			String fileName = "UserInfo.ser";
			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			ObjectInputStream in = new ObjectInputStream(bis);
			
			//객체를 읽을시에는 출력한 순서와 일치시켜야 한다.
			UserInfo u1 = (UserInfo)in.readObject();
			//readObject()는 반환이 Object이므로 형변환을 해줘야 한다.
			UserInfo u2 = (UserInfo)in.readObject();
			ArrayList list = (ArrayList)in.readObject();
			/* - toString()은 컴파일러가 자동으로 붙여준다.
			   - ex) System.out.println(u1.toString()); //이렇게 자동으로 되어 있다.
			*/
			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			//List는 기본적으로 toString()을 오버라이딩 하고 있다.
			in.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}