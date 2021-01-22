package day01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution_2 {
	static int t,r,c;
	static int[][] arr;
    
	public static void main(String[] args) throws IOException {
		System.setIn(new FileInputStream("input/input.txt"));
//		Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		t = Integer.parseInt(br.readLine());
		
		String[] data = br.readLine().split(" ");
		
		r = Integer.parseInt(data[0]);
		c = Integer.parseInt(data[1]);
		
		arr = new int[r][c];
		for(int i=0;i<r ;i++) {
			String msg = br.readLine();
			for(int j=0;j<c;j++) {
				arr[i][j] = msg.charAt(j)-'0';
			}
		}
		System.out.printf("%d %n%d %d%n",t,c,r);
		for(int i=0;i<r ;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]); 
			}
			System.out.println();
		}

	}
}

/*
10
5 10
0000000000
0123456789
0000000000
0000000000
0000000000
*/