package com.h.ch14;
import java.util.*;

/* - OptionalŬ���� ���
   - Optional<T>�� ���� Ŭ������ ��� ��ü�� ���Ѵ�.(��簴ü�� ���� �����ϴٴ� �ǹ�)
   - Optional�� ����ϸ� nulló���� if�� ���� Optional�� �޼���� ������ ó��
   - Streamó�� ����
*/
public class Ex14_08 {

	public static void main(String[] args) {
		Optional<String> optStr = Optional.of("abcde");
		Optional<Integer> optInt = optStr.map(String::length);
		
		//Optional�� ����� ���� get()���� ���ϳ� nullüũ�� �������� �ʴ´�.
		System.out.println("optStr = " + optStr.get());
		System.out.println("optInt = " + optInt.get());
		
		Optional<String> optStr1 = null;
		/* - System.out.println("optStr1 = " + optStr1.get());
		   - optstr1�� null�̹Ƿ� get() ���� ���ܰ� �߻��Ѵ�.
		*/
		
		int result1 = Optional.of("123")
				.filter(x -> x.length() > 0)
				.map(Integer::parseInt)
				.get();
		System.out.println("result = " + result1);
		
		OptionalInt optInt1 = OptionalInt.of(0);
		// ������ Optional��ü�� OptionalInt�� 0�� ����
		OptionalInt optInt2 = OptionalInt.empty();
		// �� ��ü�� ����, ���� getAsInt()�� ��ȯ �� ���ܰ� �߻��Ѵ�.
		System.out.println(optInt1.getAsInt()); //0
		// OptionalInt������ get()��� getAsInt()
		/* - System.out.println(optInt2.getAsInt());
		   - optInt2�� empty�� null�̹Ƿ� NoSuchElementException ���� �߻�
		*/
		
		System.out.println("optInt1 = " + optInt1);
		System.out.println("optInt2 = " + optInt2);
		
		System.out.println("optInt1.equals(optInt2)? "
				+ optInt1.equals(optInt2));
		
	}
}