package com.kook.ch14Project;

import java.io.File;
import java.util.stream.Stream;

//map중간연산 메서드
public class Ex14_06 {

	public static void main(String[] args) {
		/* - <R> Stream<R> map(Function<? super T,? extends R> mapper)
		     앞에 <R>표시가 있어서 제네릭 메서드이다.
		   - 파라미터로 T를 받아 R을 반환하는 함수형인터페이스 Function을 사용한다.
		*/
		File[] fileArr = {
				new File("Ex1.java"),			
				new File("Ex1.bak"),				
				new File("Ex2.bak"),
				new File("Ex1"),
				new File("Ex1.txt")
		};
		//File(String pathname)생성자는 파라미터로 파일의 경로명을 이용해 파일 객체를 만든다.
		
		Stream<File> fileStream = Stream.of(fileArr);
		//map()으로 Stream<File>을 Stream<String>으로 변환
		Stream<String> filenameStream = fileStream.map(File::getName);
		//File객체를 받아 문자열인 file명으로 반환한다.
		filenameStream.forEach(System.out::println);
		//forEach(최종연산)으로 stream을 소모했으므로 없어진다.
		System.out.println("====++++++++++++=====");
		fileStream = Stream.of(fileArr);
		//중간연산도 각각의 데이터요소에 대해 최종연산 처리를 하면서 반복한다. 
		fileStream.map(File::getName) //String Stream
		.filter(s -> s.indexOf('.')!= -1) //확장자를 표시 .이 있는것만 선택한다.
		.peek(s -> System.out.printf("filename=%s%n", s))
		//peek는 중간중간 처리내용을 확인할때 사용한다.
		.map(s -> s.substring(s.indexOf('.')+1)) 
		// .이후의 확장자 문자열만 선택한다.
		.peek(s -> System.out.printf("extension=%s%n", s))
		.map(String::toUpperCase) //대문자로 변환
		.distinct() //중복제거
		.forEach(System.out::println);
		//map은 중간연산이므로 여러번 수행가능

	}
}