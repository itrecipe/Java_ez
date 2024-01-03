package com.h.ch16;

import java.io.*;
import java.net.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class UDPServer {

   public static void main(String[] args) throws Exception {
      
      new UDPServer().start();//�ڱ� Ŭ������ �ν��Ͻ� �޼��� ȣ��
         
      
   }
   void start() throws IOException{
      System.out.println("UDP ���� Start");
      DatagramSocket datagramSocket = new DatagramSocket(7777);
      //UDP ������ ��Ĺ
      //UDP���� ������ ó���ϴ� Ŭ����
      DatagramPacket inpacket , outPacket;
      //�����͸� ��Ŷ ������ ó�� (���� ����Ʈ�� �׷����� ó��),�⺻�� 4096����Ʈ
      
      byte[] inMsg = new byte[10];
      byte[] outMsg;
      
      while (true) {
         //�����͸� �����ϱ� ���� ��Ŷ�� �����Ѵ�
         inpacket = new DatagramPacket(inMsg, inMsg.length);
         //inMsg �� ���� �����͸� ���� �ϴ� �迭
         //2��° �Ű� ������ �о� ���̴� ũ��
         datagramSocket.receive(inpacket);
         //��Ŷ�� ���� �����͸� (receive) �Ѵ�
         //������ ��Ŷ���� ���� client�� IP�ּҿ� port�� ��´�
         InetAddress address = inpacket.getAddress();
         int port = inpacket.getPort();
         
         String hostAddress = address.getHostAddress();
         System.out.println("port : "+ port + "Host Address" + hostAddress);
         System.out.println("���� ������ : "+new String(inpacket.getData()));
         SimpleDateFormat dateFormat = new SimpleDateFormat("[hh:mm:ss}");
         String timeString = dateFormat.format(new Date());
         
         outMsg = timeString.getBytes();
         //String time dmf byte �迭�� ��ȯ
         //��Ŷ�� �����Ͽ� client���� �����Ѵ�
         outPacket = new DatagramPacket(outMsg, outMsg.length, address , port);
         datagramSocket.send(outPacket);
      }
      
      
   }
}