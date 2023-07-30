package com.kook.ch16Project;

import java.net.*;
import java.util.*;

public class Ex16_01 {

	public static void main(String[] args) {
		//InetAddress�� ip�ּҸ� ó���ϴ� Ŭ����
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		try {
			ip = InetAddress.getByName("www.naver.com");
			//host��(�����θ�)���� InetAddress��ü�� ��ȯ�Ѵ�.
			System.out.println("getHostName() : " + ip.getHostName());
			//host��(�����θ� www.naver.com)
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			//�ش� InetAddress��ü�� ���� �ּ� (���� naver�� �ּ� : 223.130.200.104)
			System.out.println("toString() : " + ip.toString());
			//www.naver.com/223.130.200.107�� ��ȯ
			byte[] ipAddr = ip.getAddress();
			//1����Ʈ�� ������ ip��巹���� ��ȯ
			System.out.println("getAddress() : " + Arrays.toString(ipAddr));
			//byte�� -128 ~ 127���� �̻��� ���� ������ -�� ǥ���ȴ�.
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
			ip = InetAddress.getLocalHost(); //���α׷��� ����Ǵ� �� PC�� IP�ּ�
			System.out.println("getHostName() : " + ip.getHostName());
			System.out.println("getHostAddress() : " + ip.getHostAddress());
			System.out.println();
			
			ipArr = InetAddress.getAllByName("www.naver.com");
			//DNS������ ����ϴ� ��� ip address(�밳 2���� ����Ѵ�.)
			for(int i=0; i < ipArr.length; i++)
				System.out.println("ipArr["+ i +"] : " + ipArr[i]);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}