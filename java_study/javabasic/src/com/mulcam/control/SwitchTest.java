package com.mulcam.control;

public class SwitchTest {
	public static void main(String[] args) {
		int score =99;
		String grade ="F";
		switch(score) {
		case 99:{
			System.out.println("ㅇㅇF찍음");break;
		}
		}
	
		System.out.println("점수가 "+score+ "점이므로 "+grade +"학점입니다.");
	
	
	

		String s = "a";  //jdk 7 (1.7) 이상에서만 문자열로 비교가능
		switch(s) {
			case "a": System.out.println("문자열 a입니다.");break;
			default : System.out.println("문자열 a 아니얌");break;
		}
	
	}
}
//크다 작다 비교 안됨, 같다 비교만 됨 
//string c = 'a'
//switch(c)//작은거를 큰거로 넣는것은 자동으로 형변환 해줌
//문자열 에 문자열 더할수 있음 ,,,  String grade = "A";    grade+="+";     <<  A+가 담긴다.

