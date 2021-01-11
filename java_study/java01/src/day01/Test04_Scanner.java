package day01;

import java.util.Scanner;

public class Test04_Scanner {
	public static void main(String[] args) {
		System.out.println();
		//System.in 은 키보드로 부터 시스템에 집어넣는 것
		Scanner scanner = new Scanner(System.in); //키보드로부터 받는 객체  java.util.Scanner 활용
		System.out.println("계속 진행하려면 yes를 입력하세요!");
		String msg = scanner.nextLine();//한줄을 읽는다
		
		System.out.println(msg);
		
		System.out.println("국어 영어 수학 성적을 입력하세요 예)100 70 80");
		int ko = scanner.nextInt(); //90
		int eng = scanner.nextInt(); //90
		int math = scanner.nextInt();// 80 하고 뒤에 엔터표시가 이름에 들어감 --> 따라서 소진해야함
		scanner.nextLine();
		//scanner에 관련된 api들도 알아보자
 
		System.out.println("이름을 입력하세여!");
		String name = scanner.nextLine();
		
		System.out.println("국어 : "+ko+" 영어 : "+eng+" 수학 : "+math);
		scanner.close(); //자원 반납  //여기까지는 필수 ,
		scanner = null ; //주소의 값을 없앤다 ,가비지의 대상임을 알려주는것 --> 리크 방지
	}
}
