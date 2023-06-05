package com.kook.ch15Project;

import java.io.*;

public class Ex15_06 {

	public static void main(String[] args) {
		try {
		FileOutputStream fos = new FileOutputStream("123.txt"); //��ݽ�Ʈ��
		//������ ������ ���ܰ� �߻��ϸ� try ~ catch�� ����Ѵ�.
		BufferedOutputStream bos = new BufferedOutputStream(fos, 5); //������Ʈ��
		/* - BufferedOutputStream(outputStream�� ��� ��ü, ����Ʈ ũ��)
		   - ������Ʈ���� ������ ��� ��Ʈ�� ��ü�� �̿��Ͽ� ��ü�� �����. 
		   - ���� ����ũ�Ⱑ ������ �⺻�� 8192����Ʈ�� ���´�.
		*/
			for(int i='0'; i<='9'; i++) {
			 /* - ������Ʈ���� �̿��ҽ� read, write�޼���� ������Ʈ���� �޼��带 ����Ѵ�.
			    - �����δ� ��ݽ�Ʈ���� read, write�� ó���Ѵ�.
			 */
				bos.write(i);
			}
			//fos.close(); //���ۿ� �Ϻδ� ���´�.
			bos.close();
			/* - ������Ʈ�� ��ü�� close()�ϸ� �ڵ����� ��ݽ�Ʈ���� fos.close()�� �����ϸ�,
			     flush()�� �ڵ��� ����Ǿ� ���۸� ����ش�.			
			*/
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("������Ʈ���� �ؿ� 123.txt�� ������� ������Ʈ�� refresh�ؼ� Ȯ�� �غ���");

	}

}
