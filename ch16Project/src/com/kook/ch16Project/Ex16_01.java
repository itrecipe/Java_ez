package com.kook.ch16Project;

import java.net.*;
import java.util.*;

public class Ex16_01 {

	public static void main(String[] args) {
		//InetAddress는 ip주소를 처리하는 클래스
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com");
			//host명(도메인명)으로 InetAddress객체를 반환한다.
			System.out.println("getHostName() : " + ip.getHostName());
			//host명(도메인명 www.naver.com)
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			//해당 InetAddress객체의 숫자 주소 (실제 naver의 주소 : 223.130.200.104)
			System.out.println("toString() : " + ip.toString());
			//www.naver.com/223.130.200.107로 변환
		}
		catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}