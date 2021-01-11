package com.mulcam.control;

public class ifElseTest2 {
	public static void main(String[] args) {
		int score = 45;
	
		if(score>=90) System.out.print("A");
		else if(score>=80) System.out.print("B");
		else if(score>=70) System.out.print("C");
		else System.out.print("F");
		if(score%10>5 || score ==100 &&score>=70) System.out.print("+");  //and 가 or 보다 우선순위가 높음(헷갈리면 괄호사용)
			
		
	}
}
