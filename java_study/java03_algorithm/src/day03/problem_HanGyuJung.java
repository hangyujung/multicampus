package day03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class problem_HanGyuJung {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("input/input.txt"));
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[][] arr=new int[N][N];
		int[][] temp= new int[N/2][N/2];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		square(arr,N);
	}	
	public static void square(int[][]arr,int n,start_x, start_y) {
		if(n>1) {
			for(int i=1;i<4;i++) {
				for()
			}
		}
	}
}
