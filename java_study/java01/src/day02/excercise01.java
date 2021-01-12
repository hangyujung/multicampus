package day02;

public class excercise01 {
	public static void main(String[] args) {
		int[] nums=new int[] {7,5,9,3,10};
		int[] sol=sort_gyu(nums);
		for(int g : sol) {
			System.out.println(g);
		}
	}
	
	static int[] sort_gyu(int[] num) {
		for(int i=0;i<num.length-1;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		return num;
	}
}