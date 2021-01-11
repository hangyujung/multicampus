package com.mulcam.control;

public class Gugudan {
	public static void main(String[] args) {
//		for (int j =1; j<10;j++) {
//			for(int i=2; i<10;i++) {
//				System.out.print(i + " * "+  j+ "= "+i*j+"\t\t\t");
//			}
//			System.out.print("\n");
//		}
		int i=2;
		
		while (i<10) {
			int j=1;
			while(j<10){
				System.out.print(i+" * "+j+" = "+ i*j +"\t");
				j+=1;
			}
			System.out.println("");
			i +=1;
		}
	}
}
