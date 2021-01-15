package day05.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test05_forEach {
	public static void main(String[] args) {
		//SE 8 = JDK 1.8 부터 forEach 사용가능
	
		String[] s1 = {"홍길동","kim",null,"고길동","lee",null,null,"박길동"};
		List<String> list =new ArrayList<String>(Arrays.asList(s1));
//		System.out.println(list);
		
		list.forEach(i->System.out.print(i+" "));
		System.out.println("---------------------------------");
		list.removeIf(i->i==null);
		System.out.println("=------------------------");
		list.forEach(a->System.out.print(a.charAt(0)+"**"));
		
	}
}
