package com.h.ch16;

import java.net.*;

public class Ex16_02 {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://www.javachobo.com:80/sample/" +
				 			"hello.html?referer=javachobo#index1");
		//URL객체 생성시 URL(String 자원 경로);
		System.out.println("url.getAuthority() : " + url.getAuthority());
		//host명과 포트번호
		System.out.println("url.getDefaultPort() : " + url.getDefaultPort());
		//기본 포트 번호
		System.out.println("url.getPort() : " + url.getPort());
		//현재 포트번호
		System.out.println("url.getFile() : " + url.getFile());
		//host와 포트번호를 제외한 경로와 자원명, 그리고 쿼리문(인덱스는 제외)
		System.out.println("url.getHost() : " + url.getHost());
		//DNS(host명)
		System.out.println("url.getPath() : " + url.getPath());
		//host와 port를 제외한 자원명까지 출력(쿼리문 제외)
		System.out.println("url.getProtocol() : " + url.getProtocol());
		//프로토콜명 http
		System.out.println("url.getQuery() : " + url.getQuery());
		//?뒤에 쿼리문들
		System.out.println("url.getRef() : " + url.getRef());
		//#뒤의 인덱스문
		System.out.println("url.getUserInfo() : " + url.getUserInfo());
		//사용자 정보
		System.out.println("url.toExternalForm() : " + url.toExternalForm());
		//URL객체를 문자열로 변환
		System.out.println("url.toURI() : " + url.toURI());
		/* - URL객체를 URI객체로 변환
		   - Uniform Resource Identifier
		   - URI가 URL보다 포괄적인 URL은 포로토콜등이 있어야 하는데 URI는 그냥 구분만 하는 개념이다.
		*/
	}
}