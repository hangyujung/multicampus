package day01;

public class Test03 {

	public static void main(String[] args) {
		
		for(int i=0; i<(1<<5) ;i++) {
			System.out.print(i+" => ");
			print(i);
			System.out.println("=>"+count(i));
		}
	}

	//num을 2진수로 변환 출력 
	public static void print(int num) {
		for(int i=7;i>=0;i--) {
			if((num & (1<<i)) != 0) System.out.print("1");
			else System.out.print("0");
		}
		
	}
	
	//num을 2진수로 표현했을때 1의 갯수 리턴
	public static int count(int num) {
		int count = 0;
		
		while(num > 0) {
			if((num & 1) == 1) count++;
			num = num >> 1;
		}
		return count;
	
	}
	
}






