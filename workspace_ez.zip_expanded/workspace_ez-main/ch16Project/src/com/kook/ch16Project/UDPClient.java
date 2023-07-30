package com.kook.ch16Project;

import java.io.*;
import java.net.*;

public class UDPClient {
   
   public static void main(String[] args) throws Exception{
      new UDPClient().start();
   }
   void start() throws IOException{
      //�����͸� �ۼ����ҽÿ��� DatagramSocket�� ���
      DatagramSocket datagramSocket = new DatagramSocket();
      InetAddress address = InetAddress.getByName("172.30.1.21");
      
      byte[] msg = new byte[100];
      
      DatagramPacket outPacket = new DatagramPacket(msg, 1, address, 7777);
      DatagramPacket inPacket = new DatagramPacket(msg, msg.length);
      
      datagramSocket.send(outPacket);//������
      datagramSocket.receive(inPacket);//�ޱ�
      
      System.out.println("current server time : "+new String(inPacket.getData()));
      datagramSocket.close();
   }
}