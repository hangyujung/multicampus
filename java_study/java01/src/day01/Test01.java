package day01;
import java.util.Date;     //이걸쓰면 java.util.을 생략가능해진다.


public class Test01 {
	//클래스의 구성요소
	//데이터( 변수 ) +기능(함수, 메소드)
	public static void main(String[] args) { //new 라는 연산자 안써도 메모리에 올림
		// TODO Auto-generated method stub
		int num1=100;
		int num2=100;
		
		java.lang.String s1 = new String("java");  //java.lang 패키지만 기본으로 사용가능
		String s2 = new String("java");
		
		String s3="java";
		String s4="java";
		
		System.out.println(num1==num2);
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		System.out.println(s1.equals(s2));  //레퍼런싱하는곳에 값을 비교함 : equals()
		System.out.println(s3.equals(s4));
		
		Date d1 = new Date();  //힙에 d1이 상주되고  메모리에는 d1에 값들이 상주됨
		System.out.println(d1);
		java.sql.Date d2 = new java.sql.Date(System.currentTimeMillis());   //이름똑같은 Date를 두번 임포트할순없어서 걍 사용
		System.out.println(d2);
		return;
	}

}
