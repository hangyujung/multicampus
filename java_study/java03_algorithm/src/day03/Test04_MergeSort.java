package day03;

public class Test04_MergeSort {
	static int[] temp = null;
	public static void main(String[] args) {
		int[] arr = {63,23,51,84,26,85,34};
		int N=arr.length;
		temp =new int[N];
		mergeSort(arr,0,N-1);
	}
	
	public static void mergeSort(int[] arr, int start, int end) {
		if(start>=end) return;
		int mid = arr.length;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		
	}
}
