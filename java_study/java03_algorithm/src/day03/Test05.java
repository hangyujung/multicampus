package day03;


public class Test05 {
	public static void main(String[] args) {
		int[] arr = {3, 2, 1, 6, 9, 4, 8 ,7 ,5};
		int N=arr.length;
		quickSort(arr, 0, N-1);
	}
	public static void quickSort(int[] arr, int start, int end) {
		int i=1;int j=arr.length-1;
		int pivot= arr[0];
		int[] temp=new int[arr.length];
		while(i!=j) {
			if(pivot<arr[i]) {
				temp[j]=arr[i];
				j--;
			}
			else if(pivot > arr[i]) {
				temp[i]=arr[i];
				i++;
				System.out.println(i);
			}
		}
		util.Sort.swap(arr, pivot, j);
		
		for(int data:temp) {
			System.out.print(data);
		}
	}
}
