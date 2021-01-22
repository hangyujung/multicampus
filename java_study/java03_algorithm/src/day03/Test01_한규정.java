package day03;

public class Test01_한규정 {
	//static int key = (int)(Math.random()*100+1);
	static int key =10;
	public static void main(String[] args) {
		int[] arr = {4,6,9,11,55,77,78,79,80,85,88,99,100};
		int N = arr.length;
		
		int idx=f(arr,0,arr.length-1);
		System.out.println("찾을 키: "+key);
		System.out.println("찾은 인덱스: "+idx);
		
	}

	public static int f(int[] arr, int start, int end) {
		int mid = (start+end)/2;
		if(start==end)return -1;
		
		if(arr[mid]==key)  return mid;
		else if(arr[mid]>key) {
			return f(arr,start,mid-1);
		}
		else return f(arr,mid+1,end);
		
	}
}
