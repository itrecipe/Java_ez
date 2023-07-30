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
			byte[] ipAddr = ip.getAddress();
			//1바이트씩 구분한 ip어드레스를 반환
			System.out.println("getAddress() : " + Arrays.toString(ipAddr));
			//byte는 -128 ~ 127보다 이상의 값이 나오면 -로 표현된다.
			String result = "";
			System.out.println(ipAddr.length);
			for(int i=0; i < ipAddr.length; i++) {
				result += (ipAddr[i] < 0 ? ipAddr[i] + 256 : ipAddr[i]) + ".";
			}
			System.out.println("getAddress() + 256 : " + result);
			System.out.println();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			ip = InetAddress.getLocalHost(); //프로그램이 실행되는 내 PC의 IP주소
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println();
			
			ipArr = InetAddress.getAllByName("www.naver.com");
			//DNS서버가 사용하는 모든 ip address(대개 2개를 사용한다.)
			for(int i=0; i < ipArr.length; i++)
				System.out.println("ipArr["+ i +"] : " + ipArr[i]);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}