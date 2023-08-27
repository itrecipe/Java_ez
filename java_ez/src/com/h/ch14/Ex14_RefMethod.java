package com.h.ch14;
//���ܿ���(���翡 ���� ����), ����:566~567p ��������
import java.util.function.*;

/* - ���ٽ��� ���(������)��(��) �ϳ��� �޼��常 ����Ҷ��� �޼��������� �����ϰ� ���ٽ��� �����Ѵ�.
   - ������ ���ÿ��� �����ϰ� ����Ѵ�.
*/
public class Ex14_RefMethod {

	public static void main(String[] args) {
		
		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
		//Function�Լ��� �������̽��� �߻�޼���� R apply(T t);�� �����ϴ� ���ٽ��� ���
		Function<String, Integer> f1 = Integer::parseInt;
		/* - ����� �ϳ��� �޼��常 ����ϹǷ� �޼��� ���������� ���, �Ķ����-> �� �ʿ� ������,
		  	 �޼��� ȣ�⵵ static�޼����Ͻ� "Ŭ������::�޼����" ���·� �����ϰ� ��밡���ϴ�.
		   - �ν��Ͻ��� �޼��带 �ѹ��� ȣ���Ҷ��� "Ŭ������::�޼����" ���� ȣ��
		     (�ν��Ͻ� ��ü�� ���� �޾Ƽ� ó���Ѵ�.)
		*/
		
		BiFunction<Object, String, String> bf = (Object obj, String s) ->
			obj.toString();
		
		/* - BiFunction<Object, String, Integer> bf1 = Object::toString(); //�̰� ��� �ȵǴ� �ڵ� �̷��� �ִ°͸� �˾Ƶ���(����)
		   - �ܺ� ��ü�� �޼��� ȣ��ÿ��� "�ܺΰ�ü��::�ν��Ͻ��޼����;" (�˾Ƶα�!)
		 */

//		//�ܺ� ��ü �̿�
//		Consumer<String> c = s -> System.out.println(s);
//		Consumer<String> c1 = System.out::println;
		
		
		//��� �κ��� new �������϶��� �޼��� ������ �̿밡���ϴ�.
		Supplier<String> sf = () -> new String("abc");
		Supplier<String> sf1 = String::new;
		/* - Supplier�� �߻�޼��尡 T get(); 
		   - �޼��� ������ ������ Ȱ��ÿ��� "Ŭ������::new;" ���·� ����Ѵ�.
		*/	
	}
}