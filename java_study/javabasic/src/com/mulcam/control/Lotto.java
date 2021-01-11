package com.mulcam.control;

public class Lotto {
	public static void main(String[] args) {
		
		int num1=0;int num2=0;	int num3=0;
		while((num1==num2) || (num2==num3) || (num1==num3)) {
		num1 = (int)(Math.random()*45+1);
		num2 = (int)(Math.random()*45+1);
		num3 = (int)(Math.random()*45+1);
		}
		System.out.println(num1 + "\t"+num2 + "\t"+num3  );
		
	}
}
