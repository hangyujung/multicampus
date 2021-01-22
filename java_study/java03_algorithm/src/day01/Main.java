package day01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a[]=new int[9];
		int sum=0;
		Scanner scanner =new Scanner(System.in);
		
		for(int n=0;n<9;n++) {
			a[n]=scanner.nextInt();
			sum+=a[n];
			
		}
		
		for(int i=0;i<8;i++) {
			for(int j=i+1;j<9;j++) {
				if(100==sum-a[i]-a[j]) {
					System.out.println("아닌 난쟁이 : " +a[i]+"\t"+a[j]);
				}
			}
		}
	
	}
}
