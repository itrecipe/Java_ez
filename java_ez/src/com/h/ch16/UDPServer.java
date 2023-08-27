package com.h.ch16;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class UDPServer {

   public static void main(String[] args) throws Exception {
      
      new UDPServer().start();//자기 클래스의 인스턴스 메서드 호출
         
      
   }
   void start() throws IOException{
      System.out.println("UDP 서버 Start");
      DatagramSocket datagramSocket = new DatagramSocket(7777);
      //UDP 서버용 소캣
      //UDP에서 데이터 처리하는 클래스
      DatagramPacket inpacket , outPacket;
      //데이터를 패킷 단위로 처리 (여러 바이트를 그룹으로 처리),기본이 4096바이트
      
      byte[] inMsg = new byte[10];
      byte[] outMsg;
      
      while (true) {
         //데이터를 수신하기 위한 패킷을 생성한다
         inpacket = new DatagramPacket(inMsg, inMsg.length);
         //inMsg 는 수신 데이터를 저장 하는 배열
         //2번째 매개 변수는 읽어 들이는 크기
         datagramSocket.receive(inpacket);
         //패킷을 통해 데이터를 (receive) 한다
         //수신한 패킷으로 부터 client의 IP주소와 port를 얻는다
         InetAddress address = inpacket.getAddress();
         int port = inpacket.getPort();
         
         String hostAddress = address.getHostAddress();
         System.out.println("port : "+ port + "Host Address" + hostAddress);
         System.out.println("수신 데이터 : "+new String(inpacket.getData()));
         SimpleDateFormat dateFormat = new SimpleDateFormat("[hh:mm:ss}");
         String timeString = dateFormat.format(new Date());
         
         outMsg = timeString.getBytes();
         //String time dmf byte 배열로 변환
         //패킷을 생성하여 client에게 전송한다
         outPacket = new DatagramPacket(outMsg, outMsg.length, address , port);
         datagramSocket.send(outPacket);
      }
      
      
   }
}