package day03;

import java.util.Arrays;

public class Test02{
	//static int key = (int)(Math.random()*100+1);
	static String key="goto";
	public static void main(String[] args) {
		String[] arr= {"class","public","static","void","package","goto","switch","do"};
		int N = arr.length;
		Arrays.sort(arr);
		int idx=f(arr,0,arr.length-1);
		System.out.println("찾을 키: "+key);
		System.out.println("찾은 인덱스: "+idx);
		System.out.println("class".charAt(0)<"public".charAt(0));
		
		
	}

	public static int f(String[] arr, int start, int end) {
		int mid = (start+end)/2;
		if(start>end ||end<start) return -1;
		
		if(arr[mid].equals(arr))  return mid;
		
		else if(arr[mid].charAt(0)>key.charAt(0)) {
			return f(arr,start,mid-1);
		}
		else return f(arr,mid+1,end);
		
	}
}
