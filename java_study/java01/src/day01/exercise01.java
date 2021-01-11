package day01;

public class exercise01 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50}; 
		int sum=0;
		for(int part : arr) {
			sum+=part;
		}
		// TODO arr 배열 에 담긴 모든 값을 더하는 프로그램을 완성
		
		System.out.println("sum="+sum);
	}
}
