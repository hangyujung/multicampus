package util;

public class Sort {

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int count = 0;

	//O(n2)
	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minindex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minindex] > arr[j])
					minindex = j;
			}
			if (arr[i] > arr[minindex]) {
				swap(arr, i, minindex);
			    count++;
			}
		}
	}

}
