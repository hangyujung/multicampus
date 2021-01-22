package day01;

import java.util.Arrays;
import java.util.stream.Stream;

import util.Sort;

public class Test02_sort {

	public static void main(String[] args) {
		
		int[] arr = new int[10000];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int) (Math.random()*10000);
		}
		
		long start = 0;
		long end = 0;
    
		start = System.currentTimeMillis();
		util.Sort.selectionSort(arr);
		end = System.currentTimeMillis();
		
		System.out.printf("selectionSort 수행 시간  %d ms ",end-start);
		
//		System.out.println(Sort.count);
	
		System.out.println("--- end ---");
	}

}
