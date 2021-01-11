package day01;

public class exercise02 {
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		int count=0;
		while(Math.abs(sum)<100) {
			i+=1;
			if((count%2)==0) {
				sum+=i;
			}
			else {
				i=i*(-1);
				sum+=i;
			}
			count++;
		}
		System.out.println(count);
	}
}
