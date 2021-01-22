package day01;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test01 {
	public static void main(String[] args) {
		char[][] c = new char[7][];
		
		for(int i=0;i<c.length;i++) {
			c[i] = new char[i+1];
			for(int j=0;j<i+1;j++) {
				c[i][j] = '*';
			}
		}

		System.out.println("-----");
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}
		System.out.println("-----");
		
		for(int i=0;i<c.length;i++) {
			Stream.of(c[i]).forEach(t->System.out.print(t));
			System.out.println();
		}
		System.out.println("--  333 ---");

		Stream.of(c).forEach(q -> {
			Stream.of(q).forEach(t->System.out.print(t));
//			Stream.of(q).forEach(t->System.out.print(Arrays.toString(t)));
			System.out.println();
		});
		
	}
}




