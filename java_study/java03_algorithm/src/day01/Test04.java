package day01;

public class Test04 {

	public static void main(String[] args) {
		char[] arr = {'A','B','C','D'};
		
		print(arr,arr.length);
	}

	// num을 2진수로 변환 출력
	public static void print(char[] arr , int n) {
		for (int i = 0; i <(1<<n) ; i++) {
			if(count(i) == 4) {
				System.out.print("{");
				for(int j=0;j<n;j++) {
						if ((i & (1 << j)) != 0)
							System.out.print(arr[j]);
				}
				System.out.println("}");
			}
		}

	}

	// num을 2진수로 표현했을때 1의 갯수 리턴
	public static int count(int num) {
		int count = 0;

		while (num > 0) {
			if ((num & 1) == 1)
				count++;
			num = num >> 1;
		}
		return count;
	}

}
