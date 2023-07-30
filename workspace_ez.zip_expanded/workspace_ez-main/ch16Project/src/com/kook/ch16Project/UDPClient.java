package com.kook.ch16Project;

import java.io.*;
import java.net.*;

public class UDPClient {
   
   public static void main(String[] args) throws Exception{
      new UDPClient().start();
   }
   void start() throws IOException{
      //데이터를 송수신할시에는 DatagramSocket을 사용
      DatagramSocket datagramSocket = new DatagramSocket();
      InetAddress address = InetAddress.getByName("172.30.1.21");
      
      byte[] msg = new byte[100];
      
      DatagramPacket outPacket = new DatagramPacket(msg, 1, address, 7777);
      DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
      
      datagramSocket.send(outPacket);//보내기
      datagramSocket.receive(inPacket);//받기
      
      System.out.println("current server time : "+new String(inPacket.getData()));
      datagramSocket.close();
   }
}