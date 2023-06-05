package com.kook.ch15Project;

import java.io.*;
import java.util.*;

public class Ex15_20 {

	public static void main(String[] args) {
		
		try {
			String fileName = "UserInfo.ser"; //직렬화 값을 작성할 파일
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("JavaMan", "1234", 30);
			UserInfo u2 = new UserInfo("JavaWoman", "4321", 26);
			
			ArrayList<UserInfo> list = new ArrayList<>();
			//ArrayList도 Serializable 인터페이스를 구현한 클래스
			list.add(u1);
			list.add(u2);
			
			/* - 객체를 직렬화 한다.
			   - (ObjectOutputStream의 writeObject(객체)로 출력 대상 파일에 출력
			*/
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			
			out.close();
			System.out.println("직렬화가 잘 끝났다");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
