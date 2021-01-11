package day01;

import java.util.Arrays;

public class Test07 {
	public static void main(String[] args) {
	int[] num = new int[5];
	System.out.println(Arrays.toString(num));

	//String[] name= new String[]{"홍길동","이길동","삼길동","사길동","오길동"};  //new String[] 은 보통 생략가능
	String[] name= {"홍길동","이길동","삼길동","사길동","오길동"}; 
	//name = new String[]{"홍길동","이길동","삼길동","사길동","오길동"};  , 그냥 name={" ,,,," } 이렇게 데이터 집어넣으면 안됨
	
	for(String find : name) {
		if(find.equals("오길동")) {
			System.out.println("찾았음");
		}
	}
	System.out.println(Arrays.toString(name));
	
	System.out.println();
	
	}
}
