package com.h.ch14;

import java.util.*;
import java.util.stream.*;

//Stream?˜ reduce()ìµœì¢…?—°?‚°?
public class Ex14_09 {

	public static void main(String[] args) {
		
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
		};
		
		Stream.of(strArr).forEach(System.out::println);
		//ë°°ì—´ strArr?„ Streamê°ì²´ë¡? ë§Œë“¤?–´?„œ ì¶œë ¥?•œ?‹¤.
		
		boolean noEmptyStr =
				Stream.of(strArr).noneMatch(s -> s.length() == 0);
		//noneMatch()?Š” ëª¨ë“  ?š”?†Œê°? ì¡°ê±´?— ë§ì? ?•Š?œ¼ë©? true
		System.out.println("noEmptyStr : " + noEmptyStr);
		
		Optional<String> sWord = Stream.of(strArr)
				.filter(s->s.charAt(0)=='s') //ì²«ë²ˆì§? ?š”?†Œê°? s?¸ê²ƒì„ ê³¨ë¼?‚´?„œ
				.findFirst(); //ê·? ì¤? ì²«ë²ˆì§¸ì¸ê²ƒì„ ì°¾ìœ¼?¼?Š” ?˜ë¯?
		
		//ì²? ê¸??ê°? së¡? ?‹œ?‘?˜?Š”ê²ƒë§Œ ?„ ?ƒ?•œ ?›„ ê·? ì¤? ì²«ë²ˆì§? ê²ƒë§Œ ë°˜í™˜
		System.out.println("sWord = " + sWord.get());
		
		//ë¬¸ì?—´ Stream?„ mapToInt()ë¡? ê¸°ë³¸?˜• Stream?¸ IntStream?œ¼ë¡? ë³??™˜?•œ?‹¤.
		IntStream intStream1 = 
				Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = 
				Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = 
				Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = 
				Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b) -> a + 1); //count() ?—­?•  ?ˆ˜?–‰
		/* - reduce(ì´ˆê¸°ê°?, BinaryOpperatorê°ì²´)ë©”ì„œ?“œ?Š” ì´ˆê¸°ê°’ì„ 
		   - BinaryOpperatorê°ì²´?˜ ?‘ê°œì˜ ?ŒŒ?¼ë¯¸í„°ì¤? ì²«ë²ˆì§? ?ŒŒ?¼ë¯¸í„°ë¡? ?‚¬?š©?•œ?‹¤.
		     ?‹¤?Œ?—?Š” ë¦¬í„´ê°’ì„ ì´ˆê¸°ê°’ìœ¼ë¡? ?•˜?—¬ ë°˜ë³µ?„ ?•œ?‹¤.
		*/
		int sum = intStream2.reduce(0, (a,b) -> a + b); //sum() ?—­?•  ?ˆ˜?–‰
		
		OptionalInt max = intStream3.reduce(Integer::max);
		//ê°? ?š”?†Œ?˜ ë¬¸ì?—´ ì¤? ê°??¥ ê¸? ë¬¸ì?—´?˜ ë¬¸ì?ˆ˜ 
		OptionalInt min = intStream4.reduce(Integer::min);
		//ê°? ?š”?†Œ?˜ ë¬¸ì?—´ ì¤? ê°??¥ ? ?? ë¬¸ì?—´?˜ ë¬¸ì?ˆ˜ 
		
		System.out.println("count = " + count);
		System.out.println("sum = "  + sum);
		System.out.println("max = " + max.getAsInt());
		//OptionalIntê°ì²´ ?‚¬?š©?‹œ get()?´ ?•„?‹Œ getAsInt()ë¥? ?‚¬?š©?•˜?
		System.out.println("min = " + min.getAsInt());
				
	}
}
