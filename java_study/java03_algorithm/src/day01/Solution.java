package day01;

import java.util.Scanner;

public class Solution {
	public static void main(String args[]) throws Exception	{
		//System.setIn(new FileInputStream("input/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=1;i<=T;i++) {
			int sum = 0;
			for(int j=0;j<10;j++) {
				int data = sc.nextInt();
				if(data % 2 == 1) sum += data;
			}
			
			System.out.printf("#%d %d%n",i,sum);
		}
		

	}
}

/*
3
3 17 1 39 8 41 2 32 99 2
22 8 5 123 7 2 63 7 3 46
6 63 2 3 58 76 21 33 8 1   
*/