package com.kook.ch14Project;

import java.io.File;
import java.util.stream.Stream;

//map�߰����� �޼���
public class Ex14_06 {

	public static void main(String[] args) {
		/* - <R> Stream<R> map(Function<? super T,? extends R> mapper)
		     �տ� <R>ǥ�ð� �־ ���׸� �޼����̴�.
		   - �Ķ���ͷ� T�� �޾� R�� ��ȯ�ϴ� �Լ����������̽� Function�� ����Ѵ�.
		*/
		File[] fileArr = {
				new File("Ex1.java"),			
				new File("Ex1.bak"),				
				new File("Ex2.bak"),
				new File("Ex1"),
				new File("Ex1.txt")
		};
		//File(String pathname)�����ڴ� �Ķ���ͷ� ������ ��θ��� �̿��� ���� ��ü�� �����.
		
		Stream<File> fileStream = Stream.of(fileArr);
		//map()���� Stream<File>�� Stream<String>���� ��ȯ
		Stream<String> filenameStream = fileStream.map(File::getName);
		//File��ü�� �޾� ���ڿ��� file������ ��ȯ�Ѵ�.
		filenameStream.forEach(System.out::println);
		//forEach(��������)���� stream�� �Ҹ������Ƿ� ��������.
		System.out.println("====++++++++++++=====");
		fileStream = Stream.of(fileArr);
		//�߰����굵 ������ �����Ϳ�ҿ� ���� �������� ó���� �ϸ鼭 �ݺ��Ѵ�. 
		fileStream.map(File::getName) //String Stream
		.filter(s -> s.indexOf('.')!= -1) //Ȯ���ڸ� ǥ�� .�� �ִ°͸� �����Ѵ�.
		.peek(s -> System.out.printf("filename=%s%n", s))
		//peek�� �߰��߰� ó�������� Ȯ���Ҷ� ����Ѵ�.
		.map(s -> s.substring(s.indexOf('.')+1)) 
		// .������ Ȯ���� ���ڿ��� �����Ѵ�.
		.peek(s -> System.out.printf("extension=%s%n", s))
		.map(String::toUpperCase) //�빮�ڷ� ��ȯ
		.distinct() //�ߺ�����
		.forEach(System.out::println);
		//map�� �߰������̹Ƿ� ������ ���డ��

	}
}